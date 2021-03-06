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
import fi.otavanopisto.ptv.client.model.VmOpenApiAddressWithType;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceHour;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiServiceLocationChannelIn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-25T10:00:15.767+03:00")
public class VmOpenApiServiceLocationChannelIn   {
  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceAreaRestricted")
  private Boolean serviceAreaRestricted = null;

  @JsonProperty("serviceAreas")
  private List<String> serviceAreas = new ArrayList<String>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("serviceChargeTypes")
  private List<String> serviceChargeTypes = new ArrayList<String>();

  @JsonProperty("phoneChargeDescriptions")
  private List<VmOpenApiLanguageItem> phoneChargeDescriptions = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("phoneServiceCharge")
  private Boolean phoneServiceCharge = null;

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  @JsonProperty("coordinateSystem")
  private String coordinateSystem = null;

  @JsonProperty("coordinatesSetManually")
  private Boolean coordinatesSetManually = null;

  @JsonProperty("addresses")
  private List<VmOpenApiAddressWithType> addresses = new ArrayList<VmOpenApiAddressWithType>();

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiServiceLocationChannelIn organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiServiceLocationChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiServiceLocationChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * Get serviceChannelDescriptions
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public VmOpenApiServiceLocationChannelIn serviceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
    return this;
  }

   /**
   * Get serviceAreaRestricted
   * @return serviceAreaRestricted
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getServiceAreaRestricted() {
    return serviceAreaRestricted;
  }

  public void setServiceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
  }

  public VmOpenApiServiceLocationChannelIn serviceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addServiceAreasItem(String serviceAreasItem) {
    this.serviceAreas.add(serviceAreasItem);
    return this;
  }

   /**
   * Get serviceAreas
   * @return serviceAreas
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceAreas() {
    return serviceAreas;
  }

  public void setServiceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
  }

  public VmOpenApiServiceLocationChannelIn languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public VmOpenApiServiceLocationChannelIn email(String email) {
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

  public VmOpenApiServiceLocationChannelIn phone(String phone) {
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

  public VmOpenApiServiceLocationChannelIn fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public VmOpenApiServiceLocationChannelIn serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addServiceChargeTypesItem(String serviceChargeTypesItem) {
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

  public VmOpenApiServiceLocationChannelIn phoneChargeDescriptions(List<VmOpenApiLanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addPhoneChargeDescriptionsItem(VmOpenApiLanguageItem phoneChargeDescriptionsItem) {
    this.phoneChargeDescriptions.add(phoneChargeDescriptionsItem);
    return this;
  }

   /**
   * Get phoneChargeDescriptions
   * @return phoneChargeDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }

  public void setPhoneChargeDescriptions(List<VmOpenApiLanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  public VmOpenApiServiceLocationChannelIn phoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
    return this;
  }

   /**
   * Get phoneServiceCharge
   * @return phoneServiceCharge
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPhoneServiceCharge() {
    return phoneServiceCharge;
  }

  public void setPhoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
  }

  public VmOpenApiServiceLocationChannelIn webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addWebPagesItem(VmOpenApiWebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public VmOpenApiServiceLocationChannelIn latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public VmOpenApiServiceLocationChannelIn longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public VmOpenApiServiceLocationChannelIn coordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
    return this;
  }

   /**
   * Get coordinateSystem
   * @return coordinateSystem
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoordinateSystem() {
    return coordinateSystem;
  }

  public void setCoordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
  }

  public VmOpenApiServiceLocationChannelIn coordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
    return this;
  }

   /**
   * Get coordinatesSetManually
   * @return coordinatesSetManually
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCoordinatesSetManually() {
    return coordinatesSetManually;
  }

  public void setCoordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
  }

  public VmOpenApiServiceLocationChannelIn addresses(List<VmOpenApiAddressWithType> addresses) {
    this.addresses = addresses;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addAddressesItem(VmOpenApiAddressWithType addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiAddressWithType> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<VmOpenApiAddressWithType> addresses) {
    this.addresses = addresses;
  }

  public VmOpenApiServiceLocationChannelIn serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiServiceLocationChannelIn addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * Get serviceHours
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public VmOpenApiServiceLocationChannelIn publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiServiceLocationChannelIn vmOpenApiServiceLocationChannelIn = (VmOpenApiServiceLocationChannelIn) o;
    return Objects.equals(this.organizationId, vmOpenApiServiceLocationChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiServiceLocationChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiServiceLocationChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.serviceAreaRestricted, vmOpenApiServiceLocationChannelIn.serviceAreaRestricted) &&
        Objects.equals(this.serviceAreas, vmOpenApiServiceLocationChannelIn.serviceAreas) &&
        Objects.equals(this.languages, vmOpenApiServiceLocationChannelIn.languages) &&
        Objects.equals(this.email, vmOpenApiServiceLocationChannelIn.email) &&
        Objects.equals(this.phone, vmOpenApiServiceLocationChannelIn.phone) &&
        Objects.equals(this.fax, vmOpenApiServiceLocationChannelIn.fax) &&
        Objects.equals(this.serviceChargeTypes, vmOpenApiServiceLocationChannelIn.serviceChargeTypes) &&
        Objects.equals(this.phoneChargeDescriptions, vmOpenApiServiceLocationChannelIn.phoneChargeDescriptions) &&
        Objects.equals(this.phoneServiceCharge, vmOpenApiServiceLocationChannelIn.phoneServiceCharge) &&
        Objects.equals(this.webPages, vmOpenApiServiceLocationChannelIn.webPages) &&
        Objects.equals(this.latitude, vmOpenApiServiceLocationChannelIn.latitude) &&
        Objects.equals(this.longitude, vmOpenApiServiceLocationChannelIn.longitude) &&
        Objects.equals(this.coordinateSystem, vmOpenApiServiceLocationChannelIn.coordinateSystem) &&
        Objects.equals(this.coordinatesSetManually, vmOpenApiServiceLocationChannelIn.coordinatesSetManually) &&
        Objects.equals(this.addresses, vmOpenApiServiceLocationChannelIn.addresses) &&
        Objects.equals(this.serviceHours, vmOpenApiServiceLocationChannelIn.serviceHours) &&
        Objects.equals(this.publishingStatus, vmOpenApiServiceLocationChannelIn.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, serviceChannelNames, serviceChannelDescriptions, serviceAreaRestricted, serviceAreas, languages, email, phone, fax, serviceChargeTypes, phoneChargeDescriptions, phoneServiceCharge, webPages, latitude, longitude, coordinateSystem, coordinatesSetManually, addresses, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceLocationChannelIn {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    serviceAreaRestricted: ").append(toIndentedString(serviceAreaRestricted)).append("\n");
    sb.append("    serviceAreas: ").append(toIndentedString(serviceAreas)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
    sb.append("    phoneServiceCharge: ").append(toIndentedString(phoneServiceCharge)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateSystem: ").append(toIndentedString(coordinateSystem)).append("\n");
    sb.append("    coordinatesSetManually: ").append(toIndentedString(coordinatesSetManually)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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

