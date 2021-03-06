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
import fi.otavanopisto.ptv.client.model.VmOpenApiAddress;
import fi.otavanopisto.ptv.client.model.VmOpenApiAttachmentWithType;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceHour;
import fi.otavanopisto.ptv.client.model.VmOpenApiSupport;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiPrintableFormChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-05T14:39:52.801+03:00")
public class VmOpenApiPrintableFormChannel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("serviceChannelType")
  private String serviceChannelType = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLocalizedListItem> serviceChannelNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("formIdentifier")
  private String formIdentifier = null;

  @JsonProperty("formReceiver")
  private String formReceiver = null;

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("deliveryAddress")
  private VmOpenApiAddress deliveryAddress = null;

  @JsonProperty("channelUrls")
  private List<VmOpenApiLocalizedListItem> channelUrls = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("deliveryAddressDescriptions")
  private List<VmOpenApiLanguageItem> deliveryAddressDescriptions = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachmentWithType> attachments = new ArrayList<VmOpenApiAttachmentWithType>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiPrintableFormChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VmOpenApiPrintableFormChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

   /**
   * Get serviceChannelType
   * @return serviceChannelType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChannelType() {
    return serviceChannelType;
  }

  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  public VmOpenApiPrintableFormChannel organizationId(String organizationId) {
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

  public VmOpenApiPrintableFormChannel serviceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiPrintableFormChannel addServiceChannelNamesItem(VmOpenApiLocalizedListItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiPrintableFormChannel serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiPrintableFormChannel addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public VmOpenApiPrintableFormChannel formIdentifier(String formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

   /**
   * Get formIdentifier
   * @return formIdentifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormIdentifier() {
    return formIdentifier;
  }

  public void setFormIdentifier(String formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  public VmOpenApiPrintableFormChannel formReceiver(String formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

   /**
   * Get formReceiver
   * @return formReceiver
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(String formReceiver) {
    this.formReceiver = formReceiver;
  }

  public VmOpenApiPrintableFormChannel supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiPrintableFormChannel addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
    this.supportContacts.add(supportContactsItem);
    return this;
  }

   /**
   * Get supportContacts
   * @return supportContacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiSupport> getSupportContacts() {
    return supportContacts;
  }

  public void setSupportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
  }

  public VmOpenApiPrintableFormChannel deliveryAddress(VmOpenApiAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public VmOpenApiAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(VmOpenApiAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public VmOpenApiPrintableFormChannel channelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public VmOpenApiPrintableFormChannel addChannelUrlsItem(VmOpenApiLocalizedListItem channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * Get channelUrls
   * @return channelUrls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getChannelUrls() {
    return channelUrls;
  }

  public void setChannelUrls(List<VmOpenApiLocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
  }

  public VmOpenApiPrintableFormChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiPrintableFormChannel addLanguagesItem(String languagesItem) {
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

  public VmOpenApiPrintableFormChannel deliveryAddressDescriptions(List<VmOpenApiLanguageItem> deliveryAddressDescriptions) {
    this.deliveryAddressDescriptions = deliveryAddressDescriptions;
    return this;
  }

  public VmOpenApiPrintableFormChannel addDeliveryAddressDescriptionsItem(VmOpenApiLanguageItem deliveryAddressDescriptionsItem) {
    this.deliveryAddressDescriptions.add(deliveryAddressDescriptionsItem);
    return this;
  }

   /**
   * Get deliveryAddressDescriptions
   * @return deliveryAddressDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getDeliveryAddressDescriptions() {
    return deliveryAddressDescriptions;
  }

  public void setDeliveryAddressDescriptions(List<VmOpenApiLanguageItem> deliveryAddressDescriptions) {
    this.deliveryAddressDescriptions = deliveryAddressDescriptions;
  }

  public VmOpenApiPrintableFormChannel attachments(List<VmOpenApiAttachmentWithType> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VmOpenApiPrintableFormChannel addAttachmentsItem(VmOpenApiAttachmentWithType attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiAttachmentWithType> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<VmOpenApiAttachmentWithType> attachments) {
    this.attachments = attachments;
  }

  public VmOpenApiPrintableFormChannel webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiPrintableFormChannel addWebPagesItem(VmOpenApiWebPage webPagesItem) {
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

  public VmOpenApiPrintableFormChannel serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiPrintableFormChannel addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
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

  public VmOpenApiPrintableFormChannel publishingStatus(String publishingStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiPrintableFormChannel vmOpenApiPrintableFormChannel = (VmOpenApiPrintableFormChannel) o;
    return Objects.equals(this.id, vmOpenApiPrintableFormChannel.id) &&
        Objects.equals(this.serviceChannelType, vmOpenApiPrintableFormChannel.serviceChannelType) &&
        Objects.equals(this.organizationId, vmOpenApiPrintableFormChannel.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiPrintableFormChannel.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiPrintableFormChannel.serviceChannelDescriptions) &&
        Objects.equals(this.formIdentifier, vmOpenApiPrintableFormChannel.formIdentifier) &&
        Objects.equals(this.formReceiver, vmOpenApiPrintableFormChannel.formReceiver) &&
        Objects.equals(this.supportContacts, vmOpenApiPrintableFormChannel.supportContacts) &&
        Objects.equals(this.deliveryAddress, vmOpenApiPrintableFormChannel.deliveryAddress) &&
        Objects.equals(this.channelUrls, vmOpenApiPrintableFormChannel.channelUrls) &&
        Objects.equals(this.languages, vmOpenApiPrintableFormChannel.languages) &&
        Objects.equals(this.deliveryAddressDescriptions, vmOpenApiPrintableFormChannel.deliveryAddressDescriptions) &&
        Objects.equals(this.attachments, vmOpenApiPrintableFormChannel.attachments) &&
        Objects.equals(this.webPages, vmOpenApiPrintableFormChannel.webPages) &&
        Objects.equals(this.serviceHours, vmOpenApiPrintableFormChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, vmOpenApiPrintableFormChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, formIdentifier, formReceiver, supportContacts, deliveryAddress, channelUrls, languages, deliveryAddressDescriptions, attachments, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiPrintableFormChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    deliveryAddressDescriptions: ").append(toIndentedString(deliveryAddressDescriptions)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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

