# BatchApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submitBatch**](BatchApi.md#submitBatch) | **POST** /v2/batch | Submit a batch of requests as an array of input models


<a name="submitBatch"></a>
# **submitBatch**
> submitBatch(batchRequest, customerId)

Submit a batch of requests as an array of input models

For this to work, you will need to specify the value of the request_type field of each element in the list, which indicates the type of the element. For example, to submit a batch containing a DataCollectorNewUserRequest you would specify the value &#x60;newUser&#x60; as the request_type for your DataCollectorNewUserRequest element. Convention is DataCollectorSomeTypeRequest , someType (DataCollectorNewUserRequest , newUser, DataCollectorNewDeviceRequest , newDevice, etc

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.BatchApi;


BatchApi apiInstance = new BatchApi();
DataCollectorBatchRequest batchRequest = new DataCollectorBatchRequest(); // DataCollectorBatchRequest | batchRequest
String customerId = "customerId_example"; // String | customerId
try {
    apiInstance.submitBatch(batchRequest, customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#submitBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchRequest** | [**DataCollectorBatchRequest**](DataCollectorBatchRequest.md)| batchRequest |
 **customerId** | **String**| customerId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

