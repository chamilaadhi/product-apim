/*
 * WSO2 API Manager - Governance
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Governance. 
 *
 * The version of the OpenAPI document: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.governance.api.dto;

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
import com.fasterxml.jackson.annotation.JsonCreator;
/**
* Summary of compliance of certain artifact in the organization.
*/
    @ApiModel(description = "Summary of compliance of certain artifact in the organization.")

public class ArtifactComplianceSummaryDTO {
        public static final String SERIALIZED_NAME_TOTAL = "total";
        @SerializedName(SERIALIZED_NAME_TOTAL)
            private Integer total;

        public static final String SERIALIZED_NAME_COMPLIANT = "compliant";
        @SerializedName(SERIALIZED_NAME_COMPLIANT)
            private Integer compliant;

        public static final String SERIALIZED_NAME_NON_COMPLIANT = "nonCompliant";
        @SerializedName(SERIALIZED_NAME_NON_COMPLIANT)
            private Integer nonCompliant;

        public static final String SERIALIZED_NAME_PENDING = "pending";
        @SerializedName(SERIALIZED_NAME_PENDING)
            private Integer pending;

        public static final String SERIALIZED_NAME_NOT_APPLICABLE = "notApplicable";
        @SerializedName(SERIALIZED_NAME_NOT_APPLICABLE)
            private Integer notApplicable;


        public ArtifactComplianceSummaryDTO total(Integer total) {
        
        this.total = total;
        return this;
        }

    /**
        * Total number of artifacts.
    * @return total
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "10", value = "Total number of artifacts.")
    
    public Integer getTotal() {
        return total;
    }


    public void setTotal(Integer total) {
        this.total = total;
    }


        public ArtifactComplianceSummaryDTO compliant(Integer compliant) {
        
        this.compliant = compliant;
        return this;
        }

    /**
        * Number of compliant artifacts.
    * @return compliant
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "6", value = "Number of compliant artifacts.")
    
    public Integer getCompliant() {
        return compliant;
    }


    public void setCompliant(Integer compliant) {
        this.compliant = compliant;
    }


        public ArtifactComplianceSummaryDTO nonCompliant(Integer nonCompliant) {
        
        this.nonCompliant = nonCompliant;
        return this;
        }

    /**
        * Number of non-compliant artifacts.
    * @return nonCompliant
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "4", value = "Number of non-compliant artifacts.")
    
    public Integer getNonCompliant() {
        return nonCompliant;
    }


    public void setNonCompliant(Integer nonCompliant) {
        this.nonCompliant = nonCompliant;
    }


        public ArtifactComplianceSummaryDTO pending(Integer pending) {
        
        this.pending = pending;
        return this;
        }

    /**
        * Number of artifacts pending for compliance.
    * @return pending
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "0", value = "Number of artifacts pending for compliance.")
    
    public Integer getPending() {
        return pending;
    }


    public void setPending(Integer pending) {
        this.pending = pending;
    }


        public ArtifactComplianceSummaryDTO notApplicable(Integer notApplicable) {
        
        this.notApplicable = notApplicable;
        return this;
        }

    /**
        * Number of artifacts not applicable for compliance yet.
    * @return notApplicable
    **/
        @javax.annotation.Nullable
      @ApiModelProperty(example = "0", value = "Number of artifacts not applicable for compliance yet.")
    
    public Integer getNotApplicable() {
        return notApplicable;
    }


    public void setNotApplicable(Integer notApplicable) {
        this.notApplicable = notApplicable;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
        return true;
        }
        if (o == null || getClass() != o.getClass()) {
        return false;
        }
            ArtifactComplianceSummaryDTO artifactComplianceSummary = (ArtifactComplianceSummaryDTO) o;
            return Objects.equals(this.total, artifactComplianceSummary.total) &&
            Objects.equals(this.compliant, artifactComplianceSummary.compliant) &&
            Objects.equals(this.nonCompliant, artifactComplianceSummary.nonCompliant) &&
            Objects.equals(this.pending, artifactComplianceSummary.pending) &&
            Objects.equals(this.notApplicable, artifactComplianceSummary.notApplicable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, compliant, nonCompliant, pending, notApplicable);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class ArtifactComplianceSummaryDTO {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    compliant: ").append(toIndentedString(compliant)).append("\n");
    sb.append("    nonCompliant: ").append(toIndentedString(nonCompliant)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    notApplicable: ").append(toIndentedString(notApplicable)).append("\n");
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

