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
 * GroupData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class GroupData {
  public static final String SERIALIZED_NAME_BOARD_NAME = "boardName";
  @SerializedName(SERIALIZED_NAME_BOARD_NAME)
  private String boardName;

  public static final String SERIALIZED_NAME_BOARD_VALUE = "boardValue";
  @SerializedName(SERIALIZED_NAME_BOARD_VALUE)
  private Double boardValue;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public GroupData boardName(String boardName) {
    
    this.boardName = boardName;
    return this;
  }

   /**
   * 看板项名称 statistic item name
   * @return boardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "看板项名称 statistic item name")

  public String getBoardName() {
    return boardName;
  }


  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }


  public GroupData boardValue(Double boardValue) {
    
    this.boardValue = boardValue;
    return this;
  }

   /**
   * 看板项数值 statistic item value
   * @return boardValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "看板项数值 statistic item value")

  public Double getBoardValue() {
    return boardValue;
  }


  public void setBoardValue(Double boardValue) {
    this.boardValue = boardValue;
  }


  public GroupData unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 看板项单位 statistic item unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "看板项单位 statistic item unit")

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
    GroupData groupData = (GroupData) o;
    return Objects.equals(this.boardName, groupData.boardName) &&
        Objects.equals(this.boardValue, groupData.boardValue) &&
        Objects.equals(this.unit, groupData.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardName, boardValue, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupData {\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    boardValue: ").append(toIndentedString(boardValue)).append("\n");
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

