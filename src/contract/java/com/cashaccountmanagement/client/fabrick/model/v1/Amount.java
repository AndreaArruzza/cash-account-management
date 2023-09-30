package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Amount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T19:46:08.386262800+02:00[Europe/Berlin]")
public class Amount   {

  @JsonProperty("debtorAmount")
  private BigDecimal debtorAmount;

  @JsonProperty("debtorCurrency")
  private String debtorCurrency;

  @JsonProperty("creditorAmount")
  private BigDecimal creditorAmount;

  @JsonProperty("creditorCurrency")
  private String creditorCurrency;

  @JsonProperty("creditorCurrencyDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate creditorCurrencyDate;

  @JsonProperty("exchangeRate")
  private BigDecimal exchangeRate;

  public Amount debtorAmount(BigDecimal debtorAmount) {
    this.debtorAmount = debtorAmount;
    return this;
  }

  /**
   * The amount in the debtor's currency.
   * @return debtorAmount
  */
  @Valid 
  @Schema(name = "debtorAmount", description = "The amount in the debtor's currency.", required = false)
  public BigDecimal getDebtorAmount() {
    return debtorAmount;
  }

  public void setDebtorAmount(BigDecimal debtorAmount) {
    this.debtorAmount = debtorAmount;
  }

  public Amount debtorCurrency(String debtorCurrency) {
    this.debtorCurrency = debtorCurrency;
    return this;
  }

  /**
   * The currency of the debtor's amount (e.g., EUR).
   * @return debtorCurrency
  */
  
  @Schema(name = "debtorCurrency", description = "The currency of the debtor's amount (e.g., EUR).", required = false)
  public String getDebtorCurrency() {
    return debtorCurrency;
  }

  public void setDebtorCurrency(String debtorCurrency) {
    this.debtorCurrency = debtorCurrency;
  }

  public Amount creditorAmount(BigDecimal creditorAmount) {
    this.creditorAmount = creditorAmount;
    return this;
  }

  /**
   * The amount in the creditor's currency.
   * @return creditorAmount
  */
  @Valid 
  @Schema(name = "creditorAmount", description = "The amount in the creditor's currency.", required = false)
  public BigDecimal getCreditorAmount() {
    return creditorAmount;
  }

  public void setCreditorAmount(BigDecimal creditorAmount) {
    this.creditorAmount = creditorAmount;
  }

  public Amount creditorCurrency(String creditorCurrency) {
    this.creditorCurrency = creditorCurrency;
    return this;
  }

  /**
   * The currency of the creditor's amount (e.g., EUR).
   * @return creditorCurrency
  */
  
  @Schema(name = "creditorCurrency", description = "The currency of the creditor's amount (e.g., EUR).", required = false)
  public String getCreditorCurrency() {
    return creditorCurrency;
  }

  public void setCreditorCurrency(String creditorCurrency) {
    this.creditorCurrency = creditorCurrency;
  }

  public Amount creditorCurrencyDate(LocalDate creditorCurrencyDate) {
    this.creditorCurrencyDate = creditorCurrencyDate;
    return this;
  }

  /**
   * The currency conversion date.
   * @return creditorCurrencyDate
  */
  @Valid 
  @Schema(name = "creditorCurrencyDate", description = "The currency conversion date.", required = false)
  public LocalDate getCreditorCurrencyDate() {
    return creditorCurrencyDate;
  }

  public void setCreditorCurrencyDate(LocalDate creditorCurrencyDate) {
    this.creditorCurrencyDate = creditorCurrencyDate;
  }

  public Amount exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * The exchange rate used for the currency conversion.
   * @return exchangeRate
  */
  @Valid 
  @Schema(name = "exchangeRate", description = "The exchange rate used for the currency conversion.", required = false)
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.debtorAmount, amount.debtorAmount) &&
        Objects.equals(this.debtorCurrency, amount.debtorCurrency) &&
        Objects.equals(this.creditorAmount, amount.creditorAmount) &&
        Objects.equals(this.creditorCurrency, amount.creditorCurrency) &&
        Objects.equals(this.creditorCurrencyDate, amount.creditorCurrencyDate) &&
        Objects.equals(this.exchangeRate, amount.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debtorAmount, debtorCurrency, creditorAmount, creditorCurrency, creditorCurrencyDate, exchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    sb.append("    debtorAmount: ").append(toIndentedString(debtorAmount)).append("\n");
    sb.append("    debtorCurrency: ").append(toIndentedString(debtorCurrency)).append("\n");
    sb.append("    creditorAmount: ").append(toIndentedString(creditorAmount)).append("\n");
    sb.append("    creditorCurrency: ").append(toIndentedString(creditorCurrency)).append("\n");
    sb.append("    creditorCurrencyDate: ").append(toIndentedString(creditorCurrencyDate)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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

