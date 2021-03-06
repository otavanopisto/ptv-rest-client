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
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiOrganizationPhoneIn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-05T14:39:52.801+03:00")
public class VmOpenApiOrganizationPhoneIn   {
  @JsonProperty("prefixNumber")
  private String prefixNumber = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("chargeType")
  private String chargeType = null;

  @JsonProperty("descriptions")
  private List<VmOpenApiLocalizedListItem> descriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  public VmOpenApiOrganizationPhoneIn prefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

   /**
   * Get prefixNumber
   * @return prefixNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public VmOpenApiOrganizationPhoneIn number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public VmOpenApiOrganizationPhoneIn type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VmOpenApiOrganizationPhoneIn chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public VmOpenApiOrganizationPhoneIn descriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public VmOpenApiOrganizationPhoneIn addDescriptionsItem(VmOpenApiLocalizedListItem descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<VmOpenApiLocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiOrganizationPhoneIn vmOpenApiOrganizationPhoneIn = (VmOpenApiOrganizationPhoneIn) o;
    return Objects.equals(this.prefixNumber, vmOpenApiOrganizationPhoneIn.prefixNumber) &&
        Objects.equals(this.number, vmOpenApiOrganizationPhoneIn.number) &&
        Objects.equals(this.type, vmOpenApiOrganizationPhoneIn.type) &&
        Objects.equals(this.chargeType, vmOpenApiOrganizationPhoneIn.chargeType) &&
        Objects.equals(this.descriptions, vmOpenApiOrganizationPhoneIn.descriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixNumber, number, type, chargeType, descriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiOrganizationPhoneIn {\n");
    
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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

