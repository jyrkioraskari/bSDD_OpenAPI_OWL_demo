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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ClassificationRelationContractV3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-21T11:35:32.475Z[GMT]")
public class ClassificationRelationContractV3 {
  @SerializedName("relationType")
  private String relationType = null;

  @SerializedName("relatedClassificationUri")
  private String relatedClassificationUri = null;

  @SerializedName("relatedClassificationName")
  private String relatedClassificationName = null;

  public ClassificationRelationContractV3 relationType(String relationType) {
    this.relationType = relationType;
    return this;
  }

   /**
   * Can be one of: HasReference, IsEqualTo, IsSynonymOf, IsParentOf, IsChildOf, HasPart
   * @return relationType
  **/
  @Schema(required = true, description = "Can be one of: HasReference, IsEqualTo, IsSynonymOf, IsParentOf, IsChildOf, HasPart")
  public String getRelationType() {
    return relationType;
  }

  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }

  public ClassificationRelationContractV3 relatedClassificationUri(String relatedClassificationUri) {
    this.relatedClassificationUri = relatedClassificationUri;
    return this;
  }

   /**
   * Namespace URI of the related classification
   * @return relatedClassificationUri
  **/
  @Schema(required = true, description = "Namespace URI of the related classification")
  public String getRelatedClassificationUri() {
    return relatedClassificationUri;
  }

  public void setRelatedClassificationUri(String relatedClassificationUri) {
    this.relatedClassificationUri = relatedClassificationUri;
  }

  public ClassificationRelationContractV3 relatedClassificationName(String relatedClassificationName) {
    this.relatedClassificationName = relatedClassificationName;
    return this;
  }

   /**
   * Name of the related classification
   * @return relatedClassificationName
  **/
  @Schema(description = "Name of the related classification")
  public String getRelatedClassificationName() {
    return relatedClassificationName;
  }

  public void setRelatedClassificationName(String relatedClassificationName) {
    this.relatedClassificationName = relatedClassificationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationRelationContractV3 classificationRelationContractV3 = (ClassificationRelationContractV3) o;
    return Objects.equals(this.relationType, classificationRelationContractV3.relationType) &&
        Objects.equals(this.relatedClassificationUri, classificationRelationContractV3.relatedClassificationUri) &&
        Objects.equals(this.relatedClassificationName, classificationRelationContractV3.relatedClassificationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationType, relatedClassificationUri, relatedClassificationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationRelationContractV3 {\n");
    
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
    sb.append("    relatedClassificationUri: ").append(toIndentedString(relatedClassificationUri)).append("\n");
    sb.append("    relatedClassificationName: ").append(toIndentedString(relatedClassificationName)).append("\n");
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