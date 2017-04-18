/*
 * Knetik.io Data Collector REST API
 * <p>Use this API to send application data to Knetik.io including user/device information and transactional events.</p> <p>   Please consult the <a href=\"/doc\">official user documentation</a> to find out how to send data, and how this data is used. <p></p> <h2>Notes</h2> <br> New more ReSTful implementation of the telemetry data collection service. Legacy clients can still use the old API format, but we strongly recommend switching over to this new format. Navigate to the legacy documentation using the dropdown at the top of this page. <p></p> <h2>User IDs and Device IDs</h2> <br> Knetik.io can uniquely associate state, events and transactions to users and/or devices for your application. In order to accomplish this, each API call takes userId and deviceId as parameters in the request object. At least one of these must be provided in the request object, except as explicitly noted. <br> <p></p> <h2>Timestamps</h2> <br> All timestamp parameters must be epoch timestamps in milliseconds. <br> <p></p> <h2>Required Request Headers</h2> <br> The following HTTP header values must be provided for each API call: <ul>   <li>     <b>Content-Type: application/json</b>   </li> </ul> <p></p> <h2>Required Query Parameters</h2> <br> All API calls also require the following query parameters to be present on the URL: <ul>   <li>     <b>customer_id:</b> your unique customer ID   </li> </ul> <p></p> <h2>API Responses</h2> <br> If successful, API calls will simply return an HTTP response code of ACCEPTED (202) with no other data. If errors occur, a JSON payload will be returned containing detailed error information and an appropriate HTTP error status code will be provided (as documented in each of the API methods). <br> <p></p>
 *
 * OpenAPI spec version: 2.0
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.knetik.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DataCollectorUpdateTransactionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-18T16:06:46.165-04:00")
public class DataCollectorUpdateTransactionRequest {
  @SerializedName("category")
  private String category = null;

  @SerializedName("device_id")
  private String deviceId = null;

  @SerializedName("event_properties")
  private Object eventProperties = null;

  @SerializedName("event_timestamp")
  private Long eventTimestamp = null;

  @SerializedName("progress")
  private Integer progress = null;

  @SerializedName("request_type")
  private String requestType = null;

  @SerializedName("send_timestamp")
  private Long sendTimestamp = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  @SerializedName("user_id")
  private String userId = null;

  public DataCollectorUpdateTransactionRequest category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The name/type of the transaction
   * @return category
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name/type of the transaction")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DataCollectorUpdateTransactionRequest deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Unique ID of the device triggering the event
   * @return deviceId
  **/
  @ApiModelProperty(example = "null", value = "Unique ID of the device triggering the event")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DataCollectorUpdateTransactionRequest eventProperties(Object eventProperties) {
    this.eventProperties = eventProperties;
    return this;
  }

   /**
   * A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted)
   * @return eventProperties
  **/
  @ApiModelProperty(example = "null", value = "A key/value list of properties for this event. Values can be numerical, strings or booleans, proper typing matters (quoted vs unquoted)")
  public Object getEventProperties() {
    return eventProperties;
  }

  public void setEventProperties(Object eventProperties) {
    this.eventProperties = eventProperties;
  }

  public DataCollectorUpdateTransactionRequest eventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

   /**
   * Epoch timestamp <i>in milliseconds</i> of when event itself occurred
   * @return eventTimestamp
  **/
  @ApiModelProperty(example = "null", required = true, value = "Epoch timestamp <i>in milliseconds</i> of when event itself occurred")
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public DataCollectorUpdateTransactionRequest progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress of the transaction, expressed as a percentage between 1 - 99
   * @return progress
  **/
  @ApiModelProperty(example = "null", required = true, value = "Progress of the transaction, expressed as a percentage between 1 - 99")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public DataCollectorUpdateTransactionRequest requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest -> newUser, NewEventRequest -> newEvent,e tc
   * @return requestType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Specifies the canonical model name of the request. Ex: DataCollectorNewUserRequest -> newUser, NewEventRequest -> newEvent,e tc")
  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public DataCollectorUpdateTransactionRequest sendTimestamp(Long sendTimestamp) {
    this.sendTimestamp = sendTimestamp;
    return this;
  }

   /**
   * Epoch timestamp <i>in milliseconds</i> of when event was sent to the API
   * @return sendTimestamp
  **/
  @ApiModelProperty(example = "null", required = true, value = "Epoch timestamp <i>in milliseconds</i> of when event was sent to the API")
  public Long getSendTimestamp() {
    return sendTimestamp;
  }

  public void setSendTimestamp(Long sendTimestamp) {
    this.sendTimestamp = sendTimestamp;
  }

  public DataCollectorUpdateTransactionRequest transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Unique transaction ID
   * @return transactionId
  **/
  @ApiModelProperty(example = "null", value = "Unique transaction ID")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public DataCollectorUpdateTransactionRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Unique ID of the user triggering the event
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "Unique ID of the user triggering the event")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataCollectorUpdateTransactionRequest dataCollectorUpdateTransactionRequest = (DataCollectorUpdateTransactionRequest) o;
    return Objects.equals(this.category, dataCollectorUpdateTransactionRequest.category) &&
        Objects.equals(this.deviceId, dataCollectorUpdateTransactionRequest.deviceId) &&
        Objects.equals(this.eventProperties, dataCollectorUpdateTransactionRequest.eventProperties) &&
        Objects.equals(this.eventTimestamp, dataCollectorUpdateTransactionRequest.eventTimestamp) &&
        Objects.equals(this.progress, dataCollectorUpdateTransactionRequest.progress) &&
        Objects.equals(this.requestType, dataCollectorUpdateTransactionRequest.requestType) &&
        Objects.equals(this.sendTimestamp, dataCollectorUpdateTransactionRequest.sendTimestamp) &&
        Objects.equals(this.transactionId, dataCollectorUpdateTransactionRequest.transactionId) &&
        Objects.equals(this.userId, dataCollectorUpdateTransactionRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, deviceId, eventProperties, eventTimestamp, progress, requestType, sendTimestamp, transactionId, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCollectorUpdateTransactionRequest {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    eventProperties: ").append(toIndentedString(eventProperties)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    sendTimestamp: ").append(toIndentedString(sendTimestamp)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

