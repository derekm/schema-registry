/*
 * Pravega Schema Registry APIs
 * REST APIs for Pravega Schema Registry.
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pravega.schemaregistry.contract.generated.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.pravega.schemaregistry.contract.generated.rest.model.CodecType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Response object for listCodecTypes.
 */
@ApiModel(description = "Response object for listCodecTypes.")

public class CodecsList   {
  @JsonProperty("codecTypes")
  private List<CodecType> codecTypes = null;

  public CodecsList codecTypes(List<CodecType> codecTypes) {
    this.codecTypes = codecTypes;
    return this;
  }

  public CodecsList addCodecTypesItem(CodecType codecTypesItem) {
    if (this.codecTypes == null) {
      this.codecTypes = new ArrayList<CodecType>();
    }
    this.codecTypes.add(codecTypesItem);
    return this;
  }

  /**
   * List of codecTypes.
   * @return codecTypes
   **/
  @JsonProperty("codecTypes")
  @ApiModelProperty(value = "List of codecTypes.")
  public List<CodecType> getCodecTypes() {
    return codecTypes;
  }

  public void setCodecTypes(List<CodecType> codecTypes) {
    this.codecTypes = codecTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodecsList codecsList = (CodecsList) o;
    return Objects.equals(this.codecTypes, codecsList.codecTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codecTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodecsList {\n");
    
    sb.append("    codecTypes: ").append(toIndentedString(codecTypes)).append("\n");
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

