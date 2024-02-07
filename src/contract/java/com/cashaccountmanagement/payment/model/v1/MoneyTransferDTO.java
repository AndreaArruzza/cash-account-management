package com.cashaccountmanagement.payment.model.v1;

import java.net.URI;
import java.util.Objects;
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
 * MoneyTransferDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:33:57.602773200+01:00[Europe/Berlin]")
public class MoneyTransferDTO   {

  @JsonProperty("receiverName")
  private String receiverName;

  @JsonProperty("description")
  private String description;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("amount")
  private String amount;

  @JsonProperty("executionDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate executionDate;

  public MoneyTransferDTO receiverName(String receiverName) {
    this.receiverName = receiverName;
    return this;
  }

  /**
   * Get receiverName
   * @return receiverName
  */
  @NotNull 
  @Schema(name = "receiverName", required = true)
  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }

  public MoneyTransferDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoneyTransferDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  @NotNull 
  @Schema(name = "currency", required = true)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public MoneyTransferDTO amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", required = true)
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public MoneyTransferDTO executionDate(LocalDate executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Get executionDate
   * @return executionDate
  */
  @Valid 
  @Schema(name = "executionDate", required = false)
  public LocalDate getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(LocalDate executionDate) {
    this.executionDate = executionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferDTO moneyTransferDTO = (MoneyTransferDTO) o;
    return Objects.equals(this.receiverName, moneyTransferDTO.receiverName) &&
        Objects.equals(this.description, moneyTransferDTO.description) &&
        Objects.equals(this.currency, moneyTransferDTO.currency) &&
        Objects.equals(this.amount, moneyTransferDTO.amount) &&
        Objects.equals(this.executionDate, moneyTransferDTO.executionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiverName, description, currency, amount, executionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferDTO {\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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

