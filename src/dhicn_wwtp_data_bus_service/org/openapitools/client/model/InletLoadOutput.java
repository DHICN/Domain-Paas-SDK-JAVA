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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TsPair;

/**
 * InletLoadOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class InletLoadOutput {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_INLET_LOAD_VALUES = "inletLoadValues";
  @SerializedName(SERIALIZED_NAME_INLET_LOAD_VALUES)
  private List<TsPair> inletLoadValues = null;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public InletLoadOutput code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 指标代码 indicator code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标代码 indicator code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InletLoadOutput inletLoadValues(List<TsPair> inletLoadValues) {
    
    this.inletLoadValues = inletLoadValues;
    return this;
  }

  public InletLoadOutput addInletLoadValuesItem(TsPair inletLoadValuesItem) {
    if (this.inletLoadValues == null) {
      this.inletLoadValues = new ArrayList<TsPair>();
    }
    this.inletLoadValues.add(inletLoadValuesItem);
    return this;
  }

   /**
   * 进水负荷值 inlet time-series load data
   * @return inletLoadValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "进水负荷值 inlet time-series load data")

  public List<TsPair> getInletLoadValues() {
    return inletLoadValues;
  }


  public void setInletLoadValues(List<TsPair> inletLoadValues) {
    this.inletLoadValues = inletLoadValues;
  }


  public InletLoadOutput unit(String unit) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InletLoadOutput inletLoadOutput = (InletLoadOutput) o;
    return Objects.equals(this.code, inletLoadOutput.code) &&
        Objects.equals(this.inletLoadValues, inletLoadOutput.inletLoadValues) &&
        Objects.equals(this.unit, inletLoadOutput.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, inletLoadValues, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InletLoadOutput {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    inletLoadValues: ").append(toIndentedString(inletLoadValues)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

