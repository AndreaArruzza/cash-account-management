package com.cashaccountmanagement.account.model.v1;

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
 * AccountResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-07T18:42:14.125851800+01:00[Europe/Berlin]")
public class AccountResource   {

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("iban")
  private String iban;

  @JsonProperty("abiCode")
  private String abiCode;

  @JsonProperty("cabCode")
  private String cabCode;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("internationalCin")
  private String internationalCin;

  @JsonProperty("nationalCin")
  private String nationalCin;

  @JsonProperty("account")
  private String account;

  @JsonProperty("alias")
  private String alias;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("holderName")
  private String holderName;

  @JsonProperty("activatedDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate activatedDate;

  @JsonProperty("currency")
  private String currency;

  public AccountResource accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  */
  
  @Schema(name = "accountId", example = "14930637", required = false)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountResource iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
  */
  
  @Schema(name = "iban", example = "IT22D3706978430115706240270", required = false)
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountResource abiCode(String abiCode) {
    this.abiCode = abiCode;
    return this;
  }

  /**
   * Get abiCode
   * @return abiCode
  */
  
  @Schema(name = "abiCode", example = "37069", required = false)
  public String getAbiCode() {
    return abiCode;
  }

  public void setAbiCode(String abiCode) {
    this.abiCode = abiCode;
  }

  public AccountResource cabCode(String cabCode) {
    this.cabCode = cabCode;
    return this;
  }

  /**
   * Get cabCode
   * @return cabCode
  */
  
  @Schema(name = "cabCode", example = "78430", required = false)
  public String getCabCode() {
    return cabCode;
  }

  public void setCabCode(String cabCode) {
    this.cabCode = cabCode;
  }

  public AccountResource countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  */
  
  @Schema(name = "countryCode", example = "IT", required = false)
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public AccountResource internationalCin(String internationalCin) {
    this.internationalCin = internationalCin;
    return this;
  }

  /**
   * Get internationalCin
   * @return internationalCin
  */
  
  @Schema(name = "internationalCin", example = "22", required = false)
  public String getInternationalCin() {
    return internationalCin;
  }

  public void setInternationalCin(String internationalCin) {
    this.internationalCin = internationalCin;
  }

  public AccountResource nationalCin(String nationalCin) {
    this.nationalCin = nationalCin;
    return this;
  }

  /**
   * Get nationalCin
   * @return nationalCin
  */
  
  @Schema(name = "nationalCin", example = "22", required = false)
  public String getNationalCin() {
    return nationalCin;
  }

  public void setNationalCin(String nationalCin) {
    this.nationalCin = nationalCin;
  }

  public AccountResource account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  
  @Schema(name = "account", example = "115706240270", required = false)
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public AccountResource alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  
  @Schema(name = "alias", example = "Company main account", required = false)
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public AccountResource productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "productName", example = "Generic company cash account", required = false)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public AccountResource holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

  /**
   * Get holderName
   * @return holderName
  */
  
  @Schema(name = "holderName", example = "ACME Inc.", required = false)
  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public AccountResource activatedDate(LocalDate activatedDate) {
    this.activatedDate = activatedDate;
    return this;
  }

  /**
   * Get activatedDate
   * @return activatedDate
  */
  @Valid 
  @Schema(name = "activatedDate", required = false)
  public LocalDate getActivatedDate() {
    return activatedDate;
  }

  public void setActivatedDate(LocalDate activatedDate) {
    this.activatedDate = activatedDate;
  }

  public AccountResource currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  
  @Schema(name = "currency", example = "EUR", required = false)
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
    AccountResource accountResource = (AccountResource) o;
    return Objects.equals(this.accountId, accountResource.accountId) &&
        Objects.equals(this.iban, accountResource.iban) &&
        Objects.equals(this.abiCode, accountResource.abiCode) &&
        Objects.equals(this.cabCode, accountResource.cabCode) &&
        Objects.equals(this.countryCode, accountResource.countryCode) &&
        Objects.equals(this.internationalCin, accountResource.internationalCin) &&
        Objects.equals(this.nationalCin, accountResource.nationalCin) &&
        Objects.equals(this.account, accountResource.account) &&
        Objects.equals(this.alias, accountResource.alias) &&
        Objects.equals(this.productName, accountResource.productName) &&
        Objects.equals(this.holderName, accountResource.holderName) &&
        Objects.equals(this.activatedDate, accountResource.activatedDate) &&
        Objects.equals(this.currency, accountResource.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, iban, abiCode, cabCode, countryCode, internationalCin, nationalCin, account, alias, productName, holderName, activatedDate, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResource {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    abiCode: ").append(toIndentedString(abiCode)).append("\n");
    sb.append("    cabCode: ").append(toIndentedString(cabCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    internationalCin: ").append(toIndentedString(internationalCin)).append("\n");
    sb.append("    nationalCin: ").append(toIndentedString(nationalCin)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    activatedDate: ").append(toIndentedString(activatedDate)).append("\n");
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

