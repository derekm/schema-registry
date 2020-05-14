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
import io.pravega.schemaregistry.contract.generated.rest.model.SchemaType;
import io.pravega.schemaregistry.contract.generated.rest.model.SchemaValidationRules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;

/**
 * GroupProperties
 */

public class GroupProperties   {
  @JsonProperty("schemaValidationRules")
  private SchemaValidationRules schemaValidationRules = null;

  @JsonProperty("schemaType")
  private SchemaType schemaType = null;

  @JsonProperty("versionBySchemaName")
  private Boolean versionBySchemaName = null;

  @JsonProperty("properties")
  private Map<String, String> properties = null;

  public GroupProperties schemaValidationRules(SchemaValidationRules schemaValidationRules) {
    this.schemaValidationRules = schemaValidationRules;
    return this;
  }

  /**
   * Get schemaValidationRules
   * @return schemaValidationRules
   **/
  @JsonProperty("schemaValidationRules")
  @ApiModelProperty(value = "")
  public SchemaValidationRules getSchemaValidationRules() {
    return schemaValidationRules;
  }

  public void setSchemaValidationRules(SchemaValidationRules schemaValidationRules) {
    this.schemaValidationRules = schemaValidationRules;
  }

  public GroupProperties schemaType(SchemaType schemaType) {
    this.schemaType = schemaType;
    return this;
  }

  /**
   * Get schemaType
   * @return schemaType
   **/
  @JsonProperty("schemaType")
  @ApiModelProperty(value = "")
  public SchemaType getSchemaType() {
    return schemaType;
  }

  public void setSchemaType(SchemaType schemaType) {
    this.schemaType = schemaType;
  }

  public GroupProperties versionBySchemaName(Boolean versionBySchemaName) {
    this.versionBySchemaName = versionBySchemaName;
    return this;
  }

  /**
   * Get versionBySchemaName
   * @return versionBySchemaName
   **/
  @JsonProperty("versionBySchemaName")
  @ApiModelProperty(value = "")
  public Boolean isVersionBySchemaName() {
    return versionBySchemaName;
  }

  public void setVersionBySchemaName(Boolean versionBySchemaName) {
    this.versionBySchemaName = versionBySchemaName;
  }

  public GroupProperties properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public GroupProperties putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   **/
  @JsonProperty("properties")
  @ApiModelProperty(value = "")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupProperties groupProperties = (GroupProperties) o;
    return Objects.equals(this.schemaValidationRules, groupProperties.schemaValidationRules) &&
        Objects.equals(this.schemaType, groupProperties.schemaType) &&
        Objects.equals(this.versionBySchemaName, groupProperties.versionBySchemaName) &&
        Objects.equals(this.properties, groupProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaValidationRules, schemaType, versionBySchemaName, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupProperties {\n");
    
    sb.append("    schemaValidationRules: ").append(toIndentedString(schemaValidationRules)).append("\n");
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
    sb.append("    versionBySchemaName: ").append(toIndentedString(versionBySchemaName)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
