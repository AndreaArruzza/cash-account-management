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
 * NaturalPersonBeneficiary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-02T22:01:25.139626500+02:00[Europe/Berlin]")
public class NaturalPersonBeneficiary   {

  @JsonProperty("fiscalCode1")
  private String fiscalCode1;

  @JsonProperty("fiscalCode2")
  private String fiscalCode2;

  @JsonProperty("fiscalCode3")
  private String fiscalCode3;

  @JsonProperty("fiscalCode4")
  private String fiscalCode4;

  @JsonProperty("fiscalCode5")
  private String fiscalCode5;

  public NaturalPersonBeneficiary fiscalCode1(String fiscalCode1) {
    this.fiscalCode1 = fiscalCode1;
    return this;
  }

  /**
   * Get fiscalCode1
   * @return fiscalCode1
  */
  @NotNull 
  @Schema(name = "fiscalCode1", required = true)
  public String getFiscalCode1() {
    return fiscalCode1;
  }

  public void setFiscalCode1(String fiscalCode1) {
    this.fiscalCode1 = fiscalCode1;
  }

  public NaturalPersonBeneficiary fiscalCode2(String fiscalCode2) {
    this.fiscalCode2 = fiscalCode2;
    return this;
  }

  /**
   * Get fiscalCode2
   * @return fiscalCode2
  */
  
  @Schema(name = "fiscalCode2", required = false)
  public String getFiscalCode2() {
    return fiscalCode2;
  }

  public void setFiscalCode2(String fiscalCode2) {
    this.fiscalCode2 = fiscalCode2;
  }

  public NaturalPersonBeneficiary fiscalCode3(String fiscalCode3) {
    this.fiscalCode3 = fiscalCode3;
    return this;
  }

  /**
   * Get fiscalCode3
   * @return fiscalCode3
  */
  
  @Schema(name = "fiscalCode3", required = false)
  public String getFiscalCode3() {
    return fiscalCode3;
  }

  public void setFiscalCode3(String fiscalCode3) {
    this.fiscalCode3 = fiscalCode3;
  }

  public NaturalPersonBeneficiary fiscalCode4(String fiscalCode4) {
    this.fiscalCode4 = fiscalCode4;
    return this;
  }

  /**
   * Get fiscalCode4
   * @return fiscalCode4
  */
  
  @Schema(name = "fiscalCode4", required = false)
  public String getFiscalCode4() {
    return fiscalCode4;
  }

  public void setFiscalCode4(String fiscalCode4) {
    this.fiscalCode4 = fiscalCode4;
  }

  public NaturalPersonBeneficiary fiscalCode5(String fiscalCode5) {
    this.fiscalCode5 = fiscalCode5;
    return this;
  }

  /**
   * Get fiscalCode5
   * @return fiscalCode5
  */
  
  @Schema(name = "fiscalCode5", required = false)
  public String getFiscalCode5() {
    return fiscalCode5;
  }

  public void setFiscalCode5(String fiscalCode5) {
    this.fiscalCode5 = fiscalCode5;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaturalPersonBeneficiary naturalPersonBeneficiary = (NaturalPersonBeneficiary) o;
    return Objects.equals(this.fiscalCode1, naturalPersonBeneficiary.fiscalCode1) &&
        Objects.equals(this.fiscalCode2, naturalPersonBeneficiary.fiscalCode2) &&
        Objects.equals(this.fiscalCode3, naturalPersonBeneficiary.fiscalCode3) &&
        Objects.equals(this.fiscalCode4, naturalPersonBeneficiary.fiscalCode4) &&
        Objects.equals(this.fiscalCode5, naturalPersonBeneficiary.fiscalCode5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalCode1, fiscalCode2, fiscalCode3, fiscalCode4, fiscalCode5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaturalPersonBeneficiary {\n");
    sb.append("    fiscalCode1: ").append(toIndentedString(fiscalCode1)).append("\n");
    sb.append("    fiscalCode2: ").append(toIndentedString(fiscalCode2)).append("\n");
    sb.append("    fiscalCode3: ").append(toIndentedString(fiscalCode3)).append("\n");
    sb.append("    fiscalCode4: ").append(toIndentedString(fiscalCode4)).append("\n");
    sb.append("    fiscalCode5: ").append(toIndentedString(fiscalCode5)).append("\n");
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

