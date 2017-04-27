package io.knetik.api;

import io.knetik.client.ApiException;
import io.knetik.client.ApiClient;
import io.knetik.client.Configuration;
import io.knetik.client.Pair;

import javax.ws.rs.core.GenericType;

import io.knetik.model.DataCollectorTuneRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-27T16:11:25.454-04:00")
public class MobileApplicationTrackingApi {
  private ApiClient apiClient;

  public MobileApplicationTrackingApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MobileApplicationTrackingApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Submit mobile application tracking data for Tune applications
   * 
   * @param customerId customerId (required)
   * @param request Tune campaign tracking information (optional)
   * @throws ApiException if fails to make API call
   */
  public void submitTuneRequest(String customerId, DataCollectorTuneRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling submitTuneRequest");
    }
    
    // create path and map variables
    String localVarPath = "/v2/tune";

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
