/*
 * 污水业务中台领域服务
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.RealTimeOutput;
import org.openapitools.client.model.RemoteServiceErrorResponse;
import org.openapitools.client.model.ToxicAlarmsOutput;
import org.openapitools.client.model.ToxicityInput;
import org.openapitools.client.model.ToxicityOutput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToxicityMonitorApi {
    private ApiClient localVarApiClient;

    public ToxicityMonitorApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ToxicityMonitorApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for apiV2OutputToxicAlarmsGet
     * @param startTime 开始时间 start time (optional)
     * @param endTime 结束时间 end time (optional)
     * @param tenantId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2OutputToxicAlarmsGetCall(String startTime, String endTime, String tenantId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/output/toxic-alarms";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startTime", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endTime", endTime));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tenantId != null) {
            localVarHeaderParams.put("tenantId", localVarApiClient.parameterToString(tenantId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2OutputToxicAlarmsGetValidateBeforeCall(String startTime, String endTime, String tenantId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2OutputToxicAlarmsGetCall(startTime, endTime, tenantId, _callback);
        return localVarCall;

    }

    /**
     * 首页预警信息 Get toxicity alarm data
     * 
     * @param startTime 开始时间 start time (optional)
     * @param endTime 结束时间 end time (optional)
     * @param tenantId  (optional)
     * @return List&lt;ToxicAlarmsOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResult<List<ToxicAlarmsOutput>>apiV2OutputToxicAlarmsGet(String startTime, String endTime, String tenantId) throws ApiException {
        ApiResponse<ApiResult<List<ToxicAlarmsOutput>>> localVarResp = apiV2OutputToxicAlarmsGetWithHttpInfo(startTime, endTime, tenantId);
        return localVarResp.getData();
    }

    /**
     * 首页预警信息 Get toxicity alarm data
     * 
     * @param startTime 开始时间 start time (optional)
     * @param endTime 结束时间 end time (optional)
     * @param tenantId  (optional)
     * @return ApiResponse&lt;List&lt;ToxicAlarmsOutput&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResult<List<ToxicAlarmsOutput>>> apiV2OutputToxicAlarmsGetWithHttpInfo(String startTime, String endTime, String tenantId) throws ApiException {
        okhttp3.Call localVarCall = apiV2OutputToxicAlarmsGetValidateBeforeCall(startTime, endTime, tenantId, null);
        Type localVarReturnType = new TypeToken<ApiResult<List<ToxicAlarmsOutput>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 首页预警信息 Get toxicity alarm data (asynchronously)
     * 
     * @param startTime 开始时间 start time (optional)
     * @param endTime 结束时间 end time (optional)
     * @param tenantId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2OutputToxicAlarmsGetAsync(String startTime, String endTime, String tenantId, final ApiCallback<List<ToxicAlarmsOutput>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2OutputToxicAlarmsGetValidateBeforeCall(startTime, endTime, tenantId, _callback);
        Type localVarReturnType = new TypeToken<List<ToxicAlarmsOutput>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ToxicityMonitorAlarmHistoryPost
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorAlarmHistoryPostCall(String tenantId, ToxicityInput toxicityInput, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = toxicityInput;

        // create path and map variables
        String localVarPath = "/api/v2/toxicity-monitor/alarm-history";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tenantId != null) {
            localVarHeaderParams.put("tenantId", localVarApiClient.parameterToString(tenantId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ToxicityMonitorAlarmHistoryPostValidateBeforeCall(String tenantId, ToxicityInput toxicityInput, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ToxicityMonitorAlarmHistoryPostCall(tenantId, toxicityInput, _callback);
        return localVarCall;

    }

    /**
     * 获取预警记录 Get historical toxicity alarm records
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @return ToxicityOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResult<ToxicityOutput>apiV2ToxicityMonitorAlarmHistoryPost(String tenantId, ToxicityInput toxicityInput) throws ApiException {
        ApiResponse<ApiResult<ToxicityOutput>> localVarResp = apiV2ToxicityMonitorAlarmHistoryPostWithHttpInfo(tenantId, toxicityInput);
        return localVarResp.getData();
    }

    /**
     * 获取预警记录 Get historical toxicity alarm records
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @return ApiResponse&lt;ToxicityOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResult<ToxicityOutput>> apiV2ToxicityMonitorAlarmHistoryPostWithHttpInfo(String tenantId, ToxicityInput toxicityInput) throws ApiException {
        okhttp3.Call localVarCall = apiV2ToxicityMonitorAlarmHistoryPostValidateBeforeCall(tenantId, toxicityInput, null);
        Type localVarReturnType = new TypeToken<ApiResult<ToxicityOutput>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取预警记录 Get historical toxicity alarm records (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorAlarmHistoryPostAsync(String tenantId, ToxicityInput toxicityInput, final ApiCallback<ToxicityOutput> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ToxicityMonitorAlarmHistoryPostValidateBeforeCall(tenantId, toxicityInput, _callback);
        Type localVarReturnType = new TypeToken<ToxicityOutput>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ToxicityMonitorControlHistoryPost
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorControlHistoryPostCall(String tenantId, ToxicityInput toxicityInput, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = toxicityInput;

        // create path and map variables
        String localVarPath = "/api/v2/toxicity-monitor/control-history";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tenantId != null) {
            localVarHeaderParams.put("tenantId", localVarApiClient.parameterToString(tenantId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ToxicityMonitorControlHistoryPostValidateBeforeCall(String tenantId, ToxicityInput toxicityInput, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ToxicityMonitorControlHistoryPostCall(tenantId, toxicityInput, _callback);
        return localVarCall;

    }

    /**
     * 获取质控记录 Get historical quality control records
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @return ToxicityOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResult<ToxicityOutput>apiV2ToxicityMonitorControlHistoryPost(String tenantId, ToxicityInput toxicityInput) throws ApiException {
        ApiResponse<ApiResult<ToxicityOutput>> localVarResp = apiV2ToxicityMonitorControlHistoryPostWithHttpInfo(tenantId, toxicityInput);
        return localVarResp.getData();
    }

    /**
     * 获取质控记录 Get historical quality control records
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @return ApiResponse&lt;ToxicityOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResult<ToxicityOutput>> apiV2ToxicityMonitorControlHistoryPostWithHttpInfo(String tenantId, ToxicityInput toxicityInput) throws ApiException {
        okhttp3.Call localVarCall = apiV2ToxicityMonitorControlHistoryPostValidateBeforeCall(tenantId, toxicityInput, null);
        Type localVarReturnType = new TypeToken<ApiResult<ToxicityOutput>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取质控记录 Get historical quality control records (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorControlHistoryPostAsync(String tenantId, ToxicityInput toxicityInput, final ApiCallback<ToxicityOutput> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ToxicityMonitorControlHistoryPostValidateBeforeCall(tenantId, toxicityInput, _callback);
        Type localVarReturnType = new TypeToken<ToxicityOutput>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ToxicityMonitorMonitorHistoryPost
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorMonitorHistoryPostCall(String tenantId, ToxicityInput toxicityInput, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = toxicityInput;

        // create path and map variables
        String localVarPath = "/api/v2/toxicity-monitor/monitor-history";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tenantId != null) {
            localVarHeaderParams.put("tenantId", localVarApiClient.parameterToString(tenantId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ToxicityMonitorMonitorHistoryPostValidateBeforeCall(String tenantId, ToxicityInput toxicityInput, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ToxicityMonitorMonitorHistoryPostCall(tenantId, toxicityInput, _callback);
        return localVarCall;

    }

    /**
     * 获取毒性监测记录 Get historical toxicity monitoring records
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @return ToxicityOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResult<ToxicityOutput>apiV2ToxicityMonitorMonitorHistoryPost(String tenantId, ToxicityInput toxicityInput) throws ApiException {
        ApiResponse<ApiResult<ToxicityOutput>> localVarResp = apiV2ToxicityMonitorMonitorHistoryPostWithHttpInfo(tenantId, toxicityInput);
        return localVarResp.getData();
    }

    /**
     * 获取毒性监测记录 Get historical toxicity monitoring records
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @return ApiResponse&lt;ToxicityOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResult<ToxicityOutput>> apiV2ToxicityMonitorMonitorHistoryPostWithHttpInfo(String tenantId, ToxicityInput toxicityInput) throws ApiException {
        okhttp3.Call localVarCall = apiV2ToxicityMonitorMonitorHistoryPostValidateBeforeCall(tenantId, toxicityInput, null);
        Type localVarReturnType = new TypeToken<ApiResult<ToxicityOutput>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取毒性监测记录 Get historical toxicity monitoring records (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param toxicityInput  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorMonitorHistoryPostAsync(String tenantId, ToxicityInput toxicityInput, final ApiCallback<ToxicityOutput> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ToxicityMonitorMonitorHistoryPostValidateBeforeCall(tenantId, toxicityInput, _callback);
        Type localVarReturnType = new TypeToken<ToxicityOutput>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2ToxicityMonitorRealTimeGet
     * @param tenantId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorRealTimeGetCall(String tenantId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/toxicity-monitor/real-time";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tenantId != null) {
            localVarHeaderParams.put("tenantId", localVarApiClient.parameterToString(tenantId));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2ToxicityMonitorRealTimeGetValidateBeforeCall(String tenantId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiV2ToxicityMonitorRealTimeGetCall(tenantId, _callback);
        return localVarCall;

    }

    /**
     * 实时水质毒性和实时生物抑制率 Get real time water toxicity and biological inhibition rate
     * 
     * @param tenantId  (optional)
     * @return List&lt;RealTimeOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResult<List<RealTimeOutput>>apiV2ToxicityMonitorRealTimeGet(String tenantId) throws ApiException {
        ApiResponse<ApiResult<List<RealTimeOutput>>> localVarResp = apiV2ToxicityMonitorRealTimeGetWithHttpInfo(tenantId);
        return localVarResp.getData();
    }

    /**
     * 实时水质毒性和实时生物抑制率 Get real time water toxicity and biological inhibition rate
     * 
     * @param tenantId  (optional)
     * @return ApiResponse&lt;List&lt;RealTimeOutput&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApiResult<List<RealTimeOutput>>> apiV2ToxicityMonitorRealTimeGetWithHttpInfo(String tenantId) throws ApiException {
        okhttp3.Call localVarCall = apiV2ToxicityMonitorRealTimeGetValidateBeforeCall(tenantId, null);
        Type localVarReturnType = new TypeToken<ApiResult<List<RealTimeOutput>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 实时水质毒性和实时生物抑制率 Get real time water toxicity and biological inhibition rate (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2ToxicityMonitorRealTimeGetAsync(String tenantId, final ApiCallback<List<RealTimeOutput>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2ToxicityMonitorRealTimeGetValidateBeforeCall(tenantId, _callback);
        Type localVarReturnType = new TypeToken<List<RealTimeOutput>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
