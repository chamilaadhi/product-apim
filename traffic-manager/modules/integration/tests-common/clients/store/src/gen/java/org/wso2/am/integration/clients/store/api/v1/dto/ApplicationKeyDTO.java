/*
 * WSO2 API Manager - Developer Portal
 * This document specifies a **RESTful API** for WSO2 **API Manager** - **Developer Portal**. Please see [full OpenAPI Specification](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.7.206/components/apimgt/org.wso2.carbon.apimgt.rest.api.store.v1/src/main/resources/devportal-api.yaml) of the API which is written using [OAS 3.0](http://swagger.io/) specification.  # Authentication The Developer Portal REST API is protected using OAuth2 and access control is achieved through scopes. Before you start invoking the API, you need to obtain an access token with the required scopes. This guide will walk you through the steps that you will need to follow to obtain an access token. First you need to obtain the consumer key/secret key pair by calling the dynamic client registration (DCR) endpoint. You can add your preferred grant types in the payload. A Sample payload is shown below. ```   {   \"callbackUrl\":\"www.google.lk\",   \"clientName\":\"rest_api_devportal\",   \"owner\":\"admin\",   \"grantType\":\"client_credentials password refresh_token\",   \"saasApp\":true   } ``` Create a file (payload.json) with the above sample payload, and use the cURL shown below to invoke the DCR endpoint. Authorization header of this should contain the base64 encoded admin username and password. **Format of the request** ```   curl -X POST -H \"Authorization: Basic Base64(admin_username:admin_password)\" -H \"Content-Type: application/json\"   \\ -d @payload.json https://<host>:<servlet_port>/client-registration/v0.17/register ``` **Sample request** ```   curl -X POST -H \"Authorization: Basic YWRtaW46YWRtaW4=\" -H \"Content-Type: application/json\"   \\ -d @payload.json https://localhost:9443/client-registration/v0.17/register ``` Following is a sample response after invoking the above curl. ``` { \"clientId\": \"fOCi4vNJ59PpHucC2CAYfYuADdMa\", \"clientName\": \"rest_api_devportal\", \"callBackURL\": \"www.google.lk\", \"clientSecret\": \"a4FwHlq0iCIKVs2MPIIDnepZnYMa\", \"isSaasApplication\": true, \"appOwner\": \"admin\", \"jsonString\": \"{\\\"grant_types\\\":\\\"client_credentials password refresh_token\\\",\\\"redirect_uris\\\":\\\"www.google.lk\\\",\\\"client_name\\\":\\\"rest_api_devportal\\\"}\", \"jsonAppAttribute\": \"{}\", \"tokenType\": null } ``` Next you must use the above client id and secret to obtain the access token. We will be using the password grant type for this, you can use any grant type you desire. You also need to add the proper **scope** when getting the access token. All possible scopes for devportal REST API can be viewed in **OAuth2 Security** section of this document and scope for each resource is given in **authorization** section of resource documentation. Following is the format of the request if you are using the password grant type. ``` curl -k -d \"grant_type=password&username=<admin_username>&password=<admin_password>&scope=<scopes separated by space>\" \\ -H \"Authorization: Basic base64(cliet_id:client_secret)\" \\ https://<host>:<servlet_port>/oauth2/token ``` **Sample request** ``` curl https://localhost:9443/oauth2/token -k \\ -H \"Authorization: Basic Zk9DaTR2Tko1OVBwSHVjQzJDQVlmWXVBRGRNYTphNEZ3SGxxMGlDSUtWczJNUElJRG5lcFpuWU1h\" \\ -d \"grant_type=password&username=admin&password=admin&scope=apim:subscribe apim:api_key\" ``` Shown below is a sample response to the above request. ``` { \"access_token\": \"e79bda48-3406-3178-acce-f6e4dbdcbb12\", \"refresh_token\": \"a757795d-e69f-38b8-bd85-9aded677a97c\", \"scope\": \"apim:subscribe apim:api_key\", \"token_type\": \"Bearer\", \"expires_in\": 3600 } ``` Now you have a valid access token, which you can use to invoke an API. Navigate through the API descriptions to find the required API, obtain an access token as described above and invoke the API with the authentication header. If you use a different authentication mechanism, this process may change.  # Try out in Postman If you want to try-out the embedded postman collection with \"Run in Postman\" option, please follow the guidelines listed below. * All of the OAuth2 secured endpoints have been configured with an Authorization Bearer header with a parameterized access token. Before invoking any REST API resource make sure you run the `Register DCR Application` and `Generate Access Token` requests to fetch an access token with all required scopes. * Make sure you have an API Manager instance up and running. * Update the `basepath` parameter to match the hostname and port of the APIM instance.  [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/5bc0161b8aa7e701d7bf) 
 *
 * The version of the OpenAPI document: v3
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

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
import org.wso2.am.integration.clients.store.api.v1.dto.ApplicationTokenDTO;
import com.fasterxml.jackson.annotation.JsonCreator;
/**
* ApplicationKeyDTO
*/

