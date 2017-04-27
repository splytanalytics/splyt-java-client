package io.knetik.api;

import io.knetik.client.ApiException;
import io.knetik.client.ApiClient;
import io.knetik.client.Configuration;
import io.knetik.client.Pair;

import javax.ws.rs.core.GenericType;

import io.knetik.model.NewEventRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T16:11:25.454-04:00")
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a single event (a transaction with no duration)
   * 
   * @param customerId customerId (required)
   * @param request Similar to transactions, the details of that event (optional)
   * @throws ApiException if fails to make API call
   */
  public void createEvent(String customerId, NewEventRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling createEvent");
    }
    
    // create path and map variables
    String localVarPath = "/v2/events";

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
