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
import org.openapitools.client.model.ConfigItem;

/**
 * ResultSetting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class ResultSetting {
  /**
   * 配置项类型 config type
   */
  @JsonAdapter(ConfigTypeEnum.Adapter.class)
  public enum ConfigTypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    ConfigTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigTypeEnum fromValue(Integer value) {
      for (ConfigTypeEnum b : ConfigTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfigTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ConfigTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONFIG_TYPE = "configType";
  @SerializedName(SERIALIZED_NAME_CONFIG_TYPE)
  private ConfigTypeEnum configType;

  public static final String SERIALIZED_NAME_CONFIG_ITEMS = "configItems";
  @SerializedName(SERIALIZED_NAME_CONFIG_ITEMS)
  private List<ConfigItem> configItems = null;


  public ResultSetting configType(ConfigTypeEnum configType) {
    
    this.configType = configType;
    return this;
  }

   /**
   * 配置项类型 config type
   * @return configType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置项类型 config type")

  public ConfigTypeEnum getConfigType() {
    return configType;
  }


  public void setConfigType(ConfigTypeEnum configType) {
    this.configType = configType;
  }


  public ResultSetting configItems(List<ConfigItem> configItems) {
    
    this.configItems = configItems;
    return this;
  }

  public ResultSetting addConfigItemsItem(ConfigItem configItemsItem) {
    if (this.configItems == null) {
      this.configItems = new ArrayList<ConfigItem>();
    }
    this.configItems.add(configItemsItem);
    return this;
  }

   /**
   * 配置项列表 config items
   * @return configItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配置项列表 config items")

  public List<ConfigItem> getConfigItems() {
    return configItems;
  }


  public void setConfigItems(List<ConfigItem> configItems) {
    this.configItems = configItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSetting resultSetting = (ResultSetting) o;
    return Objects.equals(this.configType, resultSetting.configType) &&
        Objects.equals(this.configItems, resultSetting.configItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configType, configItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSetting {\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    configItems: ").append(toIndentedString(configItems)).append("\n");
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