public class ApplicationKeyDTO {
        public static final String SERIALIZED_NAME_KEY_MAPPING_ID = "keyMappingId";
        @SerializedName(SERIALIZED_NAME_KEY_MAPPING_ID)
            private String keyMappingId;

        public static final String SERIALIZED_NAME_KEY_MANAGER = "keyManager";
        @SerializedName(SERIALIZED_NAME_KEY_MANAGER)
            private String keyManager;

        public static final String SERIALIZED_NAME_CONSUMER_KEY = "consumerKey";
        @SerializedName(SERIALIZED_NAME_CONSUMER_KEY)
            private String consumerKey;

        public static final String SERIALIZED_NAME_CONSUMER_SECRET = "consumerSecret";
        @SerializedName(SERIALIZED_NAME_CONSUMER_SECRET)
            private String consumerSecret;

        public static final String SERIALIZED_NAME_SUPPORTED_GRANT_TYPES = "supportedGrantTypes";
        @SerializedName(SERIALIZED_NAME_SUPPORTED_GRANT_TYPES)
            private List<String> supportedGrantTypes = null;

        public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
        @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
            private String callbackUrl;

        public static final String SERIALIZED_NAME_KEY_STATE = "keyState";
        @SerializedName(SERIALIZED_NAME_KEY_STATE)
            private String keyState;

            /**
* Describes to which endpoint the key belongs
*/
    @JsonAdapter(KeyTypeEnum.Adapter.class)
public enum KeyTypeEnum {
        PRODUCTION("PRODUCTION"),
        
        SANDBOX("SANDBOX");

private String value;

KeyTypeEnum(String value) {
this.value = value;
}

public String getValue() {
return value;
}

@Override
public String toString() {
return String.valueOf(value);
}

public static KeyTypeEnum fromValue(String value) {
    for (KeyTypeEnum b : KeyTypeEnum.values()) {
    if (b.name().equals(value)) {
        return b;
    }
}
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
}

    public static class Adapter extends TypeAdapter<KeyTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeyTypeEnum enumeration) throws IOException {
    jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeyTypeEnum read(final JsonReader jsonReader) throws IOException {
    String value =  jsonReader.nextString();
    return KeyTypeEnum.fromValue(value);
    }
    }
}

        public static final String SERIALIZED_NAME_KEY_TYPE = "keyType";
        @SerializedName(SERIALIZED_NAME_KEY_TYPE)
            private KeyTypeEnum keyType;

            /**
* Describe the which mode Application Mapped.
*/
    @JsonAdapter(ModeEnum.Adapter.class)
public enum ModeEnum {
        MAPPED("MAPPED"),
        
        CREATED("CREATED");

private String value;

ModeEnum(String value) {
this.value = value;
}

public String getValue() {
return value;
}

@Override
public String toString() {
return String.valueOf(value);
}

public static ModeEnum fromValue(String value) {
    for (ModeEnum b : ModeEnum.values()) {
    if (b.name().equals(value)) {
        return b;
    }
}
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
}

