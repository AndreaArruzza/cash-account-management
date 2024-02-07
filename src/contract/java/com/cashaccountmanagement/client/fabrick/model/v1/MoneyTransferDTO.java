package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.Creditor;
import com.cashaccountmanagement.client.fabrick.model.v1.TaxRelief;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoneyTransferDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:33:57.679775300+01:00[Europe/Berlin]")
public class MoneyTransferDTO   {

  @JsonProperty("creditor")
  private Creditor creditor;

  @JsonProperty("executionDate")
  private String executionDate;

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("description")
  private String description;

  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("isUrgent")
  private Boolean isUrgent;

  @JsonProperty("isInstant")
  private Boolean isInstant;

  @JsonProperty("feeType")
  private String feeType;

  @JsonProperty("feeAccountId")
  private String feeAccountId;

  @JsonProperty("taxRelief")
  private TaxRelief taxRelief;

  public MoneyTransferDTO creditor(Creditor creditor) {
    this.creditor = creditor;
    return this;
  }

  /**
   * Get creditor
   * @return creditor
  */
  @Valid 
  @Schema(name = "creditor", required = false)
  public Creditor getCreditor() {
    return creditor;
  }

  public void setCreditor(Creditor creditor) {
    this.creditor = creditor;
  }

  public MoneyTransferDTO executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Get executionDate
   * @return executionDate
  */
  
  @Schema(name = "executionDate", required = false)
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public MoneyTransferDTO uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
  */
  
  @Schema(name = "uri", required = false)
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
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

  public MoneyTransferDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @NotNull @Valid 
  @Schema(name = "amount", required = true)
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
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

  public MoneyTransferDTO isUrgent(Boolean isUrgent) {
    this.isUrgent = isUrgent;
    return this;
  }

  /**
   * Get isUrgent
   * @return isUrgent
  */
  
  @Schema(name = "isUrgent", required = false)
  public Boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(Boolean isUrgent) {
    this.isUrgent = isUrgent;
  }

  public MoneyTransferDTO isInstant(Boolean isInstant) {
    this.isInstant = isInstant;
    return this;
  }

  /**
   * Get isInstant
   * @return isInstant
  */
  
  @Schema(name = "isInstant", required = false)
  public Boolean getIsInstant() {
    return isInstant;
  }

  public void setIsInstant(Boolean isInstant) {
    this.isInstant = isInstant;
  }

  public MoneyTransferDTO feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  */
  
  @Schema(name = "feeType", required = false)
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public MoneyTransferDTO feeAccountId(String feeAccountId) {
    this.feeAccountId = feeAccountId;
    return this;
  }

  /**
   * Get feeAccountId
   * @return feeAccountId
  */
  
  @Schema(name = "feeAccountId", required = false)
  public String getFeeAccountId() {
    return feeAccountId;
  }

  public void setFeeAccountId(String feeAccountId) {
    this.feeAccountId = feeAccountId;
  }

  public MoneyTransferDTO taxRelief(TaxRelief taxRelief) {
    this.taxRelief = taxRelief;
    return this;
  }

  /**
   * Get taxRelief
   * @return taxRelief
  */
  @Valid 
  @Schema(name = "taxRelief", required = false)
  public TaxRelief getTaxRelief() {
    return taxRelief;
  }

  public void setTaxRelief(TaxRelief taxRelief) {
    this.taxRelief = taxRelief;
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
    return Objects.equals(this.creditor, moneyTransferDTO.creditor) &&
        Objects.equals(this.executionDate, moneyTransferDTO.executionDate) &&
        Objects.equals(this.uri, moneyTransferDTO.uri) &&
        Objects.equals(this.description, moneyTransferDTO.description) &&
        Objects.equals(this.amount, moneyTransferDTO.amount) &&
        Objects.equals(this.currency, moneyTransferDTO.currency) &&
        Objects.equals(this.isUrgent, moneyTransferDTO.isUrgent) &&
        Objects.equals(this.isInstant, moneyTransferDTO.isInstant) &&
        Objects.equals(this.feeType, moneyTransferDTO.feeType) &&
        Objects.equals(this.feeAccountId, moneyTransferDTO.feeAccountId) &&
        Objects.equals(this.taxRelief, moneyTransferDTO.taxRelief);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditor, executionDate, uri, description, amount, currency, isUrgent, isInstant, feeType, feeAccountId, taxRelief);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferDTO {\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isUrgent: ").append(toIndentedString(isUrgent)).append("\n");
    sb.append("    isInstant: ").append(toIndentedString(isInstant)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAccountId: ").append(toIndentedString(feeAccountId)).append("\n");
    sb.append("    taxRelief: ").append(toIndentedString(taxRelief)).append("\n");
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

