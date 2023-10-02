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
 * LegalPersonBeneficiary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-02T22:01:25.139626500+02:00[Europe/Berlin]")
public class LegalPersonBeneficiary   {

  @JsonProperty("fiscalCode")
  private String fiscalCode;

  @JsonProperty("legalRepresentativeFiscalCode")
  private String legalRepresentativeFiscalCode;

  public LegalPersonBeneficiary fiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
    return this;
  }

  /**
   * Get fiscalCode
   * @return fiscalCode
  */
  @NotNull 
  @Schema(name = "fiscalCode", required = true)
  public String getFiscalCode() {
    return fiscalCode;
  }

  public void setFiscalCode(String fiscalCode) {
    this.fiscalCode = fiscalCode;
  }

  public LegalPersonBeneficiary legalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
    this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
    return this;
  }

  /**
   * Get legalRepresentativeFiscalCode
   * @return legalRepresentativeFiscalCode
  */
  
  @Schema(name = "legalRepresentativeFiscalCode", required = false)
  public String getLegalRepresentativeFiscalCode() {
    return legalRepresentativeFiscalCode;
  }

  public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
    this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalPersonBeneficiary legalPersonBeneficiary = (LegalPersonBeneficiary) o;
    return Objects.equals(this.fiscalCode, legalPersonBeneficiary.fiscalCode) &&
        Objects.equals(this.legalRepresentativeFiscalCode, legalPersonBeneficiary.legalRepresentativeFiscalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalCode, legalRepresentativeFiscalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalPersonBeneficiary {\n");
    sb.append("    fiscalCode: ").append(toIndentedString(fiscalCode)).append("\n");
    sb.append("    legalRepresentativeFiscalCode: ").append(toIndentedString(legalRepresentativeFiscalCode)).append("\n");
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

