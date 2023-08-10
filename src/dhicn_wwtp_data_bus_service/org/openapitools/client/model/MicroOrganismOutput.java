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
import org.openapitools.client.model.TsPair2;

/**
 * MicroOrganismOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class MicroOrganismOutput {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<TsPair2> data = null;


  public MicroOrganismOutput code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 微生物指标代码 microorganism code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "微生物指标代码 microorganism code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public MicroOrganismOutput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 微生物指标名称 microorganism name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "微生物指标名称 microorganism name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MicroOrganismOutput unit(String unit) {
    
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


  public MicroOrganismOutput data(List<TsPair2> data) {
    
    this.data = data;
    return this;
  }

  public MicroOrganismOutput addDataItem(TsPair2 dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<TsPair2>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 时间序列数据 time-series data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间序列数据 time-series data")

  public List<TsPair2> getData() {
    return data;
  }


  public void setData(List<TsPair2> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroOrganismOutput microOrganismOutput = (MicroOrganismOutput) o;
    return Objects.equals(this.code, microOrganismOutput.code) &&
        Objects.equals(this.name, microOrganismOutput.name) &&
        Objects.equals(this.unit, microOrganismOutput.unit) &&
        Objects.equals(this.data, microOrganismOutput.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, unit, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroOrganismOutput {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

