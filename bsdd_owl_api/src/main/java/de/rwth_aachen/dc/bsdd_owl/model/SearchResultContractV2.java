/*
 * bSDD API prototype
 * API to access the buildingSMART Data Dictionary
 *
 * OpenAPI spec version: v1
 * Contact: bsdd_support@buildingsmart.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.rwth_aachen.dc.bsdd_owl.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SearchResultContractV2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-21T11:35:32.475Z[GMT]")
public class SearchResultContractV2 {
  @SerializedName("numberOfClassificationsFound")
  private Integer numberOfClassificationsFound = null;

  @SerializedName("domains")
  private List<DomainSearchResultContractV2> domains = null;

  public SearchResultContractV2 numberOfClassificationsFound(Integer numberOfClassificationsFound) {
    this.numberOfClassificationsFound = numberOfClassificationsFound;
    return this;
  }

   /**
   * The total number of Classifications matching the search criteria
   * @return numberOfClassificationsFound
  **/
  @Schema(description = "The total number of Classifications matching the search criteria")
  public Integer getNumberOfClassificationsFound() {
    return numberOfClassificationsFound;
  }

  public void setNumberOfClassificationsFound(Integer numberOfClassificationsFound) {
    this.numberOfClassificationsFound = numberOfClassificationsFound;
  }

  public SearchResultContractV2 domains(List<DomainSearchResultContractV2> domains) {
    this.domains = domains;
    return this;
  }

  public SearchResultContractV2 addDomainsItem(DomainSearchResultContractV2 domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<DomainSearchResultContractV2>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * The list of Domains with found Classification and ClassificationProperties
   * @return domains
  **/
  @Schema(description = "The list of Domains with found Classification and ClassificationProperties")
  public List<DomainSearchResultContractV2> getDomains() {
    return domains;
  }

  public void setDomains(List<DomainSearchResultContractV2> domains) {
    this.domains = domains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultContractV2 searchResultContractV2 = (SearchResultContractV2) o;
    return Objects.equals(this.numberOfClassificationsFound, searchResultContractV2.numberOfClassificationsFound) &&
        Objects.equals(this.domains, searchResultContractV2.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfClassificationsFound, domains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultContractV2 {\n");
    
    sb.append("    numberOfClassificationsFound: ").append(toIndentedString(numberOfClassificationsFound)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
