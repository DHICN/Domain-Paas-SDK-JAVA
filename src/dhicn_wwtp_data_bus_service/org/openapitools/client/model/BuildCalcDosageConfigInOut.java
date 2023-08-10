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
import java.util.UUID;

/**
 * BuildCalcDosageConfigInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class BuildCalcDosageConfigInOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PARAM = "param";
  @SerializedName(SERIALIZED_NAME_PARAM)
  private String param;

  public static final String SERIALIZED_NAME_SYS_CODE = "sysCode";
  @SerializedName(SERIALIZED_NAME_SYS_CODE)
  private String sysCode;

  public static final String SERIALIZED_NAME_EXT_INFO = "extInfo";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  /**
   * 药剂投加类别
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4);

    private Integer value;

    CategoryEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(Integer value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_POINT_TYPE = "pointType";
  @SerializedName(SERIALIZED_NAME_POINT_TYPE)
  private String pointType;

  public static final String SERIALIZED_NAME_IS_INPUT_POINT = "isInputPoint";
  @SerializedName(SERIALIZED_NAME_IS_INPUT_POINT)
  private Boolean isInputPoint;

  public static final String SERIALIZED_NAME_PRODUCT_LINE = "productLine";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE)
  private String productLine;


  public BuildCalcDosageConfigInOut id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * 配置ID config id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置ID config id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public BuildCalcDosageConfigInOut param(String param) {
    
    this.param = param;
    return this;
  }

   /**
   * 参数名 parameter name
   * @return param
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "参数名 parameter name")

  public String getParam() {
    return param;
  }


  public void setParam(String param) {
    this.param = param;
  }


  public BuildCalcDosageConfigInOut sysCode(String sysCode) {
    
    this.sysCode = sysCode;
    return this;
  }

   /**
   * 系统代码 system code
   * @return sysCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统代码 system code")

  public String getSysCode() {
    return sysCode;
  }


  public void setSysCode(String sysCode) {
    this.sysCode = sysCode;
  }


  public BuildCalcDosageConfigInOut extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 生化池序号 biochemical pool index
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "生化池序号 biochemical pool index")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public BuildCalcDosageConfigInOut category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * 药剂投加类别
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "药剂投加类别")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public BuildCalcDosageConfigInOut action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * 该参数用途 parameter usage
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "该参数用途 parameter usage")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public BuildCalcDosageConfigInOut code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 系统点位编码 system point code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统点位编码 system point code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public BuildCalcDosageConfigInOut pointType(String pointType) {
    
    this.pointType = pointType;
    return this;
  }

   /**
   * 点位类型 point type
   * @return pointType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "点位类型 point type")

  public String getPointType() {
    return pointType;
  }


  public void setPointType(String pointType) {
    this.pointType = pointType;
  }


  public BuildCalcDosageConfigInOut isInputPoint(Boolean isInputPoint) {
    
    this.isInputPoint = isInputPoint;
    return this;
  }

   /**
   * 是否为输入点位 if it is an online point for input
   * @return isInputPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否为输入点位 if it is an online point for input")

  public Boolean getIsInputPoint() {
    return isInputPoint;
  }


  public void setIsInputPoint(Boolean isInputPoint) {
    this.isInputPoint = isInputPoint;
  }


  public BuildCalcDosageConfigInOut productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * 生产线代码 product line code
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "生产线代码 product line code")

  public String getProductLine() {
    return productLine;
  }


  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildCalcDosageConfigInOut buildCalcDosageConfigInOut = (BuildCalcDosageConfigInOut) o;
    return Objects.equals(this.id, buildCalcDosageConfigInOut.id) &&
        Objects.equals(this.param, buildCalcDosageConfigInOut.param) &&
        Objects.equals(this.sysCode, buildCalcDosageConfigInOut.sysCode) &&
        Objects.equals(this.extInfo, buildCalcDosageConfigInOut.extInfo) &&
        Objects.equals(this.category, buildCalcDosageConfigInOut.category) &&
        Objects.equals(this.action, buildCalcDosageConfigInOut.action) &&
        Objects.equals(this.code, buildCalcDosageConfigInOut.code) &&
        Objects.equals(this.pointType, buildCalcDosageConfigInOut.pointType) &&
        Objects.equals(this.isInputPoint, buildCalcDosageConfigInOut.isInputPoint) &&
        Objects.equals(this.productLine, buildCalcDosageConfigInOut.productLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, param, sysCode, extInfo, category, action, code, pointType, isInputPoint, productLine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildCalcDosageConfigInOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    sysCode: ").append(toIndentedString(sysCode)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    pointType: ").append(toIndentedString(pointType)).append("\n");
    sb.append("    isInputPoint: ").append(toIndentedString(isInputPoint)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
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

