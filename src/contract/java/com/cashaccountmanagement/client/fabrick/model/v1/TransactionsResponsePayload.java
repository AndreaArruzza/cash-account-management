package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.Transaction;
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
 * TransactionsResponsePayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-07T18:42:14.613850400+01:00[Europe/Berlin]")
public class TransactionsResponsePayload   {

  @JsonProperty("list")
  @Valid
  private List<Transaction> _list = null;

  public TransactionsResponsePayload _list(List<Transaction> _list) {
    this._list = _list;
    return this;
  }

  public TransactionsResponsePayload addListItem(Transaction _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Get _list
   * @return _list
  */
  @Valid 
  @Schema(name = "list", required = false)
  public List<Transaction> getList() {
    return _list;
  }

  public void setList(List<Transaction> _list) {
    this._list = _list;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsResponsePayload transactionsResponsePayload = (TransactionsResponsePayload) o;
    return Objects.equals(this._list, transactionsResponsePayload._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResponsePayload {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

