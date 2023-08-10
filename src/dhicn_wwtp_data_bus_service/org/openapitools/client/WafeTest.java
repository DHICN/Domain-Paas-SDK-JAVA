package org.openapitools.client;

import java.util.List;

import org.openapitools.client.api.ApiResult;
import org.openapitools.client.api.GeneralDataApi;
import org.openapitools.client.model.EntireProcessWqOut;
import org.threeten.bp.format.DateTimeParseException;

public class WafeTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String token = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IlV0aHAwdjVsUnpOc1lZT3VyQ3JTdmciLCJ0eXAiOiJhdCtqd3QifQ.eyJuYmYiOjE2OTEzNzgwMTUsImV4cCI6MTY5MTk4MjgxNSwiaXNzIjoiaHR0cDovL2RoaWdyb3VwLmNvbSIsImF1ZCI6ImFwaTEiLCJjbGllbnRfaWQiOiJJZGVudGl0eVNlcnZlcl9BcHAiLCJzdWIiOiIzYTA3ZmM1YS1lMmQ2LTgxNzEtYWM3ZC0zMTVmMzg4MWNkY2MiLCJhdXRoX3RpbWUiOjE2OTEzNzgwMTUsImlkcCI6ImxvY2FsIiwibmFtZSI6ImJ6dGVzdDEiLCJnaXZlbl9uYW1lIjoi57O757uf566h55CG5ZGYIiwiZW1haWwiOiIiLCJ0ZW5hbnRJZCI6IjNhMDdmYzVhLWUyY2MtMjEzNi02OTY5LTBlMWYxYWQ0MjA1ZiIsInJvbGUiOiJ0ZW5hbnRfYWRtaW4iLCJyb2xlX25hbWUiOiLnrqHnkIblkZgiLCJzY29wZSI6WyJvcGVuaWQiLCJwcm9maWxlIiwiYXBpMSIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJjdXN0b20iXX0.YX2GoRXp3jj8yglfoZRRYuSsJk4aVLlyOEJoaKdZPf64b_dxGTNighkrEAkayjPkrrKXjtLtHSJlNQRvioV61y7cCKe2p2DWWpwv-dZKBNd3_o2qfgSOOsGshTAaLCWmhRLulrdsirpjN4TyZpKYron6EoVQupTGVfxz2YDVFf3_URsWIPnl8QBLlXo9I8E1qWiOgCbr7ZchjwcRj5WMyFCbUVvbQ47X8WWUCDxRkOFP7SOVoAtpWDdQ9zmjv8xOKFU5QzuyTQUeUM_3sqWk2MRPyhgdw7oxyrDf798x_FOt8w8JWQ9HcXuQinjBv9WaswI3VtbNdsSXbgA74P8QdQ";
        String tenantId = "3a07fc5a-e2cc-2136-6969-0e1f1ad4205f";
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://online-products.dhichina.cn/gateway/wwtp-paas-main-bus-service");
        defaultClient.addDefaultHeader("Authorization", token);
        defaultClient.addDefaultHeader("tenantId", tenantId);

        GeneralDataApi apiInstance = new GeneralDataApi(defaultClient);
        String productLine = "1A"; // String | 工艺线代码 product line code
        String startTime = "2023-08-06 00:00:00"; // String | 开始时间 start time
        String endTime = "2023-08-06 01:00:00"; // String | 结束时间 end time
        String modelName = "在线滚动模型"; // String | 模板模型名称 template model name
        try {
            ApiResult<List<EntireProcessWqOut>> result = apiInstance.apiV2OutputEntireProcessTsByProductlineGet(
                    productLine, startTime, endTime, modelName,
                    tenantId);
            System.out.println(result.data.get(0).getTsData());
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralDataApi#apiV2OutputEntireProcessTsByProductlineGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
