# UsersApi

All URIs are relative to *https://api.knetik.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**newUser**](UsersApi.md#newUser) | **POST** /v2/users | Submit a new user event
[**updateUserState**](UsersApi.md#updateUserState) | **PUT** /v2/users/{id} | Updates the entity state for the given user


<a name="newUser"></a>
# **newUser**
> newUser(customerId, request, checked)

Submit a new user event

Declares to the Knetik.io platform that the user is new at the given point in time. If the &#39;checked&#39; parameter is provided and set to &#39;true&#39;, however, the current state of the user in the Knetik.io platform is examined to determine if the user was previously declared as new and, if so, the user information is not updated in the Knetik.io platform.

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String customerId = "customerId_example"; // String | customerId
DataCollectorNewUserRequest request = new DataCollectorNewUserRequest(); // DataCollectorNewUserRequest | New user information
Boolean checked = false; // Boolean | Flag indicating whether the user state should be checked before updating the state in the Knetik.io platform
try {
    apiInstance.newUser(customerId, request, checked);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#newUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorNewUserRequest**](DataCollectorNewUserRequest.md)| New user information | [optional]
 **checked** | **Boolean**| Flag indicating whether the user state should be checked before updating the state in the Knetik.io platform | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserState"></a>
# **updateUserState**
> updateUserState(id, customerId, request)

Updates the entity state for the given user

### Example
```java
// Import classes:
//import io.knetik.client.ApiException;
//import io.knetik.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String id = "id_example"; // String | ID of the user for whom state is being updated
String customerId = "customerId_example"; // String | customerId
DataCollectorUpdateUserStateRequest request = new DataCollectorUpdateUserStateRequest(); // DataCollectorUpdateUserStateRequest | Updated user state information
try {
    apiInstance.updateUserState(id, customerId, request);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user for whom state is being updated |
 **customerId** | **String**| customerId |
 **request** | [**DataCollectorUpdateUserStateRequest**](DataCollectorUpdateUserStateRequest.md)| Updated user state information | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

