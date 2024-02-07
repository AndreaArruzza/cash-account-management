package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.Amount;
import com.cashaccountmanagement.client.fabrick.model.v1.Creditor;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferPayloadDebtor;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferPayloadFees;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoneyTransferPayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:33:57.679775300+01:00[Europe/Berlin]")
public class MoneyTransferPayload   {

  @JsonProperty("moneyTransferId")
  private String moneyTransferId;

  @JsonProperty("status")
  private String status;

  @JsonProperty("direction")
  private String direction;

  @JsonProperty("creditor")
  private Creditor creditor;

  @JsonProperty("debtor")
  private MoneyTransferPayloadDebtor debtor;

  @JsonProperty("cro")
  private String cro;

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("trn")
  private String trn;

  @JsonProperty("description")
  private String description;

  @JsonProperty("createdDatetime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdDatetime;

  @JsonProperty("accountedDatetime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime accountedDatetime;

  @JsonProperty("debtorValueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate debtorValueDate;

  @JsonProperty("creditorValueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate creditorValueDate;

  @JsonProperty("amount")
  private Amount amount;

  @JsonProperty("isUrgent")
  private Boolean isUrgent;

  @JsonProperty("isInstant")
  private Boolean isInstant;

  @JsonProperty("feeType")
  private String feeType;

  @JsonProperty("feeAccountId")
  private String feeAccountId;

  @JsonProperty("fees")
  @Valid
  private List<MoneyTransferPayloadFees> fees = null;

  @JsonProperty("hasTaxRelief")
  private Boolean hasTaxRelief;

  public MoneyTransferPayload moneyTransferId(String moneyTransferId) {
    this.moneyTransferId = moneyTransferId;
    return this;
  }

  /**
   * The ID of the money transfer.
   * @return moneyTransferId
  */
  
  @Schema(name = "moneyTransferId", description = "The ID of the money transfer.", required = false)
  public String getMoneyTransferId() {
    return moneyTransferId;
  }

  public void setMoneyTransferId(String moneyTransferId) {
    this.moneyTransferId = moneyTransferId;
  }

  public MoneyTransferPayload status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the money transfer (e.g., EXECUTED).
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the money transfer (e.g., EXECUTED).", required = false)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MoneyTransferPayload direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * The direction of the money transfer (e.g., OUTGOING).
   * @return direction
  */
  
  @Schema(name = "direction", description = "The direction of the money transfer (e.g., OUTGOING).", required = false)
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public MoneyTransferPayload creditor(Creditor creditor) {
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

  public MoneyTransferPayload debtor(MoneyTransferPayloadDebtor debtor) {
    this.debtor = debtor;
    return this;
  }

  /**
   * Get debtor
   * @return debtor
  */
  @Valid 
  @Schema(name = "debtor", required = false)
  public MoneyTransferPayloadDebtor getDebtor() {
    return debtor;
  }

  public void setDebtor(MoneyTransferPayloadDebtor debtor) {
    this.debtor = debtor;
  }

  public MoneyTransferPayload cro(String cro) {
    this.cro = cro;
    return this;
  }

  /**
   * The CRO (Common Reference Number) of the money transfer.
   * @return cro
  */
  
  @Schema(name = "cro", description = "The CRO (Common Reference Number) of the money transfer.", required = false)
  public String getCro() {
    return cro;
  }

  public void setCro(String cro) {
    this.cro = cro;
  }

  public MoneyTransferPayload uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The URI associated with the money transfer.
   * @return uri
  */
  
  @Schema(name = "uri", description = "The URI associated with the money transfer.", required = false)
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public MoneyTransferPayload trn(String trn) {
    this.trn = trn;
    return this;
  }

  /**
   * The TRN (Transaction Reference Number) of the money transfer.
   * @return trn
  */
  
  @Schema(name = "trn", description = "The TRN (Transaction Reference Number) of the money transfer.", required = false)
  public String getTrn() {
    return trn;
  }

  public void setTrn(String trn) {
    this.trn = trn;
  }

  public MoneyTransferPayload description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the money transfer.
   * @return description
  */
  
  @Schema(name = "description", description = "A description of the money transfer.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MoneyTransferPayload createdDatetime(OffsetDateTime createdDatetime) {
    this.createdDatetime = createdDatetime;
    return this;
  }

  /**
   * The datetime when the money transfer was created.
   * @return createdDatetime
  */
  @Valid 
  @Schema(name = "createdDatetime", description = "The datetime when the money transfer was created.", required = false)
  public OffsetDateTime getCreatedDatetime() {
    return createdDatetime;
  }

  public void setCreatedDatetime(OffsetDateTime createdDatetime) {
    this.createdDatetime = createdDatetime;
  }

  public MoneyTransferPayload accountedDatetime(OffsetDateTime accountedDatetime) {
    this.accountedDatetime = accountedDatetime;
    return this;
  }

  /**
   * The datetime when the money transfer was accounted for.
   * @return accountedDatetime
  */
  @Valid 
  @Schema(name = "accountedDatetime", description = "The datetime when the money transfer was accounted for.", required = false)
  public OffsetDateTime getAccountedDatetime() {
    return accountedDatetime;
  }

  public void setAccountedDatetime(OffsetDateTime accountedDatetime) {
    this.accountedDatetime = accountedDatetime;
  }

  public MoneyTransferPayload debtorValueDate(LocalDate debtorValueDate) {
    this.debtorValueDate = debtorValueDate;
    return this;
  }

  /**
   * The value date for the debtor.
   * @return debtorValueDate
  */
  @Valid 
  @Schema(name = "debtorValueDate", description = "The value date for the debtor.", required = false)
  public LocalDate getDebtorValueDate() {
    return debtorValueDate;
  }

  public void setDebtorValueDate(LocalDate debtorValueDate) {
    this.debtorValueDate = debtorValueDate;
  }

  public MoneyTransferPayload creditorValueDate(LocalDate creditorValueDate) {
    this.creditorValueDate = creditorValueDate;
    return this;
  }

  /**
   * The value date for the creditor.
   * @return creditorValueDate
  */
  @Valid 
  @Schema(name = "creditorValueDate", description = "The value date for the creditor.", required = false)
  public LocalDate getCreditorValueDate() {
    return creditorValueDate;
  }

  public void setCreditorValueDate(LocalDate creditorValueDate) {
    this.creditorValueDate = creditorValueDate;
  }

  public MoneyTransferPayload amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", required = false)
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public MoneyTransferPayload isUrgent(Boolean isUrgent) {
    this.isUrgent = isUrgent;
    return this;
  }

  /**
   * Indicates if the transfer is urgent.
   * @return isUrgent
  */
  
  @Schema(name = "isUrgent", description = "Indicates if the transfer is urgent.", required = false)
  public Boolean getIsUrgent() {
    return isUrgent;
  }

  public void setIsUrgent(Boolean isUrgent) {
    this.isUrgent = isUrgent;
  }

  public MoneyTransferPayload isInstant(Boolean isInstant) {
    this.isInstant = isInstant;
    return this;
  }

  /**
   * Indicates if the transfer is instant.
   * @return isInstant
  */
  
  @Schema(name = "isInstant", description = "Indicates if the transfer is instant.", required = false)
  public Boolean getIsInstant() {
    return isInstant;
  }

  public void setIsInstant(Boolean isInstant) {
    this.isInstant = isInstant;
  }

  public MoneyTransferPayload feeType(String feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * The fee type (e.g., SHA).
   * @return feeType
  */
  
  @Schema(name = "feeType", description = "The fee type (e.g., SHA).", required = false)
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  public MoneyTransferPayload feeAccountId(String feeAccountId) {
    this.feeAccountId = feeAccountId;
    return this;
  }

  /**
   * The account ID associated with the fees.
   * @return feeAccountId
  */
  
  @Schema(name = "feeAccountId", description = "The account ID associated with the fees.", required = false)
  public String getFeeAccountId() {
    return feeAccountId;
  }

  public void setFeeAccountId(String feeAccountId) {
    this.feeAccountId = feeAccountId;
  }

  public MoneyTransferPayload fees(List<MoneyTransferPayloadFees> fees) {
    this.fees = fees;
    return this;
  }

  public MoneyTransferPayload addFeesItem(MoneyTransferPayloadFees feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
  */
  @Valid 
  @Schema(name = "fees", required = false)
  public List<MoneyTransferPayloadFees> getFees() {
    return fees;
  }

  public void setFees(List<MoneyTransferPayloadFees> fees) {
    this.fees = fees;
  }

  public MoneyTransferPayload hasTaxRelief(Boolean hasTaxRelief) {
    this.hasTaxRelief = hasTaxRelief;
    return this;
  }

  /**
   * Indicates if tax relief applies to the transfer.
   * @return hasTaxRelief
  */
  
  @Schema(name = "hasTaxRelief", description = "Indicates if tax relief applies to the transfer.", required = false)
  public Boolean getHasTaxRelief() {
    return hasTaxRelief;
  }

  public void setHasTaxRelief(Boolean hasTaxRelief) {
    this.hasTaxRelief = hasTaxRelief;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferPayload moneyTransferPayload = (MoneyTransferPayload) o;
    return Objects.equals(this.moneyTransferId, moneyTransferPayload.moneyTransferId) &&
        Objects.equals(this.status, moneyTransferPayload.status) &&
        Objects.equals(this.direction, moneyTransferPayload.direction) &&
        Objects.equals(this.creditor, moneyTransferPayload.creditor) &&
        Objects.equals(this.debtor, moneyTransferPayload.debtor) &&
        Objects.equals(this.cro, moneyTransferPayload.cro) &&
        Objects.equals(this.uri, moneyTransferPayload.uri) &&
        Objects.equals(this.trn, moneyTransferPayload.trn) &&
        Objects.equals(this.description, moneyTransferPayload.description) &&
        Objects.equals(this.createdDatetime, moneyTransferPayload.createdDatetime) &&
        Objects.equals(this.accountedDatetime, moneyTransferPayload.accountedDatetime) &&
        Objects.equals(this.debtorValueDate, moneyTransferPayload.debtorValueDate) &&
        Objects.equals(this.creditorValueDate, moneyTransferPayload.creditorValueDate) &&
        Objects.equals(this.amount, moneyTransferPayload.amount) &&
        Objects.equals(this.isUrgent, moneyTransferPayload.isUrgent) &&
        Objects.equals(this.isInstant, moneyTransferPayload.isInstant) &&
        Objects.equals(this.feeType, moneyTransferPayload.feeType) &&
        Objects.equals(this.feeAccountId, moneyTransferPayload.feeAccountId) &&
        Objects.equals(this.fees, moneyTransferPayload.fees) &&
        Objects.equals(this.hasTaxRelief, moneyTransferPayload.hasTaxRelief);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moneyTransferId, status, direction, creditor, debtor, cro, uri, trn, description, createdDatetime, accountedDatetime, debtorValueDate, creditorValueDate, amount, isUrgent, isInstant, feeType, feeAccountId, fees, hasTaxRelief);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferPayload {\n");
    sb.append("    moneyTransferId: ").append(toIndentedString(moneyTransferId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    creditor: ").append(toIndentedString(creditor)).append("\n");
    sb.append("    debtor: ").append(toIndentedString(debtor)).append("\n");
    sb.append("    cro: ").append(toIndentedString(cro)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    trn: ").append(toIndentedString(trn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdDatetime: ").append(toIndentedString(createdDatetime)).append("\n");
    sb.append("    accountedDatetime: ").append(toIndentedString(accountedDatetime)).append("\n");
    sb.append("    debtorValueDate: ").append(toIndentedString(debtorValueDate)).append("\n");
    sb.append("    creditorValueDate: ").append(toIndentedString(creditorValueDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isUrgent: ").append(toIndentedString(isUrgent)).append("\n");
    sb.append("    isInstant: ").append(toIndentedString(isInstant)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeAccountId: ").append(toIndentedString(feeAccountId)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    hasTaxRelief: ").append(toIndentedString(hasTaxRelief)).append("\n");
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

