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
import org.threeten.bp.OffsetDateTime;

/**
 * QueryByConditionInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class QueryByConditionInput {
  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ONLINE_CODES = "onlineCodes";
  @SerializedName(SERIALIZED_NAME_ONLINE_CODES)
  private List<String> onlineCodes = null;

  public static final String SERIALIZED_NAME_MODEL_CODES = "modelCodes";
  @SerializedName(SERIALIZED_NAME_MODEL_CODES)
  private List<String> modelCodes = null;


  public QueryByConditionInput startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 开始时间 start time
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开始时间 start time")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public QueryByConditionInput endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束时间 end time
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结束时间 end time")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public QueryByConditionInput onlineCodes(List<String> onlineCodes) {
    
    this.onlineCodes = onlineCodes;
    return this;
  }

  public QueryByConditionInput addOnlineCodesItem(String onlineCodesItem) {
    if (this.onlineCodes == null) {
      this.onlineCodes = new ArrayList<String>();
    }
    this.onlineCodes.add(onlineCodesItem);
    return this;
  }

   /**
   * 在线点位代码列表 online point code list
   * @return onlineCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线点位代码列表 online point code list")

  public List<String> getOnlineCodes() {
    return onlineCodes;
  }


  public void setOnlineCodes(List<String> onlineCodes) {
    this.onlineCodes = onlineCodes;
  }


  public QueryByConditionInput modelCodes(List<String> modelCodes) {
    
    this.modelCodes = modelCodes;
    return this;
  }

  public QueryByConditionInput addModelCodesItem(String modelCodesItem) {
    if (this.modelCodes == null) {
      this.modelCodes = new ArrayList<String>();
    }
    this.modelCodes.add(modelCodesItem);
    return this;
  }

   /**
   * 模型节点代码列表 model node code list
   * @return modelCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模型节点代码列表 model node code list")

  public List<String> getModelCodes() {
    return modelCodes;
  }


  public void setModelCodes(List<String> modelCodes) {
    this.modelCodes = modelCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryByConditionInput queryByConditionInput = (QueryByConditionInput) o;
    return Objects.equals(this.startTime, queryByConditionInput.startTime) &&
        Objects.equals(this.endTime, queryByConditionInput.endTime) &&
        Objects.equals(this.onlineCodes, queryByConditionInput.onlineCodes) &&
        Objects.equals(this.modelCodes, queryByConditionInput.modelCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, onlineCodes, modelCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryByConditionInput {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    onlineCodes: ").append(toIndentedString(onlineCodes)).append("\n");
    sb.append("    modelCodes: ").append(toIndentedString(modelCodes)).append("\n");
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

