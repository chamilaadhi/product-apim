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
import org.wso2.am.integration.clients.internal.api.dto.ThrottleLimitBaseDTO;

/**
 * BandwidthLimitDTO
 */

public class BandwidthLimitDTO {
  @SerializedName("timeUnit")
  private String timeUnit = null;

  @SerializedName("unitTime")
  private Integer unitTime = null;

  @SerializedName("dataAmount")
  private Long dataAmount = null;

  @SerializedName("dataUnit")
  private String dataUnit = null;

  public BandwidthLimitDTO timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Unit of the time. Allowed values are \&quot;sec\&quot;, \&quot;min\&quot;, \&quot;hour\&quot;, \&quot;day\&quot;
   * @return timeUnit
  **/
  @ApiModelProperty(example = "min", required = true, value = "Unit of the time. Allowed values are \"sec\", \"min\", \"hour\", \"day\"")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public BandwidthLimitDTO unitTime(Integer unitTime) {
    this.unitTime = unitTime;
    return this;
  }

   /**
   * Time limit that the throttling limit applies.
   * @return unitTime
  **/
  @ApiModelProperty(example = "10", required = true, value = "Time limit that the throttling limit applies.")
  public Integer getUnitTime() {
    return unitTime;
  }

  public void setUnitTime(Integer unitTime) {
    this.unitTime = unitTime;
  }

  public BandwidthLimitDTO dataAmount(Long dataAmount) {
    this.dataAmount = dataAmount;
    return this;
  }

   /**
   * Amount of data allowed to be transfered
   * @return dataAmount
  **/
  @ApiModelProperty(example = "1000", required = true, value = "Amount of data allowed to be transfered")
  public Long getDataAmount() {
    return dataAmount;
  }

  public void setDataAmount(Long dataAmount) {
    this.dataAmount = dataAmount;
  }

  public BandwidthLimitDTO dataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
    return this;
  }

   /**
   * Unit of data allowed to be transfered. Allowed values are \&quot;KB\&quot;, \&quot;MB\&quot; and \&quot;GB\&quot;
   * @return dataUnit
  **/
  @ApiModelProperty(example = "KB", required = true, value = "Unit of data allowed to be transfered. Allowed values are \"KB\", \"MB\" and \"GB\"")
  public String getDataUnit() {
    return dataUnit;
  }

  public void setDataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthLimitDTO bandwidthLimit = (BandwidthLimitDTO) o;
    return Objects.equals(this.timeUnit, bandwidthLimit.timeUnit) &&
        Objects.equals(this.unitTime, bandwidthLimit.unitTime) &&
        Objects.equals(this.dataAmount, bandwidthLimit.dataAmount) &&
        Objects.equals(this.dataUnit, bandwidthLimit.dataUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUnit, unitTime, dataAmount, dataUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthLimitDTO {\n");
    
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    unitTime: ").append(toIndentedString(unitTime)).append("\n");
    sb.append("    dataAmount: ").append(toIndentedString(dataAmount)).append("\n");
    sb.append("    dataUnit: ").append(toIndentedString(dataUnit)).append("\n");
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

