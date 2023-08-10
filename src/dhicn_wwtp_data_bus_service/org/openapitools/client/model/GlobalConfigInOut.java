/*
 * 污水业务中台领域服务
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * GlobalConfigInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class GlobalConfigInOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CONFIG_TYPE = "configType";
  @SerializedName(SERIALIZED_NAME_CONFIG_TYPE)
  private String configType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;


  public GlobalConfigInOut id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * 配置ID config id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置ID config id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public GlobalConfigInOut configType(String configType) {
    
    this.configType = configType;
    return this;
  }

   /**
   * 配置类型 config type
   * @return configType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置类型 config type")

  public String getConfigType() {
    return configType;
  }


  public void setConfigType(String configType) {
    this.configType = configType;
  }


  public GlobalConfigInOut description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 配置描述 config description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置描述 config description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GlobalConfigInOut value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 值 value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "值 value")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalConfigInOut globalConfigInOut = (GlobalConfigInOut) o;
    return Objects.equals(this.id, globalConfigInOut.id) &&
        Objects.equals(this.configType, globalConfigInOut.configType) &&
        Objects.equals(this.description, globalConfigInOut.description) &&
        Objects.equals(this.value, globalConfigInOut.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configType, description, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalConfigInOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
