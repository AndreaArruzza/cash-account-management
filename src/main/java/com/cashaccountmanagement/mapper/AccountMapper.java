package com.cashaccountmanagement.mapper;

import com.cashaccountmanagement.account.model.v1.AccountResource;
import com.cashaccountmanagement.account.model.v1.TransactionsResource;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountPayload;
import com.cashaccountmanagement.client.fabrick.model.v1.TransactionsResponsePayload;
import com.cashaccountmanagement.entity.Account;
import com.cashaccountmanagement.entity.Transaction;
import com.cashaccountmanagement.model.TransactionModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mapper(componentModel =  "spring")
public interface AccountMapper {

    AccountResource outputModelToResource(AccountPayload account);

    TransactionModel dtoToInputModel(String accountId, LocalDate fromAccountingDate, LocalDate toAccountingDate);

    @Mapping(target = "transactions" , source = "list")
    TransactionsResource outputModelToResource(TransactionsResponsePayload transactions);

    @Mapping(target = "typeEnumeration" , source = "transaction.type.enumeration")
    @Mapping(target = "typeValue" , source = "transaction.type.value")
    @Mapping(target = "account", source = "account")
    Transaction toTransaction(com.cashaccountmanagement.client.fabrick.model.v1.Transaction transaction, Account account);

   default List<Transaction> outputModelToEntity(List<com.cashaccountmanagement.client.fabrick.model.v1.Transaction> list, Account account){
        if (list == null) {
            return Collections.emptyList();
        }
        List<Transaction> transactions = new ArrayList<>();
        for (com.cashaccountmanagement.client.fabrick.model.v1.Transaction dto : list) {
            transactions.add(toTransaction(dto, account));
        }
        return transactions;
    }
}
