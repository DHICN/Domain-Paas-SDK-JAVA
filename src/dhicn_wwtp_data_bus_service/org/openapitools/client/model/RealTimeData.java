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
import org.openapitools.client.model.TsData;

/**
 * RealTimeData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class RealTimeData {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LATEST_VALUE = "latestValue";
  @SerializedName(SERIALIZED_NAME_LATEST_VALUE)
  private Double latestValue;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TS_DATAS = "tsDatas";
  @SerializedName(SERIALIZED_NAME_TS_DATAS)
  private List<TsData> tsDatas = null;


  public RealTimeData code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 毒性指标 toxicity indicator
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "毒性指标 toxicity indicator")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public RealTimeData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 指标名称 indicator name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标名称 indicator name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RealTimeData latestValue(Double latestValue) {
    
    this.latestValue = latestValue;
    return this;
  }

   /**
   * 最新值 latest value
   * @return latestValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最新值 latest value")

  public Double getLatestValue() {
    return latestValue;
  }


  public void setLatestValue(Double latestValue) {
    this.latestValue = latestValue;
  }


  public RealTimeData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 毒性描述 toxicity description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "毒性描述 toxicity description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RealTimeData tsDatas(List<TsData> tsDatas) {
    
    this.tsDatas = tsDatas;
    return this;
  }

  public RealTimeData addTsDatasItem(TsData tsDatasItem) {
    if (this.tsDatas == null) {
      this.tsDatas = new ArrayList<TsData>();
    }
    this.tsDatas.add(tsDatasItem);
    return this;
  }

   /**
   * 时间序列数据 time-series data
   * @return tsDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间序列数据 time-series data")

  public List<TsData> getTsDatas() {
    return tsDatas;
  }


  public void setTsDatas(List<TsData> tsDatas) {
    this.tsDatas = tsDatas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeData realTimeData = (RealTimeData) o;
    return Objects.equals(this.code, realTimeData.code) &&
        Objects.equals(this.name, realTimeData.name) &&
        Objects.equals(this.latestValue, realTimeData.latestValue) &&
        Objects.equals(this.description, realTimeData.description) &&
        Objects.equals(this.tsDatas, realTimeData.tsDatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, latestValue, description, tsDatas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeData {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    latestValue: ").append(toIndentedString(latestValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tsDatas: ").append(toIndentedString(tsDatas)).append("\n");
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

