package com.cashaccountmanagement.controller;

import com.cashaccountmanagement.mapper.AccountMapper;
import com.cashaccountmanagement.account.api.v1.AccountApi;
import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.service.AccountService;
import com.cashaccountmanagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class AccountController implements AccountApi {

    @Autowired
    private AccountService accountService;

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public ResponseEntity<AccountResource> getAccount(String accountId) {
        return ResponseEntity.ok(accountService.getAccount(accountId));
    }

    @Override
    public ResponseEntity<TransactionsResource> getAccountTransactions(String accountId, LocalDate fromAccountingDate, LocalDate toAccountingDate) {
        return ResponseEntity.ok(accountService.getAccountTransactions(accountMapper.dtoToInputModel(accountId,fromAccountingDate,toAccountingDate)));
    }
}
