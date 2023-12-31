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
 * ToxicAlarmsOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class ToxicAlarmsOutput {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  /**
   * 毒性程度 toxicity level
   */
  @JsonAdapter(ToxicLevelEnum.Adapter.class)
  public enum ToxicLevelEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    ToxicLevelEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ToxicLevelEnum fromValue(Integer value) {
      for (ToxicLevelEnum b : ToxicLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ToxicLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ToxicLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ToxicLevelEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ToxicLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOXIC_LEVEL = "toxicLevel";
  @SerializedName(SERIALIZED_NAME_TOXIC_LEVEL)
  private ToxicLevelEnum toxicLevel;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public ToxicAlarmsOutput location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * 毒性仪位置 toxicity meter location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "毒性仪位置 toxicity meter location")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public ToxicAlarmsOutput time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * 预警时刻 alarm time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "预警时刻 alarm time")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public ToxicAlarmsOutput toxicLevel(ToxicLevelEnum toxicLevel) {
    
    this.toxicLevel = toxicLevel;
    return this;
  }

   /**
   * 毒性程度 toxicity level
   * @return toxicLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "毒性程度 toxicity level")

  public ToxicLevelEnum getToxicLevel() {
    return toxicLevel;
  }


  public void setToxicLevel(ToxicLevelEnum toxicLevel) {
    this.toxicLevel = toxicLevel;
  }


   /**
   * 毒性程度描述 toxicity level description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "毒性程度描述 toxicity level description")

  public String getDescription() {
    return description;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToxicAlarmsOutput toxicAlarmsOutput = (ToxicAlarmsOutput) o;
    return Objects.equals(this.location, toxicAlarmsOutput.location) &&
        Objects.equals(this.time, toxicAlarmsOutput.time) &&
        Objects.equals(this.toxicLevel, toxicAlarmsOutput.toxicLevel) &&
        Objects.equals(this.description, toxicAlarmsOutput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, time, toxicLevel, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToxicAlarmsOutput {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    toxicLevel: ").append(toIndentedString(toxicLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

