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

/**
 * WqOnlinePoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class WqOnlinePoint {
  public static final String SERIALIZED_NAME_PRODUCT_LINE = "productLine";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE)
  private String productLine;

  public static final String SERIALIZED_NAME_CODES = "codes";
  @SerializedName(SERIALIZED_NAME_CODES)
  private List<String> codes = null;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private List<String> units = null;

  public static final String SERIALIZED_NAME_POINT_CODES = "pointCodes";
  @SerializedName(SERIALIZED_NAME_POINT_CODES)
  private List<String> pointCodes = null;


  public WqOnlinePoint productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * 进水点或工艺线 inlet name or product line name
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "进水点或工艺线 inlet name or product line name")

  public String getProductLine() {
    return productLine;
  }


  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  public WqOnlinePoint codes(List<String> codes) {
    
    this.codes = codes;
    return this;
  }

  public WqOnlinePoint addCodesItem(String codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<String>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * 系统点位列表 system point codes/indicators
   * @return codes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统点位列表 system point codes/indicators")

  public List<String> getCodes() {
    return codes;
  }


  public void setCodes(List<String> codes) {
    this.codes = codes;
  }


  public WqOnlinePoint units(List<String> units) {
    
    this.units = units;
    return this;
  }

  public WqOnlinePoint addUnitsItem(String unitsItem) {
    if (this.units == null) {
      this.units = new ArrayList<String>();
    }
    this.units.add(unitsItem);
    return this;
  }

   /**
   * 单位列表 units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "单位列表 units")

  public List<String> getUnits() {
    return units;
  }


  public void setUnits(List<String> units) {
    this.units = units;
  }


  public WqOnlinePoint pointCodes(List<String> pointCodes) {
    
    this.pointCodes = pointCodes;
    return this;
  }

  public WqOnlinePoint addPointCodesItem(String pointCodesItem) {
    if (this.pointCodes == null) {
      this.pointCodes = new ArrayList<String>();
    }
    this.pointCodes.add(pointCodesItem);
    return this;
  }

   /**
   * 在线点位列表 corresponding online point codes
   * @return pointCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线点位列表 corresponding online point codes")

  public List<String> getPointCodes() {
    return pointCodes;
  }


  public void setPointCodes(List<String> pointCodes) {
    this.pointCodes = pointCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WqOnlinePoint wqOnlinePoint = (WqOnlinePoint) o;
    return Objects.equals(this.productLine, wqOnlinePoint.productLine) &&
        Objects.equals(this.codes, wqOnlinePoint.codes) &&
        Objects.equals(this.units, wqOnlinePoint.units) &&
        Objects.equals(this.pointCodes, wqOnlinePoint.pointCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productLine, codes, units, pointCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WqOnlinePoint {\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    pointCodes: ").append(toIndentedString(pointCodes)).append("\n");
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

