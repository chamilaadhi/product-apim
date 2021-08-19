/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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

/**
 * PodStatusDTO
 */

public class PodStatusDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("ready")
  private String ready = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("creationTimestamp")
  private String creationTimestamp = null;

  public PodStatusDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "petStore-677bb7cc65-shb2f", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PodStatusDTO ready(String ready) {
    this.ready = ready;
    return this;
  }

   /**
   * Get ready
   * @return ready
  **/
  @ApiModelProperty(example = "1/1", required = true, value = "")
  public String getReady() {
    return ready;
  }

  public void setReady(String ready) {
    this.ready = ready;
  }

  public PodStatusDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "running", required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PodStatusDTO creationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Get creationTimestamp
   * @return creationTimestamp
  **/
  @ApiModelProperty(example = "2020-05-12T06:12:00.000+0000", value = "")
  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodStatusDTO podStatus = (PodStatusDTO) o;
    return Objects.equals(this.name, podStatus.name) &&
        Objects.equals(this.ready, podStatus.ready) &&
        Objects.equals(this.status, podStatus.status) &&
        Objects.equals(this.creationTimestamp, podStatus.creationTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ready, status, creationTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodStatusDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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

