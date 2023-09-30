package com.cashaccountmanagement.service;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.client.FabrickClient;
import com.cashaccountmanagement.client.fabrick.model.v1.Account;
import com.cashaccountmanagement.client.fabrick.model.v1.Transaction;
import com.cashaccountmanagement.client.fabrick.model.v1.Transactions;
import com.cashaccountmanagement.mapper.AccountMapper;
import com.cashaccountmanagement.model.TransactionModel;
import com.cashaccountmanagement.service.impl.AccountServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {


    @InjectMocks
    private AccountServiceImpl accountService;

    @Mock
    private FabrickClient fabrickClient;

    @Mock
    private AccountMapper accountMapper;

    @Test
    void getAccount_OK(){
        Account account = getAccountMock();
        when(fabrickClient.getAccount(anyString(),any(),any())).thenReturn(account);
        when(accountMapper.outputModelToResource(account)).thenReturn(getAccountResourceMock());

        AccountResource accountResponse = accountService.getAccount("1111");
        assertEquals("1111", accountResponse.getAccountId());
        assertEquals("account", accountResponse.getAccount());
    }

    @Test
    void getAccount_KO(){
        when(fabrickClient.getAccount(anyString(),any(),any())).thenReturn(null);
        assertThrows(ResponseStatusException.class, () -> accountService.getAccount("11"));
    }


    @Test
    void getAccountTransactions_OK(){
        Transactions transactionsMock = getTransactionsMock();
        when(fabrickClient.getAccountTransactions(any(),any(), any(),any(),any())).thenReturn(transactionsMock);
        when(accountMapper.outputModelToResource(transactionsMock)).thenReturn(getTransactionsResourceMock());

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
    private Transactions getTransactionsMock () {
        Transactions transactions = new Transactions();
        Transaction transaction = new Transaction();
        transaction.setTransactionId("1123");
        transaction.setCurrency("EUR");
        transactions.addTransactionsItem(transaction);
        return transactions;
    }


    @NotNull
    private Account getAccountMock() {
        Account account = new Account();
        account.setAccount("account");
        account.setAbiCode("abiCode");
        account.setCabCode("cabCode");
        account.setAccountId("1111");
        return account;
    }

    @NotNull
    private AccountResource getAccountResourceMock() {
        AccountResource accountResourceMock = new AccountResource();
        accountResourceMock.setAccount("account");
        accountResourceMock.setAccountId("1111");
        return accountResourceMock;
    }

}
