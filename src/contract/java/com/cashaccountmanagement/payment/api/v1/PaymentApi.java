/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.cashaccountmanagement.payment.api.v1;

import com.cashaccountmanagement.payment.model.v1.CreateMoneyTransferResource;
import com.cashaccountmanagement.payment.model.v1.MoneyTransferDTO;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:33:57.602773200+01:00[Europe/Berlin]")
@Validated
@Tag(name = "payment", description = "the payment API")
public interface PaymentApi {

    /**
     * POST /payment/{accountId}/money-transfers : Insert a new money transfer
     *
     * @param accountId  (required)
     * @param moneyTransferDTO create money transfer dto (required)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "createMoneyTransfer",
        summary = "Insert a new money transfer",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CreateMoneyTransferResource.class))),
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/payment/{accountId}/money-transfers",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CreateMoneyTransferResource> createMoneyTransfer(
        @Parameter(name = "accountId", description = "", required = true, schema = @Schema(description = "")) @PathVariable("accountId") String accountId,
        @Parameter(name = "MoneyTransferDTO", description = "create money transfer dto", required = true, schema = @Schema(description = "")) @Valid @RequestBody MoneyTransferDTO moneyTransferDTO
    );

}
