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
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceHour;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiPhoneChannelInBase
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-05T14:39:52.801+03:00")
public class VmOpenApiPhoneChannelInBase   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("phoneType")
  private String phoneType = null;

  @JsonProperty("serviceChargeTypes")
  private List<String> serviceChargeTypes = new ArrayList<String>();

  @JsonProperty("phoneNumbers")
  private List<VmOpenApiLanguageItem> phoneNumbers = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("supportContactEmail")
  private String supportContactEmail = null;

  @JsonProperty("phoneChargeDescription")
  private String phoneChargeDescription = null;

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("deleteAllWebPages")
  private Boolean deleteAllWebPages = null;

  @JsonProperty("deleteAllSupportContacts")
  private Boolean deleteAllSupportContacts = null;

  @JsonProperty("deleteAllServiceChargeTypes")
  private Boolean deleteAllServiceChargeTypes = null;

  @JsonProperty("deleteAllServiceHours")
  private Boolean deleteAllServiceHours = null;

  public VmOpenApiPhoneChannelInBase sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public VmOpenApiPhoneChannelInBase organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiPhoneChannelInBase serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiPhoneChannelInBase serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * Get serviceChannelDescriptions
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public VmOpenApiPhoneChannelInBase phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  public VmOpenApiPhoneChannelInBase serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addServiceChargeTypesItem(String serviceChargeTypesItem) {
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

  public VmOpenApiPhoneChannelInBase phoneNumbers(List<VmOpenApiLanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addPhoneNumbersItem(VmOpenApiLanguageItem phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<VmOpenApiLanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public VmOpenApiPhoneChannelInBase urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public VmOpenApiPhoneChannelInBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public VmOpenApiPhoneChannelInBase supportContactEmail(String supportContactEmail) {
    this.supportContactEmail = supportContactEmail;
    return this;
  }

   /**
   * Get supportContactEmail
   * @return supportContactEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSupportContactEmail() {
    return supportContactEmail;
  }

  public void setSupportContactEmail(String supportContactEmail) {
    this.supportContactEmail = supportContactEmail;
  }

  public VmOpenApiPhoneChannelInBase phoneChargeDescription(String phoneChargeDescription) {
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

  public VmOpenApiPhoneChannelInBase serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiPhoneChannelInBase addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
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

  public VmOpenApiPhoneChannelInBase publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public VmOpenApiPhoneChannelInBase deleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
    return this;
  }

   /**
   * Get deleteAllWebPages
   * @return deleteAllWebPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDeleteAllWebPages() {
    return deleteAllWebPages;
  }

  public void setDeleteAllWebPages(Boolean deleteAllWebPages) {
    this.deleteAllWebPages = deleteAllWebPages;
  }

  public VmOpenApiPhoneChannelInBase deleteAllSupportContacts(Boolean deleteAllSupportContacts) {
    this.deleteAllSupportContacts = deleteAllSupportContacts;
    return this;
  }

   /**
   * Get deleteAllSupportContacts
   * @return deleteAllSupportContacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDeleteAllSupportContacts() {
    return deleteAllSupportContacts;
  }

  public void setDeleteAllSupportContacts(Boolean deleteAllSupportContacts) {
    this.deleteAllSupportContacts = deleteAllSupportContacts;
  }

  public VmOpenApiPhoneChannelInBase deleteAllServiceChargeTypes(Boolean deleteAllServiceChargeTypes) {
    this.deleteAllServiceChargeTypes = deleteAllServiceChargeTypes;
    return this;
  }

   /**
   * Get deleteAllServiceChargeTypes
   * @return deleteAllServiceChargeTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDeleteAllServiceChargeTypes() {
    return deleteAllServiceChargeTypes;
  }

  public void setDeleteAllServiceChargeTypes(Boolean deleteAllServiceChargeTypes) {
    this.deleteAllServiceChargeTypes = deleteAllServiceChargeTypes;
  }

  public VmOpenApiPhoneChannelInBase deleteAllServiceHours(Boolean deleteAllServiceHours) {
    this.deleteAllServiceHours = deleteAllServiceHours;
    return this;
  }

   /**
   * Get deleteAllServiceHours
   * @return deleteAllServiceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDeleteAllServiceHours() {
    return deleteAllServiceHours;
  }

  public void setDeleteAllServiceHours(Boolean deleteAllServiceHours) {
    this.deleteAllServiceHours = deleteAllServiceHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiPhoneChannelInBase vmOpenApiPhoneChannelInBase = (VmOpenApiPhoneChannelInBase) o;
    return Objects.equals(this.sourceId, vmOpenApiPhoneChannelInBase.sourceId) &&
        Objects.equals(this.organizationId, vmOpenApiPhoneChannelInBase.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiPhoneChannelInBase.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiPhoneChannelInBase.serviceChannelDescriptions) &&
        Objects.equals(this.phoneType, vmOpenApiPhoneChannelInBase.phoneType) &&
        Objects.equals(this.serviceChargeTypes, vmOpenApiPhoneChannelInBase.serviceChargeTypes) &&
        Objects.equals(this.phoneNumbers, vmOpenApiPhoneChannelInBase.phoneNumbers) &&
        Objects.equals(this.urls, vmOpenApiPhoneChannelInBase.urls) &&
        Objects.equals(this.languages, vmOpenApiPhoneChannelInBase.languages) &&
        Objects.equals(this.supportContactEmail, vmOpenApiPhoneChannelInBase.supportContactEmail) &&
        Objects.equals(this.phoneChargeDescription, vmOpenApiPhoneChannelInBase.phoneChargeDescription) &&
        Objects.equals(this.serviceHours, vmOpenApiPhoneChannelInBase.serviceHours) &&
        Objects.equals(this.publishingStatus, vmOpenApiPhoneChannelInBase.publishingStatus) &&
        Objects.equals(this.deleteAllWebPages, vmOpenApiPhoneChannelInBase.deleteAllWebPages) &&
        Objects.equals(this.deleteAllSupportContacts, vmOpenApiPhoneChannelInBase.deleteAllSupportContacts) &&
        Objects.equals(this.deleteAllServiceChargeTypes, vmOpenApiPhoneChannelInBase.deleteAllServiceChargeTypes) &&
        Objects.equals(this.deleteAllServiceHours, vmOpenApiPhoneChannelInBase.deleteAllServiceHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, phoneType, serviceChargeTypes, phoneNumbers, urls, languages, supportContactEmail, phoneChargeDescription, serviceHours, publishingStatus, deleteAllWebPages, deleteAllSupportContacts, deleteAllServiceChargeTypes, deleteAllServiceHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiPhoneChannelInBase {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    supportContactEmail: ").append(toIndentedString(supportContactEmail)).append("\n");
    sb.append("    phoneChargeDescription: ").append(toIndentedString(phoneChargeDescription)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    deleteAllWebPages: ").append(toIndentedString(deleteAllWebPages)).append("\n");
    sb.append("    deleteAllSupportContacts: ").append(toIndentedString(deleteAllSupportContacts)).append("\n");
    sb.append("    deleteAllServiceChargeTypes: ").append(toIndentedString(deleteAllServiceChargeTypes)).append("\n");
    sb.append("    deleteAllServiceHours: ").append(toIndentedString(deleteAllServiceHours)).append("\n");
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

