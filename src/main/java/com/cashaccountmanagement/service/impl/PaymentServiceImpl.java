package com.cashaccountmanagement.service.impl;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.client.FabrickClient;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountResponse;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferDTO;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferResponse;
import com.cashaccountmanagement.config.properties.AuthProperties;
import com.cashaccountmanagement.mapper.PaymentMapper;
import com.cashaccountmanagement.model.MoneyTransferModel;
import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;
import com.cashaccountmanagement.repository.TransactionRepository;
import com.cashaccountmanagement.service.AccountService;
import com.cashaccountmanagement.service.PaymentService;
import com.shared.library.model.dto.MoneyTransferException;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private FabrickClient fabrickClient;

    @Autowired
    private PaymentMapper paymentMapper;

    @Autowired
    private AuthProperties authProperties;

    @Autowired
    private AccountService accountService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public CreateMoneyTransferResource createMoneyTransfer(MoneyTransferModel moneyTransferModel) {
        AccountResource accountInfo = accountService.getAccount(String.valueOf(moneyTransferModel.getAccountId()));
        CreateMoneyTransferResource createMoneyTransferResource = new CreateMoneyTransferResource();
        MoneyTransferResponse moneyTransfer;
        try{
            MoneyTransferDTO moneyTransferDTO = paymentMapper.inputModelToDTOOutput(moneyTransferModel, accountInfo);
            moneyTransfer = fabrickClient.createMoneyTransfer(moneyTransferModel.getAccountId(), moneyTransferDTO,authProperties.getAuthSchema(),  authProperties.getApiKey());
       }
        catch (Exception e){
                throw new MoneyTransferException("API000", "Errore tecnico  La condizione BP049 non e' prevista per il conto id ".concat(String.valueOf(moneyTransferModel.getAccountId())));
         }
        if(ObjectUtils.isEmpty(moneyTransfer) || ObjectUtils.isEmpty(moneyTransfer.getPayload())){
            logger.error("money transfer not found with input {}", moneyTransferModel.getAccountId());
            throw new MoneyTransferException(HttpStatus.NOT_FOUND.toString(), "money transfer not found with input with input => ".concat(String.valueOf(moneyTransferModel.getAccountId())));
        }
        createMoneyTransferResource.setStatus(moneyTransfer.getPayload().getStatus());
        return createMoneyTransferResource;
    }


}
