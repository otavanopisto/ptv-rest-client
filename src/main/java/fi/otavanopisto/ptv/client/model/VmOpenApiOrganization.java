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
import fi.otavanopisto.ptv.client.model.IVmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiAddressWithType;
import fi.otavanopisto.ptv.client.model.VmOpenApiListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiOrganizationService;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiOrganization
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-25T10:00:15.767+03:00")
public class VmOpenApiOrganization   {
  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("oid")
  private String oid = null;

  @JsonProperty("municipality")
  private String municipality = null;

  @JsonProperty("streetAddressAsPostalAddress")
  private Boolean streetAddressAsPostalAddress = null;

  @JsonProperty("organizationType")
  private String organizationType = null;

  @JsonProperty("businessCode")
  private String businessCode = null;

  @JsonProperty("businessName")
  private String businessName = null;

  @JsonProperty("organizationNames")
  private List<VmOpenApiLocalizedListItem> organizationNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("organizationDescriptions")
  private List<IVmOpenApiLocalizedListItem> organizationDescriptions = new ArrayList<IVmOpenApiLocalizedListItem>();

  @JsonProperty("emailAddresses")
  private List<String> emailAddresses = new ArrayList<String>();

  @JsonProperty("phoneNumbers")
  private List<VmOpenApiListItem> phoneNumbers = new ArrayList<VmOpenApiListItem>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("addresses")
  private List<VmOpenApiAddressWithType> addresses = new ArrayList<VmOpenApiAddressWithType>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("parentOrganization")
  private String parentOrganization = null;

  @JsonProperty("services")
  private List<VmOpenApiOrganizationService> services = new ArrayList<VmOpenApiOrganizationService>();

  public VmOpenApiOrganization entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public VmOpenApiOrganization id(String id) {
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

  public VmOpenApiOrganization oid(String oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public VmOpenApiOrganization municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Get municipality
   * @return municipality
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public VmOpenApiOrganization streetAddressAsPostalAddress(Boolean streetAddressAsPostalAddress) {
    this.streetAddressAsPostalAddress = streetAddressAsPostalAddress;
    return this;
  }

   /**
   * Get streetAddressAsPostalAddress
   * @return streetAddressAsPostalAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStreetAddressAsPostalAddress() {
    return streetAddressAsPostalAddress;
  }

  public void setStreetAddressAsPostalAddress(Boolean streetAddressAsPostalAddress) {
    this.streetAddressAsPostalAddress = streetAddressAsPostalAddress;
  }

  public VmOpenApiOrganization organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Get organizationType
   * @return organizationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public VmOpenApiOrganization businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

   /**
   * Get businessCode
   * @return businessCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public VmOpenApiOrganization businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public VmOpenApiOrganization organizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
    return this;
  }

  public VmOpenApiOrganization addOrganizationNamesItem(VmOpenApiLocalizedListItem organizationNamesItem) {
    this.organizationNames.add(organizationNamesItem);
    return this;
  }

   /**
   * Get organizationNames
   * @return organizationNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLocalizedListItem> getOrganizationNames() {
    return organizationNames;
  }

  public void setOrganizationNames(List<VmOpenApiLocalizedListItem> organizationNames) {
    this.organizationNames = organizationNames;
  }

  public VmOpenApiOrganization organizationDescriptions(List<IVmOpenApiLocalizedListItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
    return this;
  }

  public VmOpenApiOrganization addOrganizationDescriptionsItem(IVmOpenApiLocalizedListItem organizationDescriptionsItem) {
    this.organizationDescriptions.add(organizationDescriptionsItem);
    return this;
  }

   /**
   * Get organizationDescriptions
   * @return organizationDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<IVmOpenApiLocalizedListItem> getOrganizationDescriptions() {
    return organizationDescriptions;
  }

  public void setOrganizationDescriptions(List<IVmOpenApiLocalizedListItem> organizationDescriptions) {
    this.organizationDescriptions = organizationDescriptions;
  }

  public VmOpenApiOrganization emailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public VmOpenApiOrganization addEmailAddressesItem(String emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * Get emailAddresses
   * @return emailAddresses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<String> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public VmOpenApiOrganization phoneNumbers(List<VmOpenApiListItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VmOpenApiOrganization addPhoneNumbersItem(VmOpenApiListItem phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiListItem> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<VmOpenApiListItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public VmOpenApiOrganization webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiOrganization addWebPagesItem(VmOpenApiWebPage webPagesItem) {
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

  public VmOpenApiOrganization addresses(List<VmOpenApiAddressWithType> addresses) {
    this.addresses = addresses;
    return this;
  }

  public VmOpenApiOrganization addAddressesItem(VmOpenApiAddressWithType addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiAddressWithType> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<VmOpenApiAddressWithType> addresses) {
    this.addresses = addresses;
  }

  public VmOpenApiOrganization publishingStatus(String publishingStatus) {
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

  public VmOpenApiOrganization parentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

   /**
   * Get parentOrganization
   * @return parentOrganization
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentOrganization() {
    return parentOrganization;
  }

  public void setParentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  public VmOpenApiOrganization services(List<VmOpenApiOrganizationService> services) {
    this.services = services;
    return this;
  }

  public VmOpenApiOrganization addServicesItem(VmOpenApiOrganizationService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiOrganizationService> getServices() {
    return services;
  }

  public void setServices(List<VmOpenApiOrganizationService> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiOrganization vmOpenApiOrganization = (VmOpenApiOrganization) o;
    return Objects.equals(this.entityId, vmOpenApiOrganization.entityId) &&
        Objects.equals(this.id, vmOpenApiOrganization.id) &&
        Objects.equals(this.oid, vmOpenApiOrganization.oid) &&
        Objects.equals(this.municipality, vmOpenApiOrganization.municipality) &&
        Objects.equals(this.streetAddressAsPostalAddress, vmOpenApiOrganization.streetAddressAsPostalAddress) &&
        Objects.equals(this.organizationType, vmOpenApiOrganization.organizationType) &&
        Objects.equals(this.businessCode, vmOpenApiOrganization.businessCode) &&
        Objects.equals(this.businessName, vmOpenApiOrganization.businessName) &&
        Objects.equals(this.organizationNames, vmOpenApiOrganization.organizationNames) &&
        Objects.equals(this.organizationDescriptions, vmOpenApiOrganization.organizationDescriptions) &&
        Objects.equals(this.emailAddresses, vmOpenApiOrganization.emailAddresses) &&
        Objects.equals(this.phoneNumbers, vmOpenApiOrganization.phoneNumbers) &&
        Objects.equals(this.webPages, vmOpenApiOrganization.webPages) &&
        Objects.equals(this.addresses, vmOpenApiOrganization.addresses) &&
        Objects.equals(this.publishingStatus, vmOpenApiOrganization.publishingStatus) &&
        Objects.equals(this.parentOrganization, vmOpenApiOrganization.parentOrganization) &&
        Objects.equals(this.services, vmOpenApiOrganization.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, id, oid, municipality, streetAddressAsPostalAddress, organizationType, businessCode, businessName, organizationNames, organizationDescriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, parentOrganization, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiOrganization {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    streetAddressAsPostalAddress: ").append(toIndentedString(streetAddressAsPostalAddress)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    organizationNames: ").append(toIndentedString(organizationNames)).append("\n");
    sb.append("    organizationDescriptions: ").append(toIndentedString(organizationDescriptions)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

