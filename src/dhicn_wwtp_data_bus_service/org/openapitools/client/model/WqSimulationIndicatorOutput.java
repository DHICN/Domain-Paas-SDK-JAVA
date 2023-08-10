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
 * WqSimulationIndicatorOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class WqSimulationIndicatorOutput {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CONFIG_NAME = "configName";
  @SerializedName(SERIALIZED_NAME_CONFIG_NAME)
  private String configName;

  public static final String SERIALIZED_NAME_CONFIG_DESC = "configDesc";
  @SerializedName(SERIALIZED_NAME_CONFIG_DESC)
  private String configDesc;

  public static final String SERIALIZED_NAME_IS_DISPLAY = "isDisplay";
  @SerializedName(SERIALIZED_NAME_IS_DISPLAY)
  private Boolean isDisplay;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;


  public WqSimulationIndicatorOutput id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * 指标ID indicator id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标ID indicator id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public WqSimulationIndicatorOutput configName(String configName) {
    
    this.configName = configName;
    return this;
  }

   /**
   * 指标代码 indicator code
   * @return configName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标代码 indicator code")

  public String getConfigName() {
    return configName;
  }


  public void setConfigName(String configName) {
    this.configName = configName;
  }


  public WqSimulationIndicatorOutput configDesc(String configDesc) {
    
    this.configDesc = configDesc;
    return this;
  }

   /**
   * 指标描述 indicator description
   * @return configDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标描述 indicator description")

  public String getConfigDesc() {
    return configDesc;
  }


  public void setConfigDesc(String configDesc) {
    this.configDesc = configDesc;
  }


  public WqSimulationIndicatorOutput isDisplay(Boolean isDisplay) {
    
    this.isDisplay = isDisplay;
    return this;
  }

   /**
   * 是否展示 if display at the front end
   * @return isDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否展示 if display at the front end")

  public Boolean getIsDisplay() {
    return isDisplay;
  }


  public void setIsDisplay(Boolean isDisplay) {
    this.isDisplay = isDisplay;
  }


  public WqSimulationIndicatorOutput index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * 展示序号 display index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "展示序号 display index")

  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WqSimulationIndicatorOutput wqSimulationIndicatorOutput = (WqSimulationIndicatorOutput) o;
    return Objects.equals(this.id, wqSimulationIndicatorOutput.id) &&
        Objects.equals(this.configName, wqSimulationIndicatorOutput.configName) &&
        Objects.equals(this.configDesc, wqSimulationIndicatorOutput.configDesc) &&
        Objects.equals(this.isDisplay, wqSimulationIndicatorOutput.isDisplay) &&
        Objects.equals(this.index, wqSimulationIndicatorOutput.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configName, configDesc, isDisplay, index);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WqSimulationIndicatorOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
    sb.append("    configDesc: ").append(toIndentedString(configDesc)).append("\n");
    sb.append("    isDisplay: ").append(toIndentedString(isDisplay)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

