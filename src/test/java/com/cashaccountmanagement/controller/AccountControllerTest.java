package com.cashaccountmanagement.controller;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.mapper.AccountMapper;
import com.cashaccountmanagement.service.AccountService;
import com.cashaccountmanagement.service.impl.PaymentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = AccountController.class, excludeAutoConfiguration = {SecurityAutoConfiguration.class})
public class AccountControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AccountService accountService;

    @MockBean
    private AccountMapper AccountMapper;

    @MockBean
    private PaymentServiceImpl paymentService;

    @Test
    public void getAccount() throws Exception
    {
        AccountResource account = new AccountResource();
        account.setAccountId("1111");
        when(accountService.getAccount(anyString())).thenReturn(account);

        mvc.perform(MockMvcRequestBuilders
                        .get("/account/1111")
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("1111")));
    }

    @Test
    public void getAccountTransactions() throws Exception
    {
        TransactionsResource resource = new TransactionsResource();
        List<TransactionResource> transactions = new ArrayList<>();
        TransactionResource transaction = new TransactionResource();
        transactions.add(transaction);
        resource.setTransactions(transactions);
        when(accountService.getAccountTransactions(any())).thenReturn(resource);

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders
                .get("/account/1111/transactions?fromAccountingDate=2021-09-30&toAccountingDate=2021-09-30")
                .accept(MediaType.APPLICATION_JSON)).andReturn();

        assertEquals(200, mvcResult.getResponse().getStatus());
    }
}
