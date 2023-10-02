package com.cashaccountmanagement.service;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.client.FabrickClient;
import com.cashaccountmanagement.client.fabrick.model.v1.*;
import com.cashaccountmanagement.config.properties.AuthProperties;
import com.cashaccountmanagement.mapper.PaymentMapper;
import com.cashaccountmanagement.model.MoneyTransferModel;
import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;
import com.cashaccountmanagement.service.impl.PaymentServiceImpl;
import com.shared.library.model.dto.MoneyTransferException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PaymentServiceTest {

    @InjectMocks
    private PaymentServiceImpl paymentService;

    @Mock
    private AccountService accountService;

    @Mock
    private PaymentMapper paymentMapper;

    @Mock
    private FabrickClient fabrickClient;

    @Mock
    private AuthProperties authProperties;


    @Test
    public void testCreateMoneyTransfer_Success() {
        MoneyTransferModel moneyTransferModel = new MoneyTransferModel();
        moneyTransferModel.setAccountId(123L);
        //when(accountService.getAccount(anyString())).thenReturn(new AccountResource());

        AccountResource accountInfo = new AccountResource();
        accountInfo.setIban("11111");
        when(accountService.getAccount(anyString())).thenReturn(accountInfo);
        when(paymentMapper.inputModelToDTOOutput(any(), any())).thenReturn(new MoneyTransferDTO());
        MoneyTransferResponse mockResponse = new MoneyTransferResponse();
        MoneyTransferPayload payload = new MoneyTransferPayload();
        payload.setStatus("SUCCESS");
        mockResponse.setPayload(payload);
        when(fabrickClient.createMoneyTransfer(any(), any(), any(), any())).thenReturn(mockResponse);

        CreateMoneyTransferResource result = paymentService.createMoneyTransfer(moneyTransferModel);

        assertEquals("SUCCESS", result.getStatus());
    }

    @Test
    public void testCreateMoneyTransfer_NotFound() {
        AccountResource accountInfo = new AccountResource();
        accountInfo.setIban("11111");
        when(accountService.getAccount(anyString())).thenReturn(accountInfo);

        MoneyTransferModel moneyTransferModel = new MoneyTransferModel();
        moneyTransferModel.setAccountId(123L);

       // when(accountService.getAccount(anyString())).thenReturn(new AccountResource());
        when(paymentMapper.inputModelToDTOOutput( any(), any())).thenReturn(new MoneyTransferDTO());
        MoneyTransferResponse mockResponse = new MoneyTransferResponse();
        when(fabrickClient.createMoneyTransfer(any(), any(), any(), any())).thenReturn(mockResponse);

        assertThrows(MoneyTransferException.class, () -> {
            paymentService.createMoneyTransfer(moneyTransferModel);
        });
    }
}
