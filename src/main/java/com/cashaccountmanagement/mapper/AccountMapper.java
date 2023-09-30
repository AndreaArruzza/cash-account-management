package com.cashaccountmanagement.mapper;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountPayload;
import com.cashaccountmanagement.client.fabrick.model.v1.TransactionsResponse;
import com.cashaccountmanagement.model.TransactionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;

@Mapper(componentModel =  "spring")
public interface AccountMapper {

    AccountResource outputModelToResource(AccountPayload account);

    TransactionModel dtoToInputModel(String accountId, LocalDate fromAccountingDate, LocalDate toAccountingDate);

    @Mapping(target = "transactions" , source = "payload")
    TransactionsResource outputModelToResource(TransactionsResponse transactions);
}
