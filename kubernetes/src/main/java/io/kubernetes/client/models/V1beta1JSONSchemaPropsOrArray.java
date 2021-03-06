/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1beta1JSONSchemaProps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes.
 */
@ApiModel(description = "JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of JSONSchemaProps. Mainly here for serialization purposes.")

public class V1beta1JSONSchemaPropsOrArray {
  @SerializedName("JSONSchemas")
  private List<V1beta1JSONSchemaProps> jsONSchemas = new ArrayList<V1beta1JSONSchemaProps>();

  @SerializedName("Schema")
  private V1beta1JSONSchemaProps schema = null;

  public V1beta1JSONSchemaPropsOrArray jsONSchemas(List<V1beta1JSONSchemaProps> jsONSchemas) {
    this.jsONSchemas = jsONSchemas;
    return this;
  }

  public V1beta1JSONSchemaPropsOrArray addJsONSchemasItem(V1beta1JSONSchemaProps jsONSchemasItem) {
    this.jsONSchemas.add(jsONSchemasItem);
    return this;
  }

   /**
   * Get jsONSchemas
   * @return jsONSchemas
  **/
  @ApiModelProperty(required = true, value = "")
  public List<V1beta1JSONSchemaProps> getJsONSchemas() {
    return jsONSchemas;
  }

  public void setJsONSchemas(List<V1beta1JSONSchemaProps> jsONSchemas) {
    this.jsONSchemas = jsONSchemas;
  }

  public V1beta1JSONSchemaPropsOrArray schema(V1beta1JSONSchemaProps schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(required = true, value = "")
  public V1beta1JSONSchemaProps getSchema() {
    return schema;
  }

  public void setSchema(V1beta1JSONSchemaProps schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1JSONSchemaPropsOrArray v1beta1JSONSchemaPropsOrArray = (V1beta1JSONSchemaPropsOrArray) o;
    return Objects.equals(this.jsONSchemas, v1beta1JSONSchemaPropsOrArray.jsONSchemas) &&
        Objects.equals(this.schema, v1beta1JSONSchemaPropsOrArray.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsONSchemas, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1JSONSchemaPropsOrArray {\n");
    
    sb.append("    jsONSchemas: ").append(toIndentedString(jsONSchemas)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

