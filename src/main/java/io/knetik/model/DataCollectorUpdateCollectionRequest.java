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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DataCollectorUpdateCollectionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T16:11:25.454-04:00")
public class DataCollectorUpdateCollectionRequest {
  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("balanceModification")
  private Double balanceModification = null;

  @JsonProperty("currency")
  private Boolean currency = null;

  @JsonProperty("deviceId")
  private String deviceId = null;

  @JsonProperty("eventProperties")
  private Object eventProperties = null;

  @JsonProperty("eventTimestamp")
  private Long eventTimestamp = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("requestType")
  private String requestType = null;

  @JsonProperty("sendTimestamp")
  private Long sendTimestamp = null;

  @JsonProperty("userId")
  private String userId = null;

  public DataCollectorUpdateCollectionRequest balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Final balance after the transaction
   * @return balance
  **/
  @ApiModelProperty(example = "null", required = true, value = "Final balance after the transaction")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public DataCollectorUpdateCollectionRequest balanceModification(Double balanceModification) {
    this.balanceModification = balanceModification;
    return this;
  }

   /**
   * The amount changed (delta) in the transaction
   * @return balanceModification
  **/
  @ApiModelProperty(example = "null", required = true, value = "The amount changed (delta) in the transaction")
  public Double getBalanceModification() {
    return balanceModification;
  }

  public void setBalanceModification(Double balanceModification) {
    this.balanceModification = balanceModification;
  }

  public DataCollectorUpdateCollectionRequest currency(Boolean currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Whether the unit being updated is a currency unit or not
   * @return currency
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether the unit being updated is a currency unit or not")
  public Boolean getCurrency() {
    return currency;
  }

  public void setCurrency(Boolean currency) {
    this.currency = currency;
  }

  public DataCollectorUpdateCollectionRequest deviceId(String deviceId) {
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

  public DataCollectorUpdateCollectionRequest eventProperties(Object eventProperties) {
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

  public DataCollectorUpdateCollectionRequest eventTimestamp(Long eventTimestamp) {
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

  public DataCollectorUpdateCollectionRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the unit/collection/currency being updated
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the unit/collection/currency being updated")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataCollectorUpdateCollectionRequest requestType(String requestType) {
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

  public DataCollectorUpdateCollectionRequest sendTimestamp(Long sendTimestamp) {
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

  public DataCollectorUpdateCollectionRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Unique ID of the new device
   * @return userId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique ID of the new device")
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
    DataCollectorUpdateCollectionRequest dataCollectorUpdateCollectionRequest = (DataCollectorUpdateCollectionRequest) o;
    return Objects.equals(this.balance, dataCollectorUpdateCollectionRequest.balance) &&
        Objects.equals(this.balanceModification, dataCollectorUpdateCollectionRequest.balanceModification) &&
        Objects.equals(this.currency, dataCollectorUpdateCollectionRequest.currency) &&
        Objects.equals(this.deviceId, dataCollectorUpdateCollectionRequest.deviceId) &&
        Objects.equals(this.eventProperties, dataCollectorUpdateCollectionRequest.eventProperties) &&
        Objects.equals(this.eventTimestamp, dataCollectorUpdateCollectionRequest.eventTimestamp) &&
        Objects.equals(this.name, dataCollectorUpdateCollectionRequest.name) &&
        Objects.equals(this.requestType, dataCollectorUpdateCollectionRequest.requestType) &&
        Objects.equals(this.sendTimestamp, dataCollectorUpdateCollectionRequest.sendTimestamp) &&
        Objects.equals(this.userId, dataCollectorUpdateCollectionRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, balanceModification, currency, deviceId, eventProperties, eventTimestamp, name, requestType, sendTimestamp, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCollectorUpdateCollectionRequest {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceModification: ").append(toIndentedString(balanceModification)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    eventProperties: ").append(toIndentedString(eventProperties)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    sendTimestamp: ").append(toIndentedString(sendTimestamp)).append("\n");
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

