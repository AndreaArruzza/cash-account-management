package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.TransactionsResponsePayload;
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
 * TransactionsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-02T22:01:25.139626500+02:00[Europe/Berlin]")
public class TransactionsResponse   {

  @JsonProperty("status")
  private String status;

  @JsonProperty("error")
  @Valid
  private List<Object> error = null;

  @JsonProperty("payload")
  private TransactionsResponsePayload payload;

  public TransactionsResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", example = "OK", required = false)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransactionsResponse error(List<Object> error) {
    this.error = error;
    return this;
  }

  public TransactionsResponse addErrorItem(Object errorItem) {
    if (this.error == null) {
      this.error = new ArrayList<>();
    }
    this.error.add(errorItem);
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "error", required = false)
  public List<Object> getError() {
    return error;
  }

  public void setError(List<Object> error) {
    this.error = error;
  }

  public TransactionsResponse payload(TransactionsResponsePayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  */
  @Valid 
  @Schema(name = "payload", required = false)
  public TransactionsResponsePayload getPayload() {
    return payload;
  }

  public void setPayload(TransactionsResponsePayload payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsResponse transactionsResponse = (TransactionsResponse) o;
    return Objects.equals(this.status, transactionsResponse.status) &&
        Objects.equals(this.error, transactionsResponse.error) &&
        Objects.equals(this.payload, transactionsResponse.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

