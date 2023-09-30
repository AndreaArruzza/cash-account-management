package com.cashaccountmanagement.account.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.account.model.v1.TransactionResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TransactionsResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T19:46:07.863241+02:00[Europe/Berlin]")
public class TransactionsResource   {

  @JsonProperty("Transactions")
  @Valid
  private List<TransactionResource> transactions = null;

  public TransactionsResource transactions(List<TransactionResource> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionsResource addTransactionsItem(TransactionResource transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  */
  @Valid 
  @Schema(name = "Transactions", required = false)
  public List<TransactionResource> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionResource> transactions) {
    this.transactions = transactions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsResource transactionsResource = (TransactionsResource) o;
    return Objects.equals(this.transactions, transactionsResource.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResource {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

