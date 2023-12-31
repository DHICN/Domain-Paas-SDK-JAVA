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
import java.util.UUID;
import org.openapitools.client.model.ResultSetting;

/**
 * ResultParam
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class ResultParam {
  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private UUID scenarioId;

  public static final String SERIALIZED_NAME_RESULT_SETTINGS = "resultSettings";
  @SerializedName(SERIALIZED_NAME_RESULT_SETTINGS)
  private List<ResultSetting> resultSettings = null;


  public ResultParam scenarioId(UUID scenarioId) {
    
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * 方案ID scenario id
   * @return scenarioId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "方案ID scenario id")

  public UUID getScenarioId() {
    return scenarioId;
  }


  public void setScenarioId(UUID scenarioId) {
    this.scenarioId = scenarioId;
  }


  public ResultParam resultSettings(List<ResultSetting> resultSettings) {
    
    this.resultSettings = resultSettings;
    return this;
  }

  public ResultParam addResultSettingsItem(ResultSetting resultSettingsItem) {
    if (this.resultSettings == null) {
      this.resultSettings = new ArrayList<ResultSetting>();
    }
    this.resultSettings.add(resultSettingsItem);
    return this;
  }

   /**
   * 结果设置 result setting data
   * @return resultSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "结果设置 result setting data")

  public List<ResultSetting> getResultSettings() {
    return resultSettings;
  }


  public void setResultSettings(List<ResultSetting> resultSettings) {
    this.resultSettings = resultSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultParam resultParam = (ResultParam) o;
    return Objects.equals(this.scenarioId, resultParam.scenarioId) &&
        Objects.equals(this.resultSettings, resultParam.resultSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioId, resultSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultParam {\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    resultSettings: ").append(toIndentedString(resultSettings)).append("\n");
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

