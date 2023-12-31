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
import org.openapitools.client.model.GroupData;

/**
 * DataBoardFullOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class DataBoardFullOut {
  public static final String SERIALIZED_NAME_DATA_GROUP = "dataGroup";
  @SerializedName(SERIALIZED_NAME_DATA_GROUP)
  private String dataGroup;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<GroupData> data = null;


  public DataBoardFullOut dataGroup(String dataGroup) {
    
    this.dataGroup = dataGroup;
    return this;
  }

   /**
   * 数据看板分组 statistic data group
   * @return dataGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "数据看板分组 statistic data group")

  public String getDataGroup() {
    return dataGroup;
  }


  public void setDataGroup(String dataGroup) {
    this.dataGroup = dataGroup;
  }


  public DataBoardFullOut data(List<GroupData> data) {
    
    this.data = data;
    return this;
  }

  public DataBoardFullOut addDataItem(GroupData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<GroupData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * 分组下的数据 statistic data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分组下的数据 statistic data")

  public List<GroupData> getData() {
    return data;
  }


  public void setData(List<GroupData> data) {
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
    DataBoardFullOut dataBoardFullOut = (DataBoardFullOut) o;
    return Objects.equals(this.dataGroup, dataBoardFullOut.dataGroup) &&
        Objects.equals(this.data, dataBoardFullOut.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataGroup, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataBoardFullOut {\n");
    sb.append("    dataGroup: ").append(toIndentedString(dataGroup)).append("\n");
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

