package com.cashaccountmanagement.service;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.client.FabrickClient;
import com.cashaccountmanagement.client.fabrick.model.v1.*;
import com.cashaccountmanagement.config.properties.AuthProperties;
import com.cashaccountmanagement.mapper.AccountMapper;
import com.cashaccountmanagement.model.TransactionModel;
import com.cashaccountmanagement.repository.TransactionRepository;
import com.cashaccountmanagement.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {


    @InjectMocks
    private AccountServiceImpl accountService;

    @Mock
    private FabrickClient fabrickClient;

    @Mock
    private AccountMapper accountMapper;

    @Mock
    private AuthProperties authProperties;

    @Mock
    private TransactionRepository transactionRepository;

    @Test
    void getAccount_OK(){
        AccountResponse account = getAccountMock();
        when(fabrickClient.getAccount(anyString(),any(),any())).thenReturn(account);
        when(accountMapper.outputModelToResource(account.getPayload())).thenReturn(getAccountResourceMock());

        AccountResource accountResponse = accountService.getAccount("1111");
        assertEquals("1111", accountResponse.getAccountId());
        assertEquals("account", accountResponse.getAccount());
    }

    @Test
    void getAccount_KO(){
        when(fabrickClient.getAccount(anyString(),any(),any())).thenReturn(new AccountResponse());
        assertThrows(ResponseStatusException.class, () -> accountService.getAccount("11"));
    }


    @Test
    void getAccountTransactions_OK(){
        TransactionsResponse transactionsMock = getTransactionsMock();
        when(fabrickClient.getAccountTransactions(any(),any(), any(),any(),any())).thenReturn(transactionsMock);
        when(accountMapper.outputModelToResource(transactionsMock.getPayload())).thenReturn(getTransactionsResourceMock());

        AccountResponse account = getAccountMock();
        when(fabrickClient.getAccount(anyString(),any(),any())).thenReturn(account);
        when(accountMapper.outputModelToResource(account.getPayload())).thenReturn(getAccountResourceMock());

        List<com.cashaccountmanagement.entity.Transaction> entities = new ArrayList<>();
        com.cashaccountmanagement.entity.Transaction entity = new com.cashaccountmanagement.entity.Transaction();
        entity.setId(111L);
        entity.setAmount(6000.00);
        entities.add(entity);
        when(accountMapper.outputModelToEntity(any(), any())).thenReturn(entities);

        TransactionsResource transactionsResource = accountService.getAccountTransactions(getTransactionModelMock());
        assertEquals(1, transactionsResource.getTransactions().size());
        assertEquals("1123", transactionsResource.getTransactions().get(0).getTransactionId());
    }


    @Test
    void getAccountTransactions_KO(){
        when(fabrickClient.getAccountTransactions(any(),any(), any(),any(),any())).thenReturn(null);
        assertThrows(ResponseStatusException.class, () -> accountService.getAccountTransactions(getTransactionModelMock()));
    }


    private TransactionsResource getTransactionsResourceMock() {
        TransactionsResource transactions = new TransactionsResource();
        TransactionResource transaction = new TransactionResource();
        transaction.setTransactionId("1123");
        transaction.setCurrency("EUR");
        transactions.addTransactionsItem(transaction);
        return transactions;
    }

    private TransactionModel getTransactionModelMock() {
        TransactionModel transactionModel = new TransactionModel();
        transactionModel.setAccountId("1111");
        transactionModel.setFromAccountingDate(LocalDate.now());
        transactionModel.setToAccountingDate(LocalDate.now());

        return transactionModel;
    }

    @NotNull
    private TransactionsResponse getTransactionsMock () {
        TransactionsResponse transactions = new TransactionsResponse();
        Transaction transaction = new Transaction();
        transaction.setTransactionId("1123");
        transaction.setCurrency("EUR");
        List<Transaction> payload = new ArrayList<>();
        payload.add(transaction);
        TransactionsResponsePayload transactionsResponsePayload = new TransactionsResponsePayload();
        transactionsResponsePayload.setList(payload);
        transactions.setPayload(transactionsResponsePayload);
        return transactions;
    }


    @NotNull
    private AccountResponse getAccountMock() {
        AccountResponse accountResponse = new AccountResponse();
        AccountPayload accountPayload = new AccountPayload();
        accountPayload.setAccount("account");
        accountPayload.setAbiCode("abiCode");
        accountPayload.setCabCode("cabCode");
        accountPayload.setAccountId("1111");

        accountResponse.setPayload(accountPayload);
        return accountResponse;
    }

    @NotNull
    private AccountResource getAccountResourceMock() {
        AccountResource accountResourceMock = new AccountResource();
        accountResourceMock.setAccount("account");
        accountResourceMock.setAccountId("1111");
        return accountResourceMock;
    }

}
