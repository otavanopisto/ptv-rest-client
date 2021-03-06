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
import fi.otavanopisto.ptv.client.model.VmOpenApiAttachment;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceHour;
import fi.otavanopisto.ptv.client.model.VmOpenApiSupport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiElectronicChannelIn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-05T14:39:52.801+03:00")
public class VmOpenApiElectronicChannelIn   {
  @JsonProperty("sourceId")
  private String sourceId = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("signatureQuantity")
  private String signatureQuantity = null;

  @JsonProperty("requiresSignature")
  private Boolean requiresSignature = null;

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("requiresAuthentication")
  private Boolean requiresAuthentication = null;

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachment> attachments = new ArrayList<VmOpenApiAttachment>();

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("deleteAllAttachments")
  private Boolean deleteAllAttachments = null;

  public VmOpenApiElectronicChannelIn sourceId(String sourceId) {
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

  public VmOpenApiElectronicChannelIn organizationId(String organizationId) {
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

  public VmOpenApiElectronicChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiElectronicChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
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

  public VmOpenApiElectronicChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiElectronicChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public VmOpenApiElectronicChannelIn signatureQuantity(String signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

   /**
   * Get signatureQuantity
   * @return signatureQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureQuantity() {
    return signatureQuantity;
  }

  public void setSignatureQuantity(String signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  public VmOpenApiElectronicChannelIn requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

   /**
   * Get requiresSignature
   * @return requiresSignature
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }

  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  public VmOpenApiElectronicChannelIn supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiElectronicChannelIn addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
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

  public VmOpenApiElectronicChannelIn requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

   /**
   * Get requiresAuthentication
   * @return requiresAuthentication
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }

  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  public VmOpenApiElectronicChannelIn urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public VmOpenApiElectronicChannelIn addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public VmOpenApiElectronicChannelIn attachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VmOpenApiElectronicChannelIn addAttachmentsItem(VmOpenApiAttachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<VmOpenApiAttachment> attachments) {
    this.attachments = attachments;
  }

  public VmOpenApiElectronicChannelIn serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiElectronicChannelIn addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
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

  public VmOpenApiElectronicChannelIn publishingStatus(String publishingStatus) {
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

  public VmOpenApiElectronicChannelIn deleteAllAttachments(Boolean deleteAllAttachments) {
    this.deleteAllAttachments = deleteAllAttachments;
    return this;
  }

   /**
   * Get deleteAllAttachments
   * @return deleteAllAttachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDeleteAllAttachments() {
    return deleteAllAttachments;
  }

  public void setDeleteAllAttachments(Boolean deleteAllAttachments) {
    this.deleteAllAttachments = deleteAllAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiElectronicChannelIn vmOpenApiElectronicChannelIn = (VmOpenApiElectronicChannelIn) o;
    return Objects.equals(this.sourceId, vmOpenApiElectronicChannelIn.sourceId) &&
        Objects.equals(this.organizationId, vmOpenApiElectronicChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiElectronicChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiElectronicChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.signatureQuantity, vmOpenApiElectronicChannelIn.signatureQuantity) &&
        Objects.equals(this.requiresSignature, vmOpenApiElectronicChannelIn.requiresSignature) &&
        Objects.equals(this.supportContacts, vmOpenApiElectronicChannelIn.supportContacts) &&
        Objects.equals(this.requiresAuthentication, vmOpenApiElectronicChannelIn.requiresAuthentication) &&
        Objects.equals(this.urls, vmOpenApiElectronicChannelIn.urls) &&
        Objects.equals(this.attachments, vmOpenApiElectronicChannelIn.attachments) &&
        Objects.equals(this.serviceHours, vmOpenApiElectronicChannelIn.serviceHours) &&
        Objects.equals(this.publishingStatus, vmOpenApiElectronicChannelIn.publishingStatus) &&
        Objects.equals(this.deleteAllAttachments, vmOpenApiElectronicChannelIn.deleteAllAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, organizationId, serviceChannelNames, serviceChannelDescriptions, signatureQuantity, requiresSignature, supportContacts, requiresAuthentication, urls, attachments, serviceHours, publishingStatus, deleteAllAttachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiElectronicChannelIn {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    requiresAuthentication: ").append(toIndentedString(requiresAuthentication)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    deleteAllAttachments: ").append(toIndentedString(deleteAllAttachments)).append("\n");
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

