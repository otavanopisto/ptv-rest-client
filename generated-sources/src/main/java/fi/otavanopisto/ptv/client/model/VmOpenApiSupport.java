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


package fi.otavanopisto.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiSupport
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-05T14:39:52.801+03:00")
public class VmOpenApiSupport   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("phoneChargeDescription")
  private String phoneChargeDescription = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("serviceChargeTypes")
  private List<String> serviceChargeTypes = new ArrayList<String>();

  public VmOpenApiSupport email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public VmOpenApiSupport phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public VmOpenApiSupport phoneChargeDescription(String phoneChargeDescription) {
    this.phoneChargeDescription = phoneChargeDescription;
    return this;
  }

   /**
   * Get phoneChargeDescription
   * @return phoneChargeDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneChargeDescription() {
    return phoneChargeDescription;
  }

  public void setPhoneChargeDescription(String phoneChargeDescription) {
    this.phoneChargeDescription = phoneChargeDescription;
  }

  public VmOpenApiSupport language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public VmOpenApiSupport serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  public VmOpenApiSupport addServiceChargeTypesItem(String serviceChargeTypesItem) {
    this.serviceChargeTypes.add(serviceChargeTypesItem);
    return this;
  }

   /**
   * Get serviceChargeTypes
   * @return serviceChargeTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceChargeTypes() {
    return serviceChargeTypes;
  }

  public void setServiceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiSupport vmOpenApiSupport = (VmOpenApiSupport) o;
    return Objects.equals(this.email, vmOpenApiSupport.email) &&
        Objects.equals(this.phone, vmOpenApiSupport.phone) &&
        Objects.equals(this.phoneChargeDescription, vmOpenApiSupport.phoneChargeDescription) &&
        Objects.equals(this.language, vmOpenApiSupport.language) &&
        Objects.equals(this.serviceChargeTypes, vmOpenApiSupport.serviceChargeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, phone, phoneChargeDescription, language, serviceChargeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiSupport {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneChargeDescription: ").append(toIndentedString(phoneChargeDescription)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

