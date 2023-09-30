package com.cashaccountmanagement.controller;


import com.cashaccountmanagement.mapper.PaymentMapper;
import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;
import com.cashaccountmanagement.service.AccountService;
import com.cashaccountmanagement.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = PaymentController.class, excludeAutoConfiguration = {SecurityAutoConfiguration.class})
public class PaymentControllerTest {


    @Autowired
    private MockMvc mvc;

    @MockBean
    private PaymentService paymentService;

    @MockBean
    private PaymentMapper paymentMapper;


    @MockBean
    private AccountService accountService;


    @Test
    public void testCreateMoneyTransfer_Success() throws Exception {
        when(paymentService.createMoneyTransfer(any())).thenReturn(new CreateMoneyTransferResource());
        String jsonData = "{" +
                "\"creditor\": {" +
                "    \"name\": \"LUCA TERRIBILE\"," +
                "    \"account\": {" +
                "        \"accountCode\": \"IT40L0326822311052923800661\"," +
                "        \"bicCode\": \"\"" +
                "    }" +
                "}," +
                "\"executionDate\": \"2019-04-01\"," +
                "\"description\": \"prova bonifico\"," +
                "\"amount\": 800," +
                "\"currency\": \"EUR\"" +
                "}";

        mvc.perform(post("/payment/1111/money-transfers")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonData))
                .andExpect(status().isOk());

    }
}