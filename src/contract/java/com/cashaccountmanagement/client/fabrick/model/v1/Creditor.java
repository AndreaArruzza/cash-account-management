package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.AccountMoneyTransfer;
import com.cashaccountmanagement.client.fabrick.model.v1.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Creditor
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-29T08:33:57.679775300+01:00[Europe/Berlin]")
public class Creditor   {

  @JsonProperty("name")
  private String name;

  @JsonProperty("account")
  private AccountMoneyTransfer account;

  @JsonProperty("address")
  private Address address;

  public Creditor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Creditor account(AccountMoneyTransfer account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  */
  @NotNull @Valid 
  @Schema(name = "account", required = true)
  public AccountMoneyTransfer getAccount() {
    return account;
  }

  public void setAccount(AccountMoneyTransfer account) {
    this.account = account;
  }

  public Creditor address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", required = false)
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Creditor creditor = (Creditor) o;
    return Objects.equals(this.name, creditor.name) &&
        Objects.equals(this.account, creditor.account) &&
        Objects.equals(this.address, creditor.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, account, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creditor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

