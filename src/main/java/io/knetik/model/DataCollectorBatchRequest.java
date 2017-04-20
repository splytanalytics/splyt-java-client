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
import io.knetik.model.DataCollectorBaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * DataCollectorBatchRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-20T12:08:08.032-04:00")
public class DataCollectorBatchRequest {
  @SerializedName("batch")
  private List<DataCollectorBaseRequest> batch = new ArrayList<DataCollectorBaseRequest>();

  public DataCollectorBatchRequest batch(List<DataCollectorBaseRequest> batch) {
    this.batch = batch;
    return this;
  }

  public DataCollectorBatchRequest addBatchItem(DataCollectorBaseRequest batchItem) {
    this.batch.add(batchItem);
    return this;
  }

   /**
   * Get batch
   * @return batch
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DataCollectorBaseRequest> getBatch() {
    return batch;
  }

  public void setBatch(List<DataCollectorBaseRequest> batch) {
    this.batch = batch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataCollectorBatchRequest dataCollectorBatchRequest = (DataCollectorBatchRequest) o;
    return Objects.equals(this.batch, dataCollectorBatchRequest.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCollectorBatchRequest {\n");
    
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

