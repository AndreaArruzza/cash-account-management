package com.cashaccountmanagement.service;


import com.cashaccountmanagement.model.TransactionModel;
import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;

public interface AccountService {

    AccountResource getAccount(String accountId);

    TransactionsResource getAccountTransactions(TransactionModel transactionModel);
}
