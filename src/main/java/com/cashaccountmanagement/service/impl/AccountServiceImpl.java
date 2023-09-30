package com.cashaccountmanagement.service.impl;


import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.client.FabrickClient;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountResponse;
import com.cashaccountmanagement.client.fabrick.model.v1.TransactionsResponse;
import com.cashaccountmanagement.config.properties.AuthProperties;
import com.cashaccountmanagement.mapper.AccountMapper;
import com.cashaccountmanagement.model.TransactionModel;
import com.cashaccountmanagement.service.AccountService;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ResponseStatusException;

import java.time.format.DateTimeFormatter;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private FabrickClient fabrickClient;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private AuthProperties authProperties;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public AccountResource getAccount(String accountId) {
        long start = System.currentTimeMillis();
        logger.info("call getAccount service... account ====> {}", accountId);
       AccountResponse account = fabrickClient.getAccount(accountId, authProperties.getAuthSchema(), authProperties.getApiKey());
        if(ObjectUtils.isEmpty(account) || ObjectUtils.isEmpty(account.getPayload())) {
            logger.error("no account found for id {}", accountId);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no account found for id = ".concat(accountId));
        }
        logger.info("end get account service ===> {}ms with response ====> {}", System.currentTimeMillis() - start, account);
        return accountMapper.outputModelToResource(account.getPayload());
    }

    @Override
    public TransactionsResource getAccountTransactions(TransactionModel transactionModel) {
        long start = System.currentTimeMillis();
        logger.info("call getAccount service... transactionModel ====> {}", transactionModel);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        TransactionsResponse accountTransactions = fabrickClient.getAccountTransactions(transactionModel.getAccountId(),
                                                                                transactionModel.getFromAccountingDate().format(dateTimeFormatter),
                                                                                transactionModel.getToAccountingDate().format(dateTimeFormatter),
                                                                                authProperties.getAuthSchema(),authProperties.getApiKey());
        if(ObjectUtils.isEmpty(accountTransactions) || CollectionUtils.isEmpty(accountTransactions.getPayload())){
            logger.error("no transaction found for input {}", transactionModel);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no transaction found");
        }
        logger.info("end get account service ===> {}ms with response ====> {}", System.currentTimeMillis() - start, accountTransactions);
        return accountMapper.outputModelToResource(accountTransactions);
    }
}
