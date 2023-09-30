package com.cashaccountmanagement.client.fabrick.model.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AccountResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T19:46:08.386262800+02:00[Europe/Berlin]")
public class AccountResponse   {

  @JsonProperty("status")
  private String status;

  @JsonProperty("error")
  @Valid
  private List<Object> error = null;

  @JsonProperty("payload")
  private AccountPayload payload;

  public AccountResponse status(String status) {
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

  public AccountResponse error(List<Object> error) {
    this.error = error;
    return this;
  }

  public AccountResponse addErrorItem(Object errorItem) {
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

  public AccountResponse payload(AccountPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  */
  @Valid 
  @Schema(name = "payload", required = false)
  public AccountPayload getPayload() {
    return payload;
  }

  public void setPayload(AccountPayload payload) {
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
    AccountResponse accountResponse = (AccountResponse) o;
    return Objects.equals(this.status, accountResponse.status) &&
        Objects.equals(this.error, accountResponse.error) &&
        Objects.equals(this.payload, accountResponse.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResponse {\n");
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

