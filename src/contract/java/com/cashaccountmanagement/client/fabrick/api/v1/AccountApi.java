/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.cashaccountmanagement.client.fabrick.api.v1;

import com.cashaccountmanagement.client.fabrick.model.v1.AccountResponse;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import com.cashaccountmanagement.client.fabrick.model.v1.Transactions;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T19:46:08.386262800+02:00[Europe/Berlin]")
@Validated
@Tag(name = "account", description = "the account API")
public interface AccountApi {

    /**
     * GET /account/{accountId} : get account
     *
     * @param accountId  (required)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "getAccount",
        summary = "get account",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  AccountResponse.class))),
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/account/{accountId}",
        produces = { "application/json" }
    )
    ResponseEntity<AccountResponse> getAccount(
        @Parameter(name = "accountId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("accountId") String accountId
    );


    /**
     * GET /account/{accountId}/transactions : get transactions by account id
     *
     * @param accountId  (required)
     * @param fromAccountingDate  (required)
     * @param toAccountingDate  (required)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "getAccountTransactions",
        summary = "get transactions by account id",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Transactions.class))),
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/account/{accountId}/transactions",
        produces = { "application/json" }
    )
    ResponseEntity<Transactions> getAccountTransactions(
        @Parameter(name = "accountId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("accountId") String accountId,
        @NotNull @Parameter(name = "fromAccountingDate", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "fromAccountingDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromAccountingDate,
        @NotNull @Parameter(name = "toAccountingDate", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "toAccountingDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toAccountingDate
    );

}
