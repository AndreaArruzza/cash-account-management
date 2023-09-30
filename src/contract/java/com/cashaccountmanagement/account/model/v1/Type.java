package com.cashaccountmanagement.account.model.v1;

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
 * Type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T19:46:07.863241+02:00[Europe/Berlin]")
public class Type   {

  @JsonProperty("enumeration")
  private String enumeration;

  @JsonProperty("operationId")
  private String operationId;

  public Type enumeration(String enumeration) {
    this.enumeration = enumeration;
    return this;
  }

  /**
   * Get enumeration
   * @return enumeration
  */
  
  @Schema(name = "enumeration", required = false)
  public String getEnumeration() {
    return enumeration;
  }

  public void setEnumeration(String enumeration) {
    this.enumeration = enumeration;
  }

  public Type operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   * @return operationId
  */
  
  @Schema(name = "operationId", required = false)
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Type type = (Type) o;
    return Objects.equals(this.enumeration, type.enumeration) &&
        Objects.equals(this.operationId, type.operationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumeration, operationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Type {\n");
    sb.append("    enumeration: ").append(toIndentedString(enumeration)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
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

