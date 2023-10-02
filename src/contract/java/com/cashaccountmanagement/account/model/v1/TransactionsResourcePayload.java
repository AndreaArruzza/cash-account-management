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
 * TransactionsResourcePayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-02T18:59:46.726381900+02:00[Europe/Berlin]")
public class TransactionsResourcePayload   {

  @JsonProperty("list")
  @Valid
  private List<TransactionResource> _list = null;

  public TransactionsResourcePayload _list(List<TransactionResource> _list) {
    this._list = _list;
    return this;
  }

  public TransactionsResourcePayload addListItem(TransactionResource _listItem) {
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
  public List<TransactionResource> getList() {
    return _list;
  }

  public void setList(List<TransactionResource> _list) {
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
    TransactionsResourcePayload transactionsResourcePayload = (TransactionsResourcePayload) o;
    return Objects.equals(this._list, transactionsResourcePayload._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResourcePayload {\n");
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

