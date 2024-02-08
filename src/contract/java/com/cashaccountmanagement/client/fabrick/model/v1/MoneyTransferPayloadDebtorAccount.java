package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoneyTransferPayloadDebtorAccount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-07T18:42:14.613850400+01:00[Europe/Berlin]")
public class MoneyTransferPayloadDebtorAccount   {

  @JsonProperty("accountCode")
  private String accountCode;

  @JsonProperty("bicCode")
  private String bicCode;

  public MoneyTransferPayloadDebtorAccount accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * The account code of the debtor.
   * @return accountCode
  */
  
  @Schema(name = "accountCode", description = "The account code of the debtor.", required = false)
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public MoneyTransferPayloadDebtorAccount bicCode(String bicCode) {
    this.bicCode = bicCode;
    return this;
  }

  /**
   * The BIC code of the debtor.
   * @return bicCode
  */
  
  @Schema(name = "bicCode", description = "The BIC code of the debtor.", required = false)
  public String getBicCode() {
    return bicCode;
  }

  public void setBicCode(String bicCode) {
    this.bicCode = bicCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferPayloadDebtorAccount moneyTransferPayloadDebtorAccount = (MoneyTransferPayloadDebtorAccount) o;
    return Objects.equals(this.accountCode, moneyTransferPayloadDebtorAccount.accountCode) &&
        Objects.equals(this.bicCode, moneyTransferPayloadDebtorAccount.bicCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, bicCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferPayloadDebtorAccount {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    bicCode: ").append(toIndentedString(bicCode)).append("\n");
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

