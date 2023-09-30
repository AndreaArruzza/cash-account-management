package com.cashaccountmanagement.controller;

import com.cashaccountmanagement.payment.api.v1.PaymentApi;
import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;
import com.cashaccountmanagement.payment.model.v1.MoneyTransferDTO;
import com.cashaccountmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements PaymentApi {

    @Autowired
    private PaymentService paymentService;

    @Override
    public ResponseEntity<CreateMoneyTransferResource> createMoneyTransfer(String accountId, MoneyTransferDTO moneyTransferDTO) {
        return null;
    }
}
