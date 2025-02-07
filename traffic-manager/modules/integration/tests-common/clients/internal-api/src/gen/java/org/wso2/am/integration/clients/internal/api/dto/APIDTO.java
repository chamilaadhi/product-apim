/*
 * Internal Utility API
 * This API allows you to access internal data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.internal.api.dto;

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
import org.wso2.am.integration.clients.internal.api.dto.URLMappingDTO;

/**
 * APIDTO
 */

public class APIDTO {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("apiId")
  private Integer apiId = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("policy")
  private String policy = null;

  @SerializedName("apiType")
  private String apiType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("isDefaultVersion")
  private Boolean isDefaultVersion = null;

  @SerializedName("urlMappings")
  private List<URLMappingDTO> urlMappings = null;

  public APIDTO uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of API
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of API")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public APIDTO apiId(Integer apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * @return apiId
  **/
  @ApiModelProperty(value = "")
  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public APIDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * API Provider name.
   * @return provider
  **/
  @ApiModelProperty(value = "API Provider name.")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public APIDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API
   * @return name
  **/
  @ApiModelProperty(value = "Name of the API")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the API.
   * @return version
  **/
  @ApiModelProperty(value = "Version of the API.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public APIDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Context of the API.
   * @return context
  **/
  @ApiModelProperty(value = "Context of the API.")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public APIDTO policy(String policy) {
    this.policy = policy;
    return this;
  }

   /**
   * API level throttling policy.
   * @return policy
  **/
  @ApiModelProperty(value = "API level throttling policy.")
  public String getPolicy() {
    return policy;
  }

  public void setPolicy(String policy) {
    this.policy = policy;
  }

  public APIDTO apiType(String apiType) {
    this.apiType = apiType;
    return this;
  }

   /**
   * Type of the API.
   * @return apiType
  **/
  @ApiModelProperty(example = "APIProduct", value = "Type of the API.")
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }

  public APIDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Type of the API.
   * @return status
  **/
  @ApiModelProperty(example = "APIProduct", value = "Type of the API.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public APIDTO isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

   /**
   * Whether this is the default version of the API.
   * @return isDefaultVersion
  **/
  @ApiModelProperty(example = "false", value = "Whether this is the default version of the API.")
  public Boolean isIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public APIDTO urlMappings(List<URLMappingDTO> urlMappings) {
    this.urlMappings = urlMappings;
    return this;
  }

  public APIDTO addUrlMappingsItem(URLMappingDTO urlMappingsItem) {
    if (this.urlMappings == null) {
      this.urlMappings = new ArrayList<>();
    }
    this.urlMappings.add(urlMappingsItem);
    return this;
  }

   /**
   * Get urlMappings
   * @return urlMappings
  **/
  @ApiModelProperty(value = "")
  public List<URLMappingDTO> getUrlMappings() {
    return urlMappings;
  }

  public void setUrlMappings(List<URLMappingDTO> urlMappings) {
    this.urlMappings = urlMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIDTO API = (APIDTO) o;
    return Objects.equals(this.uuid, API.uuid) &&
        Objects.equals(this.apiId, API.apiId) &&
        Objects.equals(this.provider, API.provider) &&
        Objects.equals(this.name, API.name) &&
        Objects.equals(this.version, API.version) &&
        Objects.equals(this.context, API.context) &&
        Objects.equals(this.policy, API.policy) &&
        Objects.equals(this.apiType, API.apiType) &&
        Objects.equals(this.status, API.status) &&
        Objects.equals(this.isDefaultVersion, API.isDefaultVersion) &&
        Objects.equals(this.urlMappings, API.urlMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, apiId, provider, name, version, context, policy, apiType, status, isDefaultVersion, urlMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIDTO {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    urlMappings: ").append(toIndentedString(urlMappings)).append("\n");
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