    public static class Adapter extends TypeAdapter<ModeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
    jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ModeEnum read(final JsonReader jsonReader) throws IOException {
    String value =  jsonReader.nextString();
    return ModeEnum.fromValue(value);
    }
    }
}

        public static final String SERIALIZED_NAME_MODE = "mode";
        @SerializedName(SERIALIZED_NAME_MODE)
            private ModeEnum mode;

        public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
        @SerializedName(SERIALIZED_NAME_GROUP_ID)
            private String groupId;

        public static final String SERIALIZED_NAME_TOKEN = "token";
        @SerializedName(SERIALIZED_NAME_TOKEN)
            private ApplicationTokenDTO token;

        public static final String SERIALIZED_NAME_ADDITIONAL_PROPERTIES = "additionalProperties";
        @SerializedName(SERIALIZED_NAME_ADDITIONAL_PROPERTIES)
            private Object additionalProperties;


        public ApplicationKeyDTO keyMappingId(String keyMappingId) {
        
        this.keyMappingId = keyMappingId;
        return this;
        }

    /**
        * Key Manager Mapping UUID
    * @return keyMappingId
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "92ab520c-8847-427a-a921-3ed19b15aad7", value = "Key Manager Mapping UUID")
    
    public String getKeyMappingId() {
        return keyMappingId;
    }


    public void setKeyMappingId(String keyMappingId) {
        this.keyMappingId = keyMappingId;
    }


        public ApplicationKeyDTO keyManager(String keyManager) {
        
        this.keyManager = keyManager;
        return this;
        }

    /**
        * Key Manager Name
    * @return keyManager
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "Resident Key Manager", value = "Key Manager Name")
    
    public String getKeyManager() {
        return keyManager;
    }


    public void setKeyManager(String keyManager) {
        this.keyManager = keyManager;
    }


        public ApplicationKeyDTO consumerKey(String consumerKey) {
        
        this.consumerKey = consumerKey;
        return this;
        }

    /**
        * Consumer key of the application
    * @return consumerKey
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "vYDoc9s7IgAFdkSyNDaswBX7ejoa", value = "Consumer key of the application")
    
    public String getConsumerKey() {
        return consumerKey;
    }


    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }


        public ApplicationKeyDTO consumerSecret(String consumerSecret) {
        
        this.consumerSecret = consumerSecret;
        return this;
        }

    /**
        * Consumer secret of the application
    * @return consumerSecret
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "TIDlOFkpzB7WjufO3OJUhy1fsvAa", value = "Consumer secret of the application")
    
    public String getConsumerSecret() {
        return consumerSecret;
    }


    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }


        public ApplicationKeyDTO supportedGrantTypes(List<String> supportedGrantTypes) {
        
        this.supportedGrantTypes = supportedGrantTypes;
        return this;
        }

    /**
        * The grant types that are supported by the application
    * @return supportedGrantTypes
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "[\"client_credentials\",\"password\"]", value = "The grant types that are supported by the application")
    
    public List<String> getSupportedGrantTypes() {
        return supportedGrantTypes;
    }


    public void setSupportedGrantTypes(List<String> supportedGrantTypes) {
        this.supportedGrantTypes = supportedGrantTypes;
    }


        public ApplicationKeyDTO callbackUrl(String callbackUrl) {
        
        this.callbackUrl = callbackUrl;
        return this;
        }

    /**
        * Callback URL
    * @return callbackUrl
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "http://sample.com/callback/url", value = "Callback URL")
    
    public String getCallbackUrl() {
        return callbackUrl;
    }


    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }


        public ApplicationKeyDTO keyState(String keyState) {
        
        this.keyState = keyState;
        return this;
        }

    /**
        * Describes the state of the key generation.
    * @return keyState
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "APPROVED", value = "Describes the state of the key generation.")
    
    public String getKeyState() {
        return keyState;
    }


    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }


        public ApplicationKeyDTO keyType(KeyTypeEnum keyType) {
        
        this.keyType = keyType;
        return this;
        }

    /**
        * Describes to which endpoint the key belongs
    * @return keyType
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "PRODUCTION", value = "Describes to which endpoint the key belongs")
    
    public KeyTypeEnum getKeyType() {
        return keyType;
    }


    public void setKeyType(KeyTypeEnum keyType) {
        this.keyType = keyType;
    }


        public ApplicationKeyDTO mode(ModeEnum mode) {
        
        this.mode = mode;
        return this;
        }

    /**
        * Describe the which mode Application Mapped.
    * @return mode
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "CREATED", value = "Describe the which mode Application Mapped.")
    
    public ModeEnum getMode() {
        return mode;
    }


    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }


        public ApplicationKeyDTO groupId(String groupId) {
        
        this.groupId = groupId;
        return this;
        }

    /**
        * Application group id (if any).
    * @return groupId
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "2", value = "Application group id (if any).")
    
    public String getGroupId() {
        return groupId;
    }


    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


        public ApplicationKeyDTO token(ApplicationTokenDTO token) {
        
        this.token = token;
        return this;
        }

    /**
        * Get token
    * @return token
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(value = "")
    
    public ApplicationTokenDTO getToken() {
        return token;
    }


    public void setToken(ApplicationTokenDTO token) {
        this.token = token;
    }


        public ApplicationKeyDTO additionalProperties(Object additionalProperties) {
        
        this.additionalProperties = additionalProperties;
        return this;
        }

    /**
        * additionalProperties (if any).
    * @return additionalProperties
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(value = "additionalProperties (if any).")
    
    public Object getAdditionalProperties() {
        return additionalProperties;
    }


    public void setAdditionalProperties(Object additionalProperties) {
        this.additionalProperties = additionalProperties;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            ApplicationKeyDTO applicationKey = (ApplicationKeyDTO) o;
            return Objects.equals(this.keyMappingId, applicationKey.keyMappingId) &&
            Objects.equals(this.keyManager, applicationKey.keyManager) &&
            Objects.equals(this.consumerKey, applicationKey.consumerKey) &&
            Objects.equals(this.consumerSecret, applicationKey.consumerSecret) &&
            Objects.equals(this.supportedGrantTypes, applicationKey.supportedGrantTypes) &&
            Objects.equals(this.callbackUrl, applicationKey.callbackUrl) &&
            Objects.equals(this.keyState, applicationKey.keyState) &&
            Objects.equals(this.keyType, applicationKey.keyType) &&
            Objects.equals(this.mode, applicationKey.mode) &&
            Objects.equals(this.groupId, applicationKey.groupId) &&
            Objects.equals(this.token, applicationKey.token) &&
            Objects.equals(this.additionalProperties, applicationKey.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyMappingId, keyManager, consumerKey, consumerSecret, supportedGrantTypes, callbackUrl, keyState, keyType, mode, groupId, token, additionalProperties);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class ApplicationKeyDTO {\n");
    sb.append("    keyMappingId: ").append(toIndentedString(keyMappingId)).append("\n");
    sb.append("    keyManager: ").append(toIndentedString(keyManager)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    supportedGrantTypes: ").append(toIndentedString(supportedGrantTypes)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}

