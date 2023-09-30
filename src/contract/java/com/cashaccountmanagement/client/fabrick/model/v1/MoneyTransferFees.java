package com.cashaccountmanagement.client.fabrick.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import javax.validation.Valid;

import io.swagger.v3.oas.annotations.media.Schema;


import javax.annotation.Generated;

/**
 * MoneyTransferFees
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T12:20:29.206163100+02:00[Europe/Berlin]")
public class MoneyTransferFees   {

  @JsonProperty("feeCode")
  private String feeCode;

  @JsonProperty("description")
  private String description;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currency")
  private String currency;

  public MoneyTransferFees feeCode(String feeCode) {
    this.feeCode = feeCode;
    return this;
  }

  /**
   * The code of the fee.
   * @return feeCode
  */
  
  @Schema(name = "feeCode", description = "The code of the fee.", required = false)
  public String getFeeCode() {
    return feeCode;
  }

  public void setFeeCode(String feeCode) {
    this.feeCode = feeCode;
  }

  public MoneyTransferFees description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the fee.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the fee.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoneyTransferFees amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the fee.
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", description = "The amount of the fee.", required = false)
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public MoneyTransferFees currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the fee (e.g., EUR).
   * @return currency
  */
  
  @Schema(name = "currency", description = "The currency of the fee (e.g., EUR).", required = false)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferFees moneyTransferFees = (MoneyTransferFees) o;
    return Objects.equals(this.feeCode, moneyTransferFees.feeCode) &&
        Objects.equals(this.description, moneyTransferFees.description) &&
        Objects.equals(this.amount, moneyTransferFees.amount) &&
        Objects.equals(this.currency, moneyTransferFees.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCode, description, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferFees {\n");
    sb.append("    feeCode: ").append(toIndentedString(feeCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

