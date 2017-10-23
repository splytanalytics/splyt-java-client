package io.knetik.api;

import io.knetik.client.ApiException;
import io.knetik.client.ApiClient;
import io.knetik.client.Configuration;
import io.knetik.client.Pair;

import javax.ws.rs.core.GenericType;

import io.knetik.model.DataCollectorNewDeviceRequest;
import io.knetik.model.DataCollectorUpdateDeviceStateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T15:55:12.975-04:00")
public class DevicesApi {
  private ApiClient apiClient;

  public DevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevicesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Submit a new device event
   * Declares to the Knetik.io platform that a device is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the device in the Knetik.io platform is examined to determine if the device was previously declared as new and, if so, the device information is not updated in the Knetik.io platform.
   * @param customerId customerId (required)
   * @param request New device information (optional)
   * @param checked Flag indicating whether the device state should be checked before updating the state in the Knetik.io platform (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void newDevice(String customerId, DataCollectorNewDeviceRequest request, Boolean checked) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling newDevice");
    }
    
    // create path and map variables
    String localVarPath = "/v2/devices";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "checked", checked));
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
  /**
   * Updates the state parameters for the given device
   * 
   * @param id ID of the device for which state information is being updated (required)
   * @param customerId customerId (required)
   * @param request Updated device state information (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateDeviceState(String id, String customerId, DataCollectorUpdateDeviceStateRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateDeviceState");
    }
    
    // verify the required parameter 'customerId' is set
    if (customerId == null) {
      throw new ApiException(400, "Missing the required parameter 'customerId' when calling updateDeviceState");
    }
    
    // create path and map variables
    String localVarPath = "/v2/devices/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
