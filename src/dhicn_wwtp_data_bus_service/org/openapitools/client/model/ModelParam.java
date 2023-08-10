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

/**
 * ModelParam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class ModelParam {
  public static final String SERIALIZED_NAME_SCENARIO_CODE = "scenarioCode";
  @SerializedName(SERIALIZED_NAME_SCENARIO_CODE)
  private String scenarioCode;

  public static final String SERIALIZED_NAME_PARA_CODE = "paraCode";
  @SerializedName(SERIALIZED_NAME_PARA_CODE)
  private String paraCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public ModelParam scenarioCode(String scenarioCode) {
    
    this.scenarioCode = scenarioCode;
    return this;
  }

   /**
   * 方案代码 scenario code
   * @return scenarioCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "方案代码 scenario code")

  public String getScenarioCode() {
    return scenarioCode;
  }


  public void setScenarioCode(String scenarioCode) {
    this.scenarioCode = scenarioCode;
  }


  public ModelParam paraCode(String paraCode) {
    
    this.paraCode = paraCode;
    return this;
  }

   /**
   * 参数代码 parameter code
   * @return paraCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参数代码 parameter code")

  public String getParaCode() {
    return paraCode;
  }


  public void setParaCode(String paraCode) {
    this.paraCode = paraCode;
  }


  public ModelParam value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 参数值 parameter value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参数值 parameter value")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public ModelParam unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 单位 unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位 unit")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public ModelParam description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 参数描述 parameter description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参数描述 parameter description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelParam modelParam = (ModelParam) o;
    return Objects.equals(this.scenarioCode, modelParam.scenarioCode) &&
        Objects.equals(this.paraCode, modelParam.paraCode) &&
        Objects.equals(this.value, modelParam.value) &&
        Objects.equals(this.unit, modelParam.unit) &&
        Objects.equals(this.description, modelParam.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioCode, paraCode, value, unit, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelParam {\n");
    sb.append("    scenarioCode: ").append(toIndentedString(scenarioCode)).append("\n");
    sb.append("    paraCode: ").append(toIndentedString(paraCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
