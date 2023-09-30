package com.cashaccountmanagement.client.fabrick.model.v1;

import java.net.URI;
import java.util.Objects;
import com.cashaccountmanagement.client.fabrick.model.v1.LegalPersonBeneficiary;
import com.cashaccountmanagement.client.fabrick.model.v1.NaturalPersonBeneficiary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaxRelief
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T23:01:26.207791600+02:00[Europe/Berlin]")
public class TaxRelief   {

  @JsonProperty("taxReliefId")
  private String taxReliefId;

  @JsonProperty("isCondoUpgrade")
  private Boolean isCondoUpgrade;

  @JsonProperty("creditorFiscalCode")
  private String creditorFiscalCode;

  @JsonProperty("beneficiaryType")
  private String beneficiaryType;

  @JsonProperty("naturalPersonBeneficiary")
  private NaturalPersonBeneficiary naturalPersonBeneficiary;

  @JsonProperty("legalPersonBeneficiary")
  private LegalPersonBeneficiary legalPersonBeneficiary;

  public TaxRelief taxReliefId(String taxReliefId) {
    this.taxReliefId = taxReliefId;
    return this;
  }

  /**
   * Get taxReliefId
   * @return taxReliefId
  */
  
  @Schema(name = "taxReliefId", required = false)
  public String getTaxReliefId() {
    return taxReliefId;
  }

  public void setTaxReliefId(String taxReliefId) {
    this.taxReliefId = taxReliefId;
  }

  public TaxRelief isCondoUpgrade(Boolean isCondoUpgrade) {
    this.isCondoUpgrade = isCondoUpgrade;
    return this;
  }

  /**
   * Get isCondoUpgrade
   * @return isCondoUpgrade
  */
  @NotNull 
  @Schema(name = "isCondoUpgrade", required = true)
  public Boolean getIsCondoUpgrade() {
    return isCondoUpgrade;
  }

  public void setIsCondoUpgrade(Boolean isCondoUpgrade) {
    this.isCondoUpgrade = isCondoUpgrade;
  }

  public TaxRelief creditorFiscalCode(String creditorFiscalCode) {
    this.creditorFiscalCode = creditorFiscalCode;
    return this;
  }

  /**
   * Get creditorFiscalCode
   * @return creditorFiscalCode
  */
  @NotNull 
  @Schema(name = "creditorFiscalCode", required = true)
  public String getCreditorFiscalCode() {
    return creditorFiscalCode;
  }

  public void setCreditorFiscalCode(String creditorFiscalCode) {
    this.creditorFiscalCode = creditorFiscalCode;
  }

  public TaxRelief beneficiaryType(String beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
    return this;
  }

  /**
   * Get beneficiaryType
   * @return beneficiaryType
  */
  @NotNull 
  @Schema(name = "beneficiaryType", required = true)
  public String getBeneficiaryType() {
    return beneficiaryType;
  }

  public void setBeneficiaryType(String beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
  }

  public TaxRelief naturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
    this.naturalPersonBeneficiary = naturalPersonBeneficiary;
    return this;
  }

  /**
   * Get naturalPersonBeneficiary
   * @return naturalPersonBeneficiary
  */
  @Valid 
  @Schema(name = "naturalPersonBeneficiary", required = false)
  public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
    return naturalPersonBeneficiary;
  }

  public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
    this.naturalPersonBeneficiary = naturalPersonBeneficiary;
  }

  public TaxRelief legalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
    this.legalPersonBeneficiary = legalPersonBeneficiary;
    return this;
  }

  /**
   * Get legalPersonBeneficiary
   * @return legalPersonBeneficiary
  */
  @Valid 
  @Schema(name = "legalPersonBeneficiary", required = false)
  public LegalPersonBeneficiary getLegalPersonBeneficiary() {
    return legalPersonBeneficiary;
  }

  public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
    this.legalPersonBeneficiary = legalPersonBeneficiary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRelief taxRelief = (TaxRelief) o;
    return Objects.equals(this.taxReliefId, taxRelief.taxReliefId) &&
        Objects.equals(this.isCondoUpgrade, taxRelief.isCondoUpgrade) &&
        Objects.equals(this.creditorFiscalCode, taxRelief.creditorFiscalCode) &&
        Objects.equals(this.beneficiaryType, taxRelief.beneficiaryType) &&
        Objects.equals(this.naturalPersonBeneficiary, taxRelief.naturalPersonBeneficiary) &&
        Objects.equals(this.legalPersonBeneficiary, taxRelief.legalPersonBeneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxReliefId, isCondoUpgrade, creditorFiscalCode, beneficiaryType, naturalPersonBeneficiary, legalPersonBeneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRelief {\n");
    sb.append("    taxReliefId: ").append(toIndentedString(taxReliefId)).append("\n");
    sb.append("    isCondoUpgrade: ").append(toIndentedString(isCondoUpgrade)).append("\n");
    sb.append("    creditorFiscalCode: ").append(toIndentedString(creditorFiscalCode)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    naturalPersonBeneficiary: ").append(toIndentedString(naturalPersonBeneficiary)).append("\n");
    sb.append("    legalPersonBeneficiary: ").append(toIndentedString(legalPersonBeneficiary)).append("\n");
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

