package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Transaction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T23:01:26.207791600+02:00[Europe/Berlin]")
public class Transaction   {

  @JsonProperty("transactionId")
  private String transactionId;

  @JsonProperty("operationId")
  private String operationId;

  @JsonProperty("accountingDate")
  private String accountingDate;

  @JsonProperty("valueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate valueDate;

  @JsonProperty("type")
  private Type type;

  @JsonProperty("amount")
  private Integer amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("description")
  private String description;

  public Transaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  */
  
  @Schema(name = "transactionId", required = false)
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   * @return operationId
  */
  
  @Schema(name = "operationId", required = false)
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public Transaction accountingDate(String accountingDate) {
    this.accountingDate = accountingDate;
    return this;
  }

  /**
   * Get accountingDate
   * @return accountingDate
  */
  
  @Schema(name = "accountingDate", required = false)
  public String getAccountingDate() {
    return accountingDate;
  }

  public void setAccountingDate(String accountingDate) {
    this.accountingDate = accountingDate;
  }

  public Transaction valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * Get valueDate
   * @return valueDate
  */
  @Valid 
  @Schema(name = "valueDate", required = false)
  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public Transaction type(Type type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "type", required = false)
  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Transaction amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", required = false)
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Transaction currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  
  @Schema(name = "currency", required = false)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.operationId, transaction.operationId) &&
        Objects.equals(this.accountingDate, transaction.accountingDate) &&
        Objects.equals(this.valueDate, transaction.valueDate) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.description, transaction.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, operationId, accountingDate, valueDate, type, amount, currency, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    accountingDate: ").append(toIndentedString(accountingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

