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
 * AlarmConfigInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class AlarmConfigInOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NODE_CODE = "nodeCode";
  @SerializedName(SERIALIZED_NAME_NODE_CODE)
  private String nodeCode;

  public static final String SERIALIZED_NAME_INDICATOR = "indicator";
  @SerializedName(SERIALIZED_NAME_INDICATOR)
  private String indicator;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private Integer grade;

  public static final String SERIALIZED_NAME_MAX_VALUE = "maxValue";
  @SerializedName(SERIALIZED_NAME_MAX_VALUE)
  private Double maxValue;

  public static final String SERIALIZED_NAME_MIN_VALUE = "minValue";
  @SerializedName(SERIALIZED_NAME_MIN_VALUE)
  private Double minValue;

  /**
   * 警报类型 alarm type
   */
  @JsonAdapter(AlarmTypeEnum.Adapter.class)
  public enum AlarmTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    AlarmTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlarmTypeEnum fromValue(Integer value) {
      for (AlarmTypeEnum b : AlarmTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlarmTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlarmTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlarmTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return AlarmTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALARM_TYPE = "alarmType";
  @SerializedName(SERIALIZED_NAME_ALARM_TYPE)
  private AlarmTypeEnum alarmType;

  /**
   * 节点类型 node type
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    NodeTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NodeTypeEnum fromValue(Integer value) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return NodeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NODE_TYPE = "nodeType";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE)
  private NodeTypeEnum nodeType;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public AlarmConfigInOut id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AlarmConfigInOut nodeCode(String nodeCode) {
    
    this.nodeCode = nodeCode;
    return this;
  }

   /**
   * 节点编码 code
   * @return nodeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "节点编码 code")

  public String getNodeCode() {
    return nodeCode;
  }


  public void setNodeCode(String nodeCode) {
    this.nodeCode = nodeCode;
  }


  public AlarmConfigInOut indicator(String indicator) {
    
    this.indicator = indicator;
    return this;
  }

   /**
   * 指标 indicator
   * @return indicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指标 indicator")

  public String getIndicator() {
    return indicator;
  }


  public void setIndicator(String indicator) {
    this.indicator = indicator;
  }


  public AlarmConfigInOut grade(Integer grade) {
    
    this.grade = grade;
    return this;
  }

   /**
   * 报警等级 alarm grade
   * @return grade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "报警等级 alarm grade")

  public Integer getGrade() {
    return grade;
  }


  public void setGrade(Integer grade) {
    this.grade = grade;
  }


  public AlarmConfigInOut maxValue(Double maxValue) {
    
    this.maxValue = maxValue;
    return this;
  }

   /**
   * 最大值 maximum value
   * @return maxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最大值 maximum value")

  public Double getMaxValue() {
    return maxValue;
  }


  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }


  public AlarmConfigInOut minValue(Double minValue) {
    
    this.minValue = minValue;
    return this;
  }

   /**
   * 最小值 minimum value
   * @return minValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "最小值 minimum value")

  public Double getMinValue() {
    return minValue;
  }


  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }


  public AlarmConfigInOut alarmType(AlarmTypeEnum alarmType) {
    
    this.alarmType = alarmType;
    return this;
  }

   /**
   * 警报类型 alarm type
   * @return alarmType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "警报类型 alarm type")

  public AlarmTypeEnum getAlarmType() {
    return alarmType;
  }


  public void setAlarmType(AlarmTypeEnum alarmType) {
    this.alarmType = alarmType;
  }


  public AlarmConfigInOut nodeType(NodeTypeEnum nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * 节点类型 node type
   * @return nodeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "节点类型 node type")

  public NodeTypeEnum getNodeType() {
    return nodeType;
  }


  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }


  public AlarmConfigInOut unit(String unit) {
    
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


  public AlarmConfigInOut message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 报警信息 alarm message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "报警信息 alarm message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmConfigInOut alarmConfigInOut = (AlarmConfigInOut) o;
    return Objects.equals(this.id, alarmConfigInOut.id) &&
        Objects.equals(this.nodeCode, alarmConfigInOut.nodeCode) &&
        Objects.equals(this.indicator, alarmConfigInOut.indicator) &&
        Objects.equals(this.grade, alarmConfigInOut.grade) &&
        Objects.equals(this.maxValue, alarmConfigInOut.maxValue) &&
        Objects.equals(this.minValue, alarmConfigInOut.minValue) &&
        Objects.equals(this.alarmType, alarmConfigInOut.alarmType) &&
        Objects.equals(this.nodeType, alarmConfigInOut.nodeType) &&
        Objects.equals(this.unit, alarmConfigInOut.unit) &&
        Objects.equals(this.message, alarmConfigInOut.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nodeCode, indicator, grade, maxValue, minValue, alarmType, nodeType, unit, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmConfigInOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nodeCode: ").append(toIndentedString(nodeCode)).append("\n");
    sb.append("    indicator: ").append(toIndentedString(indicator)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

