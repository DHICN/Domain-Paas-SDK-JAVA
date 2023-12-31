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
import java.io.File;
import java.io.IOException;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class InlineObject {
  public static final String SERIALIZED_NAME_EXCEL_FILE = "ExcelFile";
  @SerializedName(SERIALIZED_NAME_EXCEL_FILE)
  private File excelFile;

  public static final String SERIALIZED_NAME_SHEETS = "Sheets";
  @SerializedName(SERIALIZED_NAME_SHEETS)
  private String sheets;


  public InlineObject excelFile(File excelFile) {
    
    this.excelFile = excelFile;
    return this;
  }

   /**
   * Get excelFile
   * @return excelFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getExcelFile() {
    return excelFile;
  }


  public void setExcelFile(File excelFile) {
    this.excelFile = excelFile;
  }


  public InlineObject sheets(String sheets) {
    
    this.sheets = sheets;
    return this;
  }

   /**
   * 更新的sheet页的编码，如（1,2,3表示更新sheet1，2，3中的配置），以表示需要更新哪个页的配置，其余页面不更新；如该参数为空，则表示全部更新
   * @return sheets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "更新的sheet页的编码，如（1,2,3表示更新sheet1，2，3中的配置），以表示需要更新哪个页的配置，其余页面不更新；如该参数为空，则表示全部更新")

  public String getSheets() {
    return sheets;
  }


  public void setSheets(String sheets) {
    this.sheets = sheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.excelFile, inlineObject.excelFile) &&
        Objects.equals(this.sheets, inlineObject.sheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excelFile, sheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    excelFile: ").append(toIndentedString(excelFile)).append("\n");
    sb.append("    sheets: ").append(toIndentedString(sheets)).append("\n");
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

