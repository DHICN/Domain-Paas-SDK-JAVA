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


import org.openapitools.client.model.BuildCalcDosageConfigInOut;
import org.openapitools.client.model.RemoteServiceErrorResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildCalcDosageConfigApi {
    private ApiClient localVarApiClient;

    public BuildCalcDosageConfigApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BuildCalcDosageConfigApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for apiDosingSysIdConfigAddDosingSysIdConfigsPost
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
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
    public okhttp3.Call apiDosingSysIdConfigAddDosingSysIdConfigsPostCall(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = buildCalcDosageConfigInOut;

        // create path and map variables
        String localVarPath = "/api/DosingSysIdConfig/AddDosingSysIdConfigs";

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
    private okhttp3.Call apiDosingSysIdConfigAddDosingSysIdConfigsPostValidateBeforeCall(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiDosingSysIdConfigAddDosingSysIdConfigsPostCall(tenantId, buildCalcDosageConfigInOut, _callback);
        return localVarCall;

    }

    /**
     * 添加加药配置信息 Add dosing algorithm parameters config data
     * 
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
     * @return Object
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
    public ApiResult<Object>apiDosingSysIdConfigAddDosingSysIdConfigsPost(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut) throws ApiException {
        ApiResponse<ApiResult<Object>> localVarResp = apiDosingSysIdConfigAddDosingSysIdConfigsPostWithHttpInfo(tenantId, buildCalcDosageConfigInOut);
        return localVarResp.getData();
    }

    /**
     * 添加加药配置信息 Add dosing algorithm parameters config data
     * 
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
     * @return ApiResponse&lt;Object&gt;
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
    public ApiResponse<ApiResult<Object>> apiDosingSysIdConfigAddDosingSysIdConfigsPostWithHttpInfo(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut) throws ApiException {
        okhttp3.Call localVarCall = apiDosingSysIdConfigAddDosingSysIdConfigsPostValidateBeforeCall(tenantId, buildCalcDosageConfigInOut, null);
        Type localVarReturnType = new TypeToken<ApiResult<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 添加加药配置信息 Add dosing algorithm parameters config data (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
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
    public okhttp3.Call apiDosingSysIdConfigAddDosingSysIdConfigsPostAsync(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiDosingSysIdConfigAddDosingSysIdConfigsPostValidateBeforeCall(tenantId, buildCalcDosageConfigInOut, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiDosingSysIdConfigDeleteDosingSysIdConfigsPost
     * @param tenantId  (optional)
     * @param UUID  (optional)
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
    public okhttp3.Call apiDosingSysIdConfigDeleteDosingSysIdConfigsPostCall(String tenantId, List<UUID> UUID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = UUID;

        // create path and map variables
        String localVarPath = "/api/DosingSysIdConfig/DeleteDosingSysIdConfigs";

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
    private okhttp3.Call apiDosingSysIdConfigDeleteDosingSysIdConfigsPostValidateBeforeCall(String tenantId, List<UUID> UUID, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiDosingSysIdConfigDeleteDosingSysIdConfigsPostCall(tenantId, UUID, _callback);
        return localVarCall;

    }

    /**
     * 根据ID删除加药配置信息 Delete dosing algorithm parameters config data by ids
     * 
     * @param tenantId  (optional)
     * @param UUID  (optional)
     * @return Object
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
    public ApiResult<Object>apiDosingSysIdConfigDeleteDosingSysIdConfigsPost(String tenantId, List<UUID> UUID) throws ApiException {
        ApiResponse<ApiResult<Object>> localVarResp = apiDosingSysIdConfigDeleteDosingSysIdConfigsPostWithHttpInfo(tenantId, UUID);
        return localVarResp.getData();
    }

    /**
     * 根据ID删除加药配置信息 Delete dosing algorithm parameters config data by ids
     * 
     * @param tenantId  (optional)
     * @param UUID  (optional)
     * @return ApiResponse&lt;Object&gt;
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
    public ApiResponse<ApiResult<Object>> apiDosingSysIdConfigDeleteDosingSysIdConfigsPostWithHttpInfo(String tenantId, List<UUID> UUID) throws ApiException {
        okhttp3.Call localVarCall = apiDosingSysIdConfigDeleteDosingSysIdConfigsPostValidateBeforeCall(tenantId, UUID, null);
        Type localVarReturnType = new TypeToken<ApiResult<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 根据ID删除加药配置信息 Delete dosing algorithm parameters config data by ids (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param UUID  (optional)
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
    public okhttp3.Call apiDosingSysIdConfigDeleteDosingSysIdConfigsPostAsync(String tenantId, List<UUID> UUID, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiDosingSysIdConfigDeleteDosingSysIdConfigsPostValidateBeforeCall(tenantId, UUID, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiDosingSysIdConfigGetAllDosingSysIdConfigsGet
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
    public okhttp3.Call apiDosingSysIdConfigGetAllDosingSysIdConfigsGetCall(String tenantId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/DosingSysIdConfig/GetAllDosingSysIdConfigs";

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
    private okhttp3.Call apiDosingSysIdConfigGetAllDosingSysIdConfigsGetValidateBeforeCall(String tenantId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiDosingSysIdConfigGetAllDosingSysIdConfigsGetCall(tenantId, _callback);
        return localVarCall;

    }

    /**
     * 获取所有加药配置 Get all the dosing algorithm parameters config data
     * 
     * @param tenantId  (optional)
     * @return List&lt;BuildCalcDosageConfigInOut&gt;
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
    public ApiResult<List<BuildCalcDosageConfigInOut>>apiDosingSysIdConfigGetAllDosingSysIdConfigsGet(String tenantId) throws ApiException {
        ApiResponse<ApiResult<List<BuildCalcDosageConfigInOut>>> localVarResp = apiDosingSysIdConfigGetAllDosingSysIdConfigsGetWithHttpInfo(tenantId);
        return localVarResp.getData();
    }

    /**
     * 获取所有加药配置 Get all the dosing algorithm parameters config data
     * 
     * @param tenantId  (optional)
     * @return ApiResponse&lt;List&lt;BuildCalcDosageConfigInOut&gt;&gt;
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
    public ApiResponse<ApiResult<List<BuildCalcDosageConfigInOut>>> apiDosingSysIdConfigGetAllDosingSysIdConfigsGetWithHttpInfo(String tenantId) throws ApiException {
        okhttp3.Call localVarCall = apiDosingSysIdConfigGetAllDosingSysIdConfigsGetValidateBeforeCall(tenantId, null);
        Type localVarReturnType = new TypeToken<ApiResult<List<BuildCalcDosageConfigInOut>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 获取所有加药配置 Get all the dosing algorithm parameters config data (asynchronously)
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
    public okhttp3.Call apiDosingSysIdConfigGetAllDosingSysIdConfigsGetAsync(String tenantId, final ApiCallback<List<BuildCalcDosageConfigInOut>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiDosingSysIdConfigGetAllDosingSysIdConfigsGetValidateBeforeCall(tenantId, _callback);
        Type localVarReturnType = new TypeToken<List<BuildCalcDosageConfigInOut>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiDosingSysIdConfigUpdateDosingSysIdConfigsPost
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
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
    public okhttp3.Call apiDosingSysIdConfigUpdateDosingSysIdConfigsPostCall(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = buildCalcDosageConfigInOut;

        // create path and map variables
        String localVarPath = "/api/DosingSysIdConfig/UpdateDosingSysIdConfigs";

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
    private okhttp3.Call apiDosingSysIdConfigUpdateDosingSysIdConfigsPostValidateBeforeCall(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = apiDosingSysIdConfigUpdateDosingSysIdConfigsPostCall(tenantId, buildCalcDosageConfigInOut, _callback);
        return localVarCall;

    }

    /**
     * 更新加药配置信息 Update dosing algorithm parameters config data
     * 
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
     * @return Object
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
    public ApiResult<Object>apiDosingSysIdConfigUpdateDosingSysIdConfigsPost(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut) throws ApiException {
        ApiResponse<ApiResult<Object>> localVarResp = apiDosingSysIdConfigUpdateDosingSysIdConfigsPostWithHttpInfo(tenantId, buildCalcDosageConfigInOut);
        return localVarResp.getData();
    }

    /**
     * 更新加药配置信息 Update dosing algorithm parameters config data
     * 
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
     * @return ApiResponse&lt;Object&gt;
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
    public ApiResponse<ApiResult<Object>> apiDosingSysIdConfigUpdateDosingSysIdConfigsPostWithHttpInfo(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut) throws ApiException {
        okhttp3.Call localVarCall = apiDosingSysIdConfigUpdateDosingSysIdConfigsPostValidateBeforeCall(tenantId, buildCalcDosageConfigInOut, null);
        Type localVarReturnType = new TypeToken<ApiResult<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 更新加药配置信息 Update dosing algorithm parameters config data (asynchronously)
     * 
     * @param tenantId  (optional)
     * @param buildCalcDosageConfigInOut  (optional)
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
    public okhttp3.Call apiDosingSysIdConfigUpdateDosingSysIdConfigsPostAsync(String tenantId, List<BuildCalcDosageConfigInOut> buildCalcDosageConfigInOut, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiDosingSysIdConfigUpdateDosingSysIdConfigsPostValidateBeforeCall(tenantId, buildCalcDosageConfigInOut, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
