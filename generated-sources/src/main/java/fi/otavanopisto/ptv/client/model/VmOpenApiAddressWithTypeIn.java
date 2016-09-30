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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiAddressWithTypeIn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-30T08:33:13.270+03:00")
public class VmOpenApiAddressWithTypeIn   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("postOfficeBox")
  private String postOfficeBox = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("postOffice")
  private String postOffice = null;

  @JsonProperty("streetAddress")
  private List<VmOpenApiLanguageItem> streetAddress = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("municipality")
  private String municipality = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("qualifier")
  private String qualifier = null;

  @JsonProperty("additionalInformations")
  private List<VmOpenApiLanguageItem> additionalInformations = new ArrayList<VmOpenApiLanguageItem>();

  public VmOpenApiAddressWithTypeIn type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiAddressWithTypeIn postOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

   /**
   * Get postOfficeBox
   * @return postOfficeBox
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostOfficeBox() {
    return postOfficeBox;
  }

  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }

  public VmOpenApiAddressWithTypeIn postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public VmOpenApiAddressWithTypeIn postOffice(String postOffice) {
    this.postOffice = postOffice;
    return this;
  }

   /**
   * Get postOffice
   * @return postOffice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostOffice() {
    return postOffice;
  }

  public void setPostOffice(String postOffice) {
    this.postOffice = postOffice;
  }

  public VmOpenApiAddressWithTypeIn streetAddress(List<VmOpenApiLanguageItem> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public VmOpenApiAddressWithTypeIn addStreetAddressItem(VmOpenApiLanguageItem streetAddressItem) {
    this.streetAddress.add(streetAddressItem);
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLanguageItem> getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(List<VmOpenApiLanguageItem> streetAddress) {
    this.streetAddress = streetAddress;
  }

  public VmOpenApiAddressWithTypeIn municipality(String municipality) {
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

  public VmOpenApiAddressWithTypeIn country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public VmOpenApiAddressWithTypeIn qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

   /**
   * Get qualifier
   * @return qualifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public VmOpenApiAddressWithTypeIn additionalInformations(List<VmOpenApiLanguageItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public VmOpenApiAddressWithTypeIn addAdditionalInformationsItem(VmOpenApiLanguageItem additionalInformationsItem) {
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(List<VmOpenApiLanguageItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiAddressWithTypeIn vmOpenApiAddressWithTypeIn = (VmOpenApiAddressWithTypeIn) o;
    return Objects.equals(this.type, vmOpenApiAddressWithTypeIn.type) &&
        Objects.equals(this.postOfficeBox, vmOpenApiAddressWithTypeIn.postOfficeBox) &&
        Objects.equals(this.postalCode, vmOpenApiAddressWithTypeIn.postalCode) &&
        Objects.equals(this.postOffice, vmOpenApiAddressWithTypeIn.postOffice) &&
        Objects.equals(this.streetAddress, vmOpenApiAddressWithTypeIn.streetAddress) &&
        Objects.equals(this.municipality, vmOpenApiAddressWithTypeIn.municipality) &&
        Objects.equals(this.country, vmOpenApiAddressWithTypeIn.country) &&
        Objects.equals(this.qualifier, vmOpenApiAddressWithTypeIn.qualifier) &&
        Objects.equals(this.additionalInformations, vmOpenApiAddressWithTypeIn.additionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, postOfficeBox, postalCode, postOffice, streetAddress, municipality, country, qualifier, additionalInformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiAddressWithTypeIn {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(postOfficeBox)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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
