/**
 * PTV Open Api
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.otavanopisto.ptv.client;

import fi.otavanopisto.ptv.client.model.*;

import fi.otavanopisto.ptv.client.model.IVmError;
import fi.otavanopisto.ptv.client.model.IVmOpenApiService;
import fi.otavanopisto.ptv.client.model.VmOpenApiGuidPage;
import java.time.OffsetDateTime;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceIn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-25T10:00:15.767+03:00")
public class ServiceApi {

  public ServiceApi(ApiClient client) {
    this.client = client;
  }
  
  /**
   * Fetches all the information related to a single service.
   * 
   * @param id  (required)
   */
  public ApiResponse<IVmOpenApiService> apiServiceByIdGet(String id) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/Service/{id}"
      .replaceAll("\\{" + "id" + "\\}", id);
      
    ResultType<IVmOpenApiService> resultType = new ResultType<IVmOpenApiService>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets all the published services within PTV as a list of service ids.              Services created after certain date can be fetched by adding date as query string parameter.
   * 
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   * @param page The page number to be fetched. (optional)
   */
  public ApiResponse<VmOpenApiGuidPage> apiServiceGet(OffsetDateTime date, Integer page) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
if (page != null)
    queryParams.put("page", page);
    
        
    String path = "/api/Service";
      
    ResultType<VmOpenApiGuidPage> resultType = new ResultType<VmOpenApiGuidPage>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Creates a new service with the data provided as input.
   * 
   * @param request The service data. (optional)
   */
  public ApiResponse<VmOpenApiServiceIn> apiServicePost(VmOpenApiServiceIn request) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = "/api/Service";
      
    ResultType<VmOpenApiServiceIn> resultType = new ResultType<VmOpenApiServiceIn>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Gets a list of published services for defined service channel.              Services joined to service channel after certain date can be fetched by adding date as query string parameter.
   * 
   * @param serviceChannelId Guid (required)
   * @param date Supports only format \&quot;yyyy-MM-ddTHH:mm:ss\&quot; (optional)
   */
  public ApiResponse<List<IVmOpenApiService>> apiServiceServiceChannelByServiceChannelIdGet(String serviceChannelId, OffsetDateTime date) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (date != null)
    queryParams.put("date", date);
    
        
    String path = "/api/Service/serviceChannel/{serviceChannelId}"
      .replaceAll("\\{" + "serviceChannelId" + "\\}", serviceChannelId);
      
    ResultType<List<IVmOpenApiService>> resultType = new ResultType<List<IVmOpenApiService>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  
  private ApiClient client;
}