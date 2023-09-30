package com.cashaccountmanagement.service;

import com.cashaccountmanagement.model.MoneyTransferModel;
import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;

public interface PaymentService {

    CreateMoneyTransferResource createMoneyTransfer(MoneyTransferModel moneyTransferModel);
}
