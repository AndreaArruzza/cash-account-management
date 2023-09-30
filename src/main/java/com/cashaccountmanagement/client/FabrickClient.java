package com.cashaccountmanagement.client;

import com.cashaccountmanagement.client.fabrick.model.v1.Transactions;
import com.cashaccountmanagement.client.fabrick.model.v1.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "fabrick", url = "${feign.client.config.fabrick.basePath}", path = "/v4.0")
public interface FabrickClient {

    @GetMapping(name ="/accounts/{accountId}")
    Account getAccount(@PathVariable(name ="accountId") String accountId,
                       @RequestHeader(name ="Auth-Schema") String authSchema,
                       @RequestHeader(name ="apiKey") String apiKey);

    @GetMapping(name ="/accounts/{accountId}/transactions")
    Transactions getAccountTransactions(@PathVariable(name ="accountId") String accountId,
                                        @RequestParam(name = "fromAccountingDate") LocalDate fromAccountingDate,
                                        @RequestParam(name = "toAccountingDate") LocalDate toAccountingDate,
                                        @RequestHeader(name ="Auth-Schema") String authSchema,
                                        @RequestHeader(name ="apiKey") String apiKey);
}
