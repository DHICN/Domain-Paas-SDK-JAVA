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
import org.openapitools.client.model.SelectItemNodeDetailInfo;

/**
 * SelectItemNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-09T14:11:26.479568400+08:00[Asia/Shanghai]")
public class SelectItemNode {
  /**
   * 选择节点的类型 select node type
   */
  @JsonAdapter(NodeTypeEnum.Adapter.class)
  public enum NodeTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

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

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DETAILED_INFO = "detailedInfo";
  @SerializedName(SERIALIZED_NAME_DETAILED_INFO)
  private SelectItemNodeDetailInfo detailedInfo;

  public static final String SERIALIZED_NAME_CHILD_NODES = "childNodes";
  @SerializedName(SERIALIZED_NAME_CHILD_NODES)
  private List<SelectItemNode> childNodes = null;


  public SelectItemNode nodeType(NodeTypeEnum nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * 选择节点的类型 select node type
   * @return nodeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "选择节点的类型 select node type")

  public NodeTypeEnum getNodeType() {
    return nodeType;
  }


  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }


  public SelectItemNode code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 代码 code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "代码 code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public SelectItemNode name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 名称，用于显示 name for display
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "名称，用于显示 name for display")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SelectItemNode detailedInfo(SelectItemNodeDetailInfo detailedInfo) {
    
    this.detailedInfo = detailedInfo;
    return this;
  }

   /**
   * Get detailedInfo
   * @return detailedInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SelectItemNodeDetailInfo getDetailedInfo() {
    return detailedInfo;
  }


  public void setDetailedInfo(SelectItemNodeDetailInfo detailedInfo) {
    this.detailedInfo = detailedInfo;
  }


  public SelectItemNode childNodes(List<SelectItemNode> childNodes) {
    
    this.childNodes = childNodes;
    return this;
  }

  public SelectItemNode addChildNodesItem(SelectItemNode childNodesItem) {
    if (this.childNodes == null) {
      this.childNodes = new ArrayList<SelectItemNode>();
    }
    this.childNodes.add(childNodesItem);
    return this;
  }

   /**
   * 子节点列表 sub node list
   * @return childNodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "子节点列表 sub node list")

  public List<SelectItemNode> getChildNodes() {
    return childNodes;
  }


  public void setChildNodes(List<SelectItemNode> childNodes) {
    this.childNodes = childNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectItemNode selectItemNode = (SelectItemNode) o;
    return Objects.equals(this.nodeType, selectItemNode.nodeType) &&
        Objects.equals(this.code, selectItemNode.code) &&
        Objects.equals(this.name, selectItemNode.name) &&
        Objects.equals(this.detailedInfo, selectItemNode.detailedInfo) &&
        Objects.equals(this.childNodes, selectItemNode.childNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, code, name, detailedInfo, childNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectItemNode {\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    detailedInfo: ").append(toIndentedString(detailedInfo)).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
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

