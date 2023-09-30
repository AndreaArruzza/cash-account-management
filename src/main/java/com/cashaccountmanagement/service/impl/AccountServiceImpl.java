package com.cashaccountmanagement.service.impl;


import com.cashaccountmanagement.client.FabrickClient;
import com.cashaccountmanagement.client.fabrick.model.v1.Account;
import com.cashaccountmanagement.client.fabrick.model.v1.Transactions;
import com.cashaccountmanagement.mapper.AccountMapper;
import com.cashaccountmanagement.model.TransactionModel;
import com.cashaccountmanagement.service.AccountService;
import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private FabrickClient fabrickClient;

    @Value("${auth.auth-schema}")
    private String authSchema;

    @Value("${auth.api-key}")
    private String apiKey;

    @Autowired
    private AccountMapper accountMapper;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public AccountResource getAccount(String accountId) {
        long start = System.currentTimeMillis();
        logger.info("call getAccount service... account ====> {}", accountId);
        Account account = fabrickClient.getAccount(accountId, authSchema, apiKey);
        if(ObjectUtils.isEmpty(account)){
            logger.error("no account found for id {}", accountId);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no account found for id = ".concat(accountId));
        }
        logger.info("end get account servce ===> {}ms with response ====> {}", System.currentTimeMillis() - start, account);
        return accountMapper.outputModelToResource(account);
    }

    @Override
    public TransactionsResource getAccountTransactions(TransactionModel transactionModel) {
        long start = System.currentTimeMillis();
        logger.info("call getAccount service... transactionModel ====> {}", transactionModel);
        Transactions accountTransactions = fabrickClient.getAccountTransactions(transactionModel.getAccountId(),
                                                                                transactionModel.getFromAccountingDate(),
                                                                                transactionModel.getFromAccountingDate(),
                                                                                authSchema, apiKey);
        if(ObjectUtils.isEmpty(accountTransactions) || CollectionUtils.isEmpty(accountTransactions.getTransactions())){
            logger.error("no transaction found for input {}", transactionModel);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"no transaction found");
        }
        logger.info("end get account servce ===> {}ms with response ====> {}", System.currentTimeMillis() - start, accountTransactions);
        return accountMapper.outputModelToResource(accountTransactions);
    }
}
