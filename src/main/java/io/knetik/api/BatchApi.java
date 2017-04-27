package io.knetik.api;

import io.knetik.client.ApiException;
import io.knetik.client.ApiClient;
import io.knetik.client.Configuration;
import io.knetik.client.Pair;

import javax.ws.rs.core.GenericType;

import io.knetik.model.DataCollectorBatchRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T16:11:25.454-04:00")
public class BatchApi {
  private ApiClient apiClient;

  public BatchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BatchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Submit a batch of requests as an array of input models
   * For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest -&gt; someType (DataCollectorNewUserRequest -&gt; newUser, DataCollectorNewDeviceRequest -&gt; newDevice, etc
   * @param batchRequest batchRequest (required)
   * @param customerId customerId (required)
   * @throws ApiException if fails to make API call
   */
  public void submitBatch(DataCollectorBatchRequest batchRequest, String customerId) throws ApiException {
    Object localVarPostBody = batchRequest;
    
    // verify the required parameter 'batchRequest' is set
    if (batchRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'batchRequest' when calling submitBatch");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling submitBatch");
    }
    
    // create path and map variables
    String localVarPath = "/v2/batch";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "customerId", customerId));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
