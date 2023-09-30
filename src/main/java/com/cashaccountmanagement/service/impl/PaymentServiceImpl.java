package com.cashaccountmanagement.service.impl;

import com.cashaccountmanagement.model.MoneyTransferModel;
import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;
import com.cashaccountmanagement.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Override
    public CreateMoneyTransferResource createMoneyTransfer(MoneyTransferModel moneyTransferModel) {
        return null;
    }
}
