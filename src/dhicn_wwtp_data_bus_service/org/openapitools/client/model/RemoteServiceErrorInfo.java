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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.RemoteServiceValidationErrorInfo;

/**
 * RemoteServiceErrorInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class RemoteServiceErrorInfo {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, String> data = null;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<RemoteServiceValidationErrorInfo> validationErrors = null;


  public RemoteServiceErrorInfo code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public RemoteServiceErrorInfo message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public RemoteServiceErrorInfo details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public RemoteServiceErrorInfo data(Map<String, String> data) {
    
    this.data = data;
    return this;
  }

  public RemoteServiceErrorInfo putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<String, String>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getData() {
    return data;
  }


  public void setData(Map<String, String> data) {
    this.data = data;
  }


  public RemoteServiceErrorInfo validationErrors(List<RemoteServiceValidationErrorInfo> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public RemoteServiceErrorInfo addValidationErrorsItem(RemoteServiceValidationErrorInfo validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<RemoteServiceValidationErrorInfo>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RemoteServiceValidationErrorInfo> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<RemoteServiceValidationErrorInfo> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteServiceErrorInfo remoteServiceErrorInfo = (RemoteServiceErrorInfo) o;
    return Objects.equals(this.code, remoteServiceErrorInfo.code) &&
        Objects.equals(this.message, remoteServiceErrorInfo.message) &&
        Objects.equals(this.details, remoteServiceErrorInfo.details) &&
        Objects.equals(this.data, remoteServiceErrorInfo.data) &&
        Objects.equals(this.validationErrors, remoteServiceErrorInfo.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details, data, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteServiceErrorInfo {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

