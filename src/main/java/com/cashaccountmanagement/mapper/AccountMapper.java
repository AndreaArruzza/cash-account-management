package com.cashaccountmanagement.mapper;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountPayload;
import com.cashaccountmanagement.client.fabrick.model.v1.Transactions;
import com.cashaccountmanagement.model.TransactionModel;
import org.mapstruct.Mapper;

import java.time.LocalDate;

@Mapper(componentModel =  "spring")
public interface AccountMapper {

    AccountResource outputModelToResource(AccountPayload account);

    TransactionModel dtoToInputModel(String accountId, LocalDate fromAccountingDate, LocalDate toAccountingDate);

    TransactionsResource outputModelToResource(Transactions transactions);
}
