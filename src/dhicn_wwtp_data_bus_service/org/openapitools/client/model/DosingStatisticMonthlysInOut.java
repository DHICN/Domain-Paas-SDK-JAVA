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
import org.threeten.bp.OffsetDateTime;

/**
 * DosingStatisticMonthlysInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class DosingStatisticMonthlysInOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_STATISTIC_CODE = "statisticCode";
  @SerializedName(SERIALIZED_NAME_STATISTIC_CODE)
  private String statisticCode;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;

  public static final String SERIALIZED_NAME_COST_VALUE = "costValue";
  @SerializedName(SERIALIZED_NAME_COST_VALUE)
  private Double costValue;

  public static final String SERIALIZED_NAME_CAL_VALUE = "calValue";
  @SerializedName(SERIALIZED_NAME_CAL_VALUE)
  private Double calValue;

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

  public static final String SERIALIZED_NAME_PRODUCT_LINE = "productLine";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE)
  private String productLine;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;


  public DosingStatisticMonthlysInOut id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * 统计数据ID data id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "统计数据ID data id")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DosingStatisticMonthlysInOut statisticCode(String statisticCode) {
    
    this.statisticCode = statisticCode;
    return this;
  }

   /**
   * 统计编码 statistic code
   * @return statisticCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "统计编码 statistic code")

  public String getStatisticCode() {
    return statisticCode;
  }


  public void setStatisticCode(String statisticCode) {
    this.statisticCode = statisticCode;
  }


  public DosingStatisticMonthlysInOut time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * 时间 time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "时间 time")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public DosingStatisticMonthlysInOut value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 实际投加值 actual dosage
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实际投加值 actual dosage")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  public DosingStatisticMonthlysInOut costValue(Double costValue) {
    
    this.costValue = costValue;
    return this;
  }

   /**
   * 药耗值 actual dosage cost
   * @return costValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "药耗值 actual dosage cost")

  public Double getCostValue() {
    return costValue;
  }


  public void setCostValue(Double costValue) {
    this.costValue = costValue;
  }


  public DosingStatisticMonthlysInOut calValue(Double calValue) {
    
    this.calValue = calValue;
    return this;
  }

   /**
   * 计算投加值 calculated dosage
   * @return calValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "计算投加值 calculated dosage")

  public Double getCalValue() {
    return calValue;
  }


  public void setCalValue(Double calValue) {
    this.calValue = calValue;
  }


  public DosingStatisticMonthlysInOut category(CategoryEnum category) {
    
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


  public DosingStatisticMonthlysInOut productLine(String productLine) {
    
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


  public DosingStatisticMonthlysInOut tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * 租户ID tenant id
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "租户ID tenant id")

  public UUID getTenantId() {
    return tenantId;
  }


  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DosingStatisticMonthlysInOut dosingStatisticMonthlysInOut = (DosingStatisticMonthlysInOut) o;
    return Objects.equals(this.id, dosingStatisticMonthlysInOut.id) &&
        Objects.equals(this.statisticCode, dosingStatisticMonthlysInOut.statisticCode) &&
        Objects.equals(this.time, dosingStatisticMonthlysInOut.time) &&
        Objects.equals(this.value, dosingStatisticMonthlysInOut.value) &&
        Objects.equals(this.costValue, dosingStatisticMonthlysInOut.costValue) &&
        Objects.equals(this.calValue, dosingStatisticMonthlysInOut.calValue) &&
        Objects.equals(this.category, dosingStatisticMonthlysInOut.category) &&
        Objects.equals(this.productLine, dosingStatisticMonthlysInOut.productLine) &&
        Objects.equals(this.tenantId, dosingStatisticMonthlysInOut.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statisticCode, time, value, costValue, calValue, category, productLine, tenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DosingStatisticMonthlysInOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statisticCode: ").append(toIndentedString(statisticCode)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    costValue: ").append(toIndentedString(costValue)).append("\n");
    sb.append("    calValue: ").append(toIndentedString(calValue)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

