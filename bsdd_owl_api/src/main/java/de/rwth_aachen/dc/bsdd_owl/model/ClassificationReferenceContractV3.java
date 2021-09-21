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
 * ClassificationReferenceContractV3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-09-21T11:35:32.475Z[GMT]")
public class ClassificationReferenceContractV3 {
  @SerializedName("namespaceUri")
  private String namespaceUri = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  public ClassificationReferenceContractV3 namespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
    return this;
  }

   /**
   * Get namespaceUri
   * @return namespaceUri
  **/
  @Schema(required = true, description = "")
  public String getNamespaceUri() {
    return namespaceUri;
  }

  public void setNamespaceUri(String namespaceUri) {
    this.namespaceUri = namespaceUri;
  }

  public ClassificationReferenceContractV3 name(String name) {
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

  public ClassificationReferenceContractV3 code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationReferenceContractV3 classificationReferenceContractV3 = (ClassificationReferenceContractV3) o;
    return Objects.equals(this.namespaceUri, classificationReferenceContractV3.namespaceUri) &&
        Objects.equals(this.name, classificationReferenceContractV3.name) &&
        Objects.equals(this.code, classificationReferenceContractV3.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaceUri, name, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationReferenceContractV3 {\n");
    
    sb.append("    namespaceUri: ").append(toIndentedString(namespaceUri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
