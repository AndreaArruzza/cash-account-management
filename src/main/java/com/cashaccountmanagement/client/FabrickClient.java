package com.cashaccountmanagement.client;

import com.cashaccountmanagement.client.fabrick.model.v1.AccountResponse;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferDTO;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferResponse;
import com.cashaccountmanagement.client.fabrick.model.v1.TransactionsResponse;
import com.cashaccountmanagement.config.FabrickClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "fabrick", url = "${feign.client.config.fabrick.basePath}", path = "/v4.0", configuration = FabrickClientConfig.class)
public interface FabrickClient {

    @GetMapping("/accounts/{accountId}")
    AccountResponse getAccount(@PathVariable("accountId") String accountId,
                               @RequestHeader("Auth-Schema") String authSchema,
                               @RequestHeader("apiKey") String apiKey);

    @GetMapping("/accounts/{accountId}/transactions")
    TransactionsResponse getAccountTransactions(@PathVariable("accountId") String accountId,
                                                @RequestParam("fromAccountingDate") String fromAccountingDate,
                                                @RequestParam("toAccountingDate") String toAccountingDate,
                                                @RequestHeader("Auth-Schema") String authSchema,
                                                @RequestHeader("apiKey") String apiKey);

    @PostMapping("/accounts/{accountId}/payments/money-transfers")
    MoneyTransferResponse createMoneyTransfer(@PathVariable("accountId") Long accountId,
                                              @RequestBody MoneyTransferDTO moneyTransferDTO,
                                              @RequestHeader("Auth-Schema") String authSchema,
                                              @RequestHeader("apiKey") String apiKey);
}
