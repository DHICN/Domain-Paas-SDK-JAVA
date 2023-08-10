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
 * CatalysisTankOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class CatalysisTankOutput {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<TsPair> values = null;


  public CatalysisTankOutput code(String code) {
    
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


  public CatalysisTankOutput unit(String unit) {
    
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


  public CatalysisTankOutput values(List<TsPair> values) {
    
    this.values = values;
    return this;
  }

  public CatalysisTankOutput addValuesItem(TsPair valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<TsPair>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * 时间序列数据 time-series result
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间序列数据 time-series result")

  public List<TsPair> getValues() {
    return values;
  }


  public void setValues(List<TsPair> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalysisTankOutput catalysisTankOutput = (CatalysisTankOutput) o;
    return Objects.equals(this.code, catalysisTankOutput.code) &&
        Objects.equals(this.unit, catalysisTankOutput.unit) &&
        Objects.equals(this.values, catalysisTankOutput.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, unit, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalysisTankOutput {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
