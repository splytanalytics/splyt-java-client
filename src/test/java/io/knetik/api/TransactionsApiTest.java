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

import io.knetik.client.ApiException;
import io.knetik.model.DataCollectorBeginTransactionRequest;
import io.knetik.model.DataCollectorEndTransactionRequest;
import io.knetik.model.DataCollectorUpdateCollectionRequest;
import io.knetik.model.DataCollectorUpdateTransactionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
@Ignore
public class TransactionsApiTest {

    private final TransactionsApi api = new TransactionsApi();

    
    /**
     * Begins a new transaction
     *
     * Use the event properties to describe the initial state of the transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void beginTransactionTest() throws ApiException {
        String customerId = null;
        DataCollectorBeginTransactionRequest request = null;
        api.beginTransaction(customerId, request);

        // TODO: test validations
    }
    
    /**
     * Ends the transaction
     *
     * Submits final transaction state to Knetik.io
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void endTransactionTest() throws ApiException {
        String id = null;
        String customerId = null;
        DataCollectorEndTransactionRequest request = null;
        api.endTransaction(id, customerId, request);

        // TODO: test validations
    }
    
    /**
     * Creates and finalizes a collection of transaction information
     *
     * This operation basically encapsulates beginTransaction and endTransaction semantics into a single step and is used to update user balance information in Knetik.io
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String customerId = null;
        DataCollectorUpdateCollectionRequest request = null;
        api.updateCollection(customerId, request);

        // TODO: test validations
    }
    
    /**
     * Updates the progress for the given transaction
     *
     * Use the event properties to update the state of the transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTransactionTest() throws ApiException {
        String id = null;
        String customerId = null;
        DataCollectorUpdateTransactionRequest request = null;
        api.updateTransaction(id, customerId, request);

        // TODO: test validations
    }
    
}
