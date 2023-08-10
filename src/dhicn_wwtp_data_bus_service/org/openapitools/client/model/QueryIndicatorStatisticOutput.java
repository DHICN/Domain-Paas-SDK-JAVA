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
 * QueryIndicatorStatisticOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class QueryIndicatorStatisticOutput {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_MEAN = "mean";
  @SerializedName(SERIALIZED_NAME_MEAN)
  private Double mean;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public static final String SERIALIZED_NAME_MEDIAN = "median";
  @SerializedName(SERIALIZED_NAME_MEDIAN)
  private Double median;

  public static final String SERIALIZED_NAME_UPPER_PERCENT = "upperPercent";
  @SerializedName(SERIALIZED_NAME_UPPER_PERCENT)
  private Double upperPercent;

  public static final String SERIALIZED_NAME_LOWER_PERCENT = "lowerPercent";
  @SerializedName(SERIALIZED_NAME_LOWER_PERCENT)
  private Double lowerPercent;


  public QueryIndicatorStatisticOutput code(String code) {
    
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


  public QueryIndicatorStatisticOutput unit(String unit) {
    
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


  public QueryIndicatorStatisticOutput mean(Double mean) {
    
    this.mean = mean;
    return this;
  }

   /**
   * 平均值 average value
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "平均值 average value")

  public Double getMean() {
    return mean;
  }


  public void setMean(Double mean) {
    this.mean = mean;
  }


  public QueryIndicatorStatisticOutput min(Double min) {
    
    this.min = min;
    return this;
  }

   /**
   * 最小值 minimum value
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最小值 minimum value")

  public Double getMin() {
    return min;
  }


  public void setMin(Double min) {
    this.min = min;
  }


  public QueryIndicatorStatisticOutput max(Double max) {
    
    this.max = max;
    return this;
  }

   /**
   * 最大值 maximum value
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最大值 maximum value")

  public Double getMax() {
    return max;
  }


  public void setMax(Double max) {
    this.max = max;
  }


  public QueryIndicatorStatisticOutput median(Double median) {
    
    this.median = median;
    return this;
  }

   /**
   * 中位数 median value
   * @return median
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "中位数 median value")

  public Double getMedian() {
    return median;
  }


  public void setMedian(Double median) {
    this.median = median;
  }


  public QueryIndicatorStatisticOutput upperPercent(Double upperPercent) {
    
    this.upperPercent = upperPercent;
    return this;
  }

   /**
   * 上百分位 upper percentile
   * @return upperPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上百分位 upper percentile")

  public Double getUpperPercent() {
    return upperPercent;
  }


  public void setUpperPercent(Double upperPercent) {
    this.upperPercent = upperPercent;
  }


  public QueryIndicatorStatisticOutput lowerPercent(Double lowerPercent) {
    
    this.lowerPercent = lowerPercent;
    return this;
  }

   /**
   * 下百分位 lower percentile
   * @return lowerPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下百分位 lower percentile")

  public Double getLowerPercent() {
    return lowerPercent;
  }


  public void setLowerPercent(Double lowerPercent) {
    this.lowerPercent = lowerPercent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryIndicatorStatisticOutput queryIndicatorStatisticOutput = (QueryIndicatorStatisticOutput) o;
    return Objects.equals(this.code, queryIndicatorStatisticOutput.code) &&
        Objects.equals(this.unit, queryIndicatorStatisticOutput.unit) &&
        Objects.equals(this.mean, queryIndicatorStatisticOutput.mean) &&
        Objects.equals(this.min, queryIndicatorStatisticOutput.min) &&
        Objects.equals(this.max, queryIndicatorStatisticOutput.max) &&
        Objects.equals(this.median, queryIndicatorStatisticOutput.median) &&
        Objects.equals(this.upperPercent, queryIndicatorStatisticOutput.upperPercent) &&
        Objects.equals(this.lowerPercent, queryIndicatorStatisticOutput.lowerPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, unit, mean, min, max, median, upperPercent, lowerPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryIndicatorStatisticOutput {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    upperPercent: ").append(toIndentedString(upperPercent)).append("\n");
    sb.append("    lowerPercent: ").append(toIndentedString(lowerPercent)).append("\n");
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

