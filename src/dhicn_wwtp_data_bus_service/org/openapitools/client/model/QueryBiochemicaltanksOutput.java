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
 * QueryBiochemicaltanksOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class QueryBiochemicaltanksOutput {
  public static final String SERIALIZED_NAME_TANK_NO = "tankNo";
  @SerializedName(SERIALIZED_NAME_TANK_NO)
  private String tankNo;

  public static final String SERIALIZED_NAME_TANK_NAME = "tankName";
  @SerializedName(SERIALIZED_NAME_TANK_NAME)
  private String tankName;


  public QueryBiochemicaltanksOutput tankNo(String tankNo) {
    
    this.tankNo = tankNo;
    return this;
  }

   /**
   * 生化池序号 biochemical pool index
   * @return tankNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "生化池序号 biochemical pool index")

  public String getTankNo() {
    return tankNo;
  }


  public void setTankNo(String tankNo) {
    this.tankNo = tankNo;
  }


  public QueryBiochemicaltanksOutput tankName(String tankName) {
    
    this.tankName = tankName;
    return this;
  }

   /**
   * 生化池名称 biochemical pool name
   * @return tankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "生化池名称 biochemical pool name")

  public String getTankName() {
    return tankName;
  }


  public void setTankName(String tankName) {
    this.tankName = tankName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBiochemicaltanksOutput queryBiochemicaltanksOutput = (QueryBiochemicaltanksOutput) o;
    return Objects.equals(this.tankNo, queryBiochemicaltanksOutput.tankNo) &&
        Objects.equals(this.tankName, queryBiochemicaltanksOutput.tankName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tankNo, tankName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryBiochemicaltanksOutput {\n");
    sb.append("    tankNo: ").append(toIndentedString(tankNo)).append("\n");
    sb.append("    tankName: ").append(toIndentedString(tankName)).append("\n");
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
