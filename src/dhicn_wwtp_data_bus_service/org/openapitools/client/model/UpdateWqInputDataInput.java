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
import org.threeten.bp.OffsetDateTime;

/**
 * UpdateWqInputDataInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class UpdateWqInputDataInput {
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_POINT_CODE = "pointCode";
  @SerializedName(SERIALIZED_NAME_POINT_CODE)
  private String pointCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;


  public UpdateWqInputDataInput time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * 时间 time
   * @return time
  **/
  @ApiModelProperty(required = true, value = "时间 time")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public UpdateWqInputDataInput pointCode(String pointCode) {
    
    this.pointCode = pointCode;
    return this;
  }

   /**
   * 在线点位代码 online point code
   * @return pointCode
  **/
  @ApiModelProperty(required = true, value = "在线点位代码 online point code")

  public String getPointCode() {
    return pointCode;
  }


  public void setPointCode(String pointCode) {
    this.pointCode = pointCode;
  }


  public UpdateWqInputDataInput value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 数值 value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "数值 value")

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
    UpdateWqInputDataInput updateWqInputDataInput = (UpdateWqInputDataInput) o;
    return Objects.equals(this.time, updateWqInputDataInput.time) &&
        Objects.equals(this.pointCode, updateWqInputDataInput.pointCode) &&
        Objects.equals(this.value, updateWqInputDataInput.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, pointCode, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWqInputDataInput {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    pointCode: ").append(toIndentedString(pointCode)).append("\n");
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

