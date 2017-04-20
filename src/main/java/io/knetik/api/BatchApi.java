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


package io.knetik.api;

import io.knetik.client.ApiCallback;
import io.knetik.client.ApiClient;
import io.knetik.client.ApiException;
import io.knetik.client.ApiResponse;
import io.knetik.client.Configuration;
import io.knetik.client.Pair;
import io.knetik.client.ProgressRequestBody;
import io.knetik.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.knetik.model.DataCollectorBatchRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /* Build call for submitBatch */
    private com.squareup.okhttp.Call submitBatchCall(DataCollectorBatchRequest batchRequest, String customerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = batchRequest;
        
        // create path and map variables
        String localVarPath = "/v2/batch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (customerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "customerId", customerId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call submitBatchValidateBeforeCall(DataCollectorBatchRequest batchRequest, String customerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'batchRequest' is set
        if (batchRequest == null) {
            throw new ApiException("Missing the required parameter 'batchRequest' when calling submitBatch(Async)");
        }
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling submitBatch(Async)");
        }
        
        
        com.squareup.okhttp.Call call = submitBatchCall(batchRequest, customerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Submit a batch of requests as an array of input models
     * For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest , someType (DataCollectorNewUserRequest , newUser, DataCollectorNewDeviceRequest , newDevice, etc
     * @param batchRequest batchRequest (required)
     * @param customerId customerId (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void submitBatch(DataCollectorBatchRequest batchRequest, String customerId) throws ApiException {
        submitBatchWithHttpInfo(batchRequest, customerId);
    }

    /**
     * Submit a batch of requests as an array of input models
     * For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest , someType (DataCollectorNewUserRequest , newUser, DataCollectorNewDeviceRequest , newDevice, etc
     * @param batchRequest batchRequest (required)
     * @param customerId customerId (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> submitBatchWithHttpInfo(DataCollectorBatchRequest batchRequest, String customerId) throws ApiException {
        com.squareup.okhttp.Call call = submitBatchValidateBeforeCall(batchRequest, customerId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Submit a batch of requests as an array of input models (asynchronously)
     * For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest , someType (DataCollectorNewUserRequest , newUser, DataCollectorNewDeviceRequest , newDevice, etc
     * @param batchRequest batchRequest (required)
     * @param customerId customerId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitBatchAsync(DataCollectorBatchRequest batchRequest, String customerId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = submitBatchValidateBeforeCall(batchRequest, customerId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
