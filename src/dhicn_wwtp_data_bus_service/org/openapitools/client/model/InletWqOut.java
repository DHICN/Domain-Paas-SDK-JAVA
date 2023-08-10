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
 * InletWqOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class InletWqOut {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_SOURCE_DATAS = "sourceDatas";
  @SerializedName(SERIALIZED_NAME_SOURCE_DATAS)
  private List<TsPair> sourceDatas = null;

  public static final String SERIALIZED_NAME_PROCESS_DATAS = "processDatas";
  @SerializedName(SERIALIZED_NAME_PROCESS_DATAS)
  private List<TsPair> processDatas = null;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public InletWqOut code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 指标 indicator code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标 indicator code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public InletWqOut sourceDatas(List<TsPair> sourceDatas) {
    
    this.sourceDatas = sourceDatas;
    return this;
  }

  public InletWqOut addSourceDatasItem(TsPair sourceDatasItem) {
    if (this.sourceDatas == null) {
      this.sourceDatas = new ArrayList<TsPair>();
    }
    this.sourceDatas.add(sourceDatasItem);
    return this;
  }

   /**
   * 清洗前数据 raw data
   * @return sourceDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "清洗前数据 raw data")

  public List<TsPair> getSourceDatas() {
    return sourceDatas;
  }


  public void setSourceDatas(List<TsPair> sourceDatas) {
    this.sourceDatas = sourceDatas;
  }


  public InletWqOut processDatas(List<TsPair> processDatas) {
    
    this.processDatas = processDatas;
    return this;
  }

  public InletWqOut addProcessDatasItem(TsPair processDatasItem) {
    if (this.processDatas == null) {
      this.processDatas = new ArrayList<TsPair>();
    }
    this.processDatas.add(processDatasItem);
    return this;
  }

   /**
   * 清洗后数据 processed data
   * @return processDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "清洗后数据 processed data")

  public List<TsPair> getProcessDatas() {
    return processDatas;
  }


  public void setProcessDatas(List<TsPair> processDatas) {
    this.processDatas = processDatas;
  }


  public InletWqOut unit(String unit) {
    
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
    InletWqOut inletWqOut = (InletWqOut) o;
    return Objects.equals(this.code, inletWqOut.code) &&
        Objects.equals(this.sourceDatas, inletWqOut.sourceDatas) &&
        Objects.equals(this.processDatas, inletWqOut.processDatas) &&
        Objects.equals(this.unit, inletWqOut.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, sourceDatas, processDatas, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InletWqOut {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    sourceDatas: ").append(toIndentedString(sourceDatas)).append("\n");
    sb.append("    processDatas: ").append(toIndentedString(processDatas)).append("\n");
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

