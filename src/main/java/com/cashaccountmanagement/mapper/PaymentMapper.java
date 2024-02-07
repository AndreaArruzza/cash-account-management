package com.cashaccountmanagement.mapper;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountMoneyTransfer;
import com.cashaccountmanagement.client.fabrick.model.v1.Creditor;
import com.cashaccountmanagement.model.MoneyTransferModel;
import com.cashaccountmanagement.payment.model.v1.MoneyTransferDTO;
import org.mapstruct.Mapper;

import javax.validation.constraints.NotNull;

@Mapper(componentModel =  "spring")
public interface PaymentMapper {
    MoneyTransferModel dtoToInputModel(String accountId, MoneyTransferDTO moneyTransferDTO);


    @NotNull
    default  com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferDTO inputModelToDTOOutput(MoneyTransferModel moneyTransferModel, AccountResource accountInfo) {
        com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferDTO moneyTransferDTO = new com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferDTO();
        Creditor creditor = new Creditor();
        AccountMoneyTransfer account = new AccountMoneyTransfer();
        account.setAccountCode(accountInfo.getIban());
        creditor.setAccount(account);
        creditor.setName(moneyTransferModel.getReceiverName());
        moneyTransferDTO.setCreditor(creditor);

        moneyTransferDTO.setExecutionDate(moneyTransferDTO.getExecutionDate());
        moneyTransferDTO.setAmount(moneyTransferDTO.getAmount());
        moneyTransferDTO.setCurrency(moneyTransferDTO.getCurrency());
        return moneyTransferDTO;
    }
}
