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
import org.openapitools.client.model.ModelParam;

/**
 * SaveParamInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class SaveParamInput {
  public static final String SERIALIZED_NAME_SCENARIO_ID = "scenarioId";
  @SerializedName(SERIALIZED_NAME_SCENARIO_ID)
  private UUID scenarioId;

  public static final String SERIALIZED_NAME_PRODUCT_LINE = "productLine";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINE)
  private String productLine;

  public static final String SERIALIZED_NAME_IS_NEW = "isNew";
  @SerializedName(SERIALIZED_NAME_IS_NEW)
  private Boolean isNew;

  public static final String SERIALIZED_NAME_MODEL_PARAMS = "modelParams";
  @SerializedName(SERIALIZED_NAME_MODEL_PARAMS)
  private List<ModelParam> modelParams = null;


  public SaveParamInput scenarioId(UUID scenarioId) {
    
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


  public SaveParamInput productLine(String productLine) {
    
    this.productLine = productLine;
    return this;
  }

   /**
   * 工艺线代码 product line code
   * @return productLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "工艺线代码 product line code")

  public String getProductLine() {
    return productLine;
  }


  public void setProductLine(String productLine) {
    this.productLine = productLine;
  }


  public SaveParamInput isNew(Boolean isNew) {
    
    this.isNew = isNew;
    return this;
  }

   /**
   * 是否是新建方案 if the scenario is new
   * @return isNew
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否是新建方案 if the scenario is new")

  public Boolean getIsNew() {
    return isNew;
  }


  public void setIsNew(Boolean isNew) {
    this.isNew = isNew;
  }


  public SaveParamInput modelParams(List<ModelParam> modelParams) {
    
    this.modelParams = modelParams;
    return this;
  }

  public SaveParamInput addModelParamsItem(ModelParam modelParamsItem) {
    if (this.modelParams == null) {
      this.modelParams = new ArrayList<ModelParam>();
    }
    this.modelParams.add(modelParamsItem);
    return this;
  }

   /**
   * 模型参数列表 moel parameter list
   * @return modelParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模型参数列表 moel parameter list")

  public List<ModelParam> getModelParams() {
    return modelParams;
  }


  public void setModelParams(List<ModelParam> modelParams) {
    this.modelParams = modelParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveParamInput saveParamInput = (SaveParamInput) o;
    return Objects.equals(this.scenarioId, saveParamInput.scenarioId) &&
        Objects.equals(this.productLine, saveParamInput.productLine) &&
        Objects.equals(this.isNew, saveParamInput.isNew) &&
        Objects.equals(this.modelParams, saveParamInput.modelParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioId, productLine, isNew, modelParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveParamInput {\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    productLine: ").append(toIndentedString(productLine)).append("\n");
    sb.append("    isNew: ").append(toIndentedString(isNew)).append("\n");
    sb.append("    modelParams: ").append(toIndentedString(modelParams)).append("\n");
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

