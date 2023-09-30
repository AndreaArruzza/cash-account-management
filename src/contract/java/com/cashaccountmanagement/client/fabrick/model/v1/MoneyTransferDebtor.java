package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.MoneyTransferDebtorAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MoneyTransferDebtor
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T19:46:08.386262800+02:00[Europe/Berlin]")
public class MoneyTransferDebtor   {

  @JsonProperty("name")
  private String name;

  @JsonProperty("account")
  private MoneyTransferDebtorAccount account;

  public MoneyTransferDebtor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the debtor.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the debtor.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoneyTransferDebtor account(MoneyTransferDebtorAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @Valid 
  @Schema(name = "account", required = false)
  public MoneyTransferDebtorAccount getAccount() {
    return account;
  }

  public void setAccount(MoneyTransferDebtorAccount account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoneyTransferDebtor moneyTransferDebtor = (MoneyTransferDebtor) o;
    return Objects.equals(this.name, moneyTransferDebtor.name) &&
        Objects.equals(this.account, moneyTransferDebtor.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoneyTransferDebtor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

