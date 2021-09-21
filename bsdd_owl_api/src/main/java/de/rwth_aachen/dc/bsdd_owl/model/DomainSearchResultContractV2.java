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
 * DomainSearchResultContractV2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-21T11:35:32.475Z[GMT]")
public class DomainSearchResultContractV2 {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespaceUri")
  private String namespaceUri = null;

  @SerializedName("classifications")
  private List<ClassificationSearchResultContractV2> classifications = null;

  public DomainSearchResultContractV2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DomainSearchResultContractV2 namespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
    return this;
  }

   /**
   * Get namespaceUri
   * @return namespaceUri
  **/
  @Schema(description = "")
  public String getNamespaceUri() {
    return namespaceUri;
  }

  public void setNamespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
  }

  public DomainSearchResultContractV2 classifications(List<ClassificationSearchResultContractV2> classifications) {
    this.classifications = classifications;
    return this;
  }

  public DomainSearchResultContractV2 addClassificationsItem(ClassificationSearchResultContractV2 classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new ArrayList<ClassificationSearchResultContractV2>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Get classifications
   * @return classifications
  **/
  @Schema(description = "")
  public List<ClassificationSearchResultContractV2> getClassifications() {
    return classifications;
  }

  public void setClassifications(List<ClassificationSearchResultContractV2> classifications) {
    this.classifications = classifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainSearchResultContractV2 domainSearchResultContractV2 = (DomainSearchResultContractV2) o;
    return Objects.equals(this.name, domainSearchResultContractV2.name) &&
        Objects.equals(this.namespaceUri, domainSearchResultContractV2.namespaceUri) &&
        Objects.equals(this.classifications, domainSearchResultContractV2.classifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespaceUri, classifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainSearchResultContractV2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceUri: ").append(toIndentedString(namespaceUri)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
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
