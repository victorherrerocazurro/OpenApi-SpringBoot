package com.davidherron.pv_inverters_modules.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Module
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-23T10:48:04.857Z")

public class Module   {
  @JsonProperty("manufacturer")
  private String manufacturer = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("BIPV")
  private String BIPV = null;

  @JsonProperty("nameplatePmax")
  private Integer nameplatePmax = null;

  @JsonProperty("PTC")
  private Float PTC = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("nameplateVpmax")
  private Float nameplateVpmax = null;

  @JsonProperty("nameplateIpmax")
  private Float nameplateIpmax = null;

  @JsonProperty("nameplateVoc")
  private Float nameplateVoc = null;

  @JsonProperty("nameplateIsc")
  private Float nameplateIsc = null;

  @JsonProperty("averageNOCT")
  private Float averageNOCT = null;

  @JsonProperty("betaVoc")
  private Float betaVoc = null;

  @JsonProperty("betaVpmax")
  private Float betaVpmax = null;

  @JsonProperty("alphaIsc")
  private Float alphaIsc = null;

  @JsonProperty("alphaIpmax")
  private Float alphaIpmax = null;

  @JsonProperty("gammaPmax")
  private Float gammaPmax = null;

  @JsonProperty("VPmaxlow")
  private Float vpmaxlow = null;

  @JsonProperty("IPmaxlow")
  private Float ipmaxlow = null;

  @JsonProperty("VPmaxNOCT")
  private Float vpmaxNOCT = null;

  @JsonProperty("IPmaxNOCT")
  private Float ipmaxNOCT = null;

  @JsonProperty("sizeShortSide")
  private Float sizeShortSide = null;

  @JsonProperty("sizeLongSide")
  private Float sizeLongSide = null;

  @JsonProperty("geometricMultiplier")
  private Float geometricMultiplier = null;

  @JsonProperty("ApertureArea")
  private Float apertureArea = null;

  @JsonProperty("NumberCellsSeries")
  private Float numberCellsSeries = null;

  @JsonProperty("NumberCellsParallel")
  private Float numberCellsParallel = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("technology")
  private String technology = null;

  @JsonProperty("mounting")
  private String mounting = null;

  @JsonProperty("lastUpdate")
  private String lastUpdate = null;

  @JsonProperty("cecListingDate")
  private String cecListingDate = null;

  public Module manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

  /**
   * Manufacturer name
   * @return manufacturer
  **/
  @ApiModelProperty(value = "Manufacturer name")


  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Module model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Manufacturer-assigned model number
   * @return model
  **/
  @ApiModelProperty(value = "Manufacturer-assigned model number")


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Module description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Manufacturer's description
   * @return description
  **/
  @ApiModelProperty(value = "Manufacturer's description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Module BIPV(String BIPV) {
    this.BIPV = BIPV;
    return this;
  }

  /**
   * Building Integrated PV
   * @return BIPV
  **/
  @ApiModelProperty(value = "Building Integrated PV")


  public String getBIPV() {
    return BIPV;
  }

  public void setBIPV(String BIPV) {
    this.BIPV = BIPV;
  }

  public Module nameplatePmax(Integer nameplatePmax) {
    this.nameplatePmax = nameplatePmax;
    return this;
  }

  /**
   * Pmax
   * @return nameplatePmax
  **/
  @ApiModelProperty(value = "Pmax")


  public Integer getNameplatePmax() {
    return nameplatePmax;
  }

  public void setNameplatePmax(Integer nameplatePmax) {
    this.nameplatePmax = nameplatePmax;
  }

  public Module PTC(Float PTC) {
    this.PTC = PTC;
    return this;
  }

  /**
   * PVUSA Test Conditions, which were developed to test and compare PV systems as part of the PVUSA (Photovoltaics for Utility Scale Applications) project. PTC are 1,000 Watts per square meter solar irradiance, 20 degrees C air temperature, and wind speed of 1 meter per second at 10 meters above ground level. PV manufacturers use Standard Test Conditions, or STC, to rate their PV products. STC are 1,000 Watts per square meter solar irradiance, 25 degrees C cell temperature, air mass equal to 1.5, and ASTM G173-03 standard spectrum. The PTC rating, which is lower than the STC rating, is generally recognized as a more realistic measure of PV output because the test conditions better reflect \"real-world\" solar and climatic conditions, compared to the STC rating. All ratings in the list are DC (direct current) watts. 
   * @return PTC
  **/
  @ApiModelProperty(value = "PVUSA Test Conditions, which were developed to test and compare PV systems as part of the PVUSA (Photovoltaics for Utility Scale Applications) project. PTC are 1,000 Watts per square meter solar irradiance, 20 degrees C air temperature, and wind speed of 1 meter per second at 10 meters above ground level. PV manufacturers use Standard Test Conditions, or STC, to rate their PV products. STC are 1,000 Watts per square meter solar irradiance, 25 degrees C cell temperature, air mass equal to 1.5, and ASTM G173-03 standard spectrum. The PTC rating, which is lower than the STC rating, is generally recognized as a more realistic measure of PV output because the test conditions better reflect \"real-world\" solar and climatic conditions, compared to the STC rating. All ratings in the list are DC (direct current) watts. ")


  public Float getPTC() {
    return PTC;
  }

  public void setPTC(Float PTC) {
    this.PTC = PTC;
  }

  public Module notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Manufacturer's notes
   * @return notes
  **/
  @ApiModelProperty(value = "Manufacturer's notes")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Module nameplateVpmax(Float nameplateVpmax) {
    this.nameplateVpmax = nameplateVpmax;
    return this;
  }

  /**
   * Voltage at Maximum Power
   * @return nameplateVpmax
  **/
  @ApiModelProperty(value = "Voltage at Maximum Power")


  public Float getNameplateVpmax() {
    return nameplateVpmax;
  }

  public void setNameplateVpmax(Float nameplateVpmax) {
    this.nameplateVpmax = nameplateVpmax;
  }

  public Module nameplateIpmax(Float nameplateIpmax) {
    this.nameplateIpmax = nameplateIpmax;
    return this;
  }

  /**
   * Current at Maximum Power (Ip max)
   * @return nameplateIpmax
  **/
  @ApiModelProperty(value = "Current at Maximum Power (Ip max)")


  public Float getNameplateIpmax() {
    return nameplateIpmax;
  }

  public void setNameplateIpmax(Float nameplateIpmax) {
    this.nameplateIpmax = nameplateIpmax;
  }

  public Module nameplateVoc(Float nameplateVoc) {
    this.nameplateVoc = nameplateVoc;
    return this;
  }

  /**
   * Open Circuit Voltage (Voc)
   * @return nameplateVoc
  **/
  @ApiModelProperty(value = "Open Circuit Voltage (Voc)")


  public Float getNameplateVoc() {
    return nameplateVoc;
  }

  public void setNameplateVoc(Float nameplateVoc) {
    this.nameplateVoc = nameplateVoc;
  }

  public Module nameplateIsc(Float nameplateIsc) {
    this.nameplateIsc = nameplateIsc;
    return this;
  }

  /**
   * Short Circuit Current (Isc)
   * @return nameplateIsc
  **/
  @ApiModelProperty(value = "Short Circuit Current (Isc)")


  public Float getNameplateIsc() {
    return nameplateIsc;
  }

  public void setNameplateIsc(Float nameplateIsc) {
    this.nameplateIsc = nameplateIsc;
  }

  public Module averageNOCT(Float averageNOCT) {
    this.averageNOCT = averageNOCT;
    return this;
  }

  /**
   * Nominal Operating Cell Temperature. The temperature reached by open circuited cells in a PV module under the following conditions: 800 watts per square meter irradiance on cell surface, 20 degrees Celsius air temperature, 1 meter per second wind velocity, and open back side mounting
   * @return averageNOCT
  **/
  @ApiModelProperty(value = "Nominal Operating Cell Temperature. The temperature reached by open circuited cells in a PV module under the following conditions: 800 watts per square meter irradiance on cell surface, 20 degrees Celsius air temperature, 1 meter per second wind velocity, and open back side mounting")


  public Float getAverageNOCT() {
    return averageNOCT;
  }

  public void setAverageNOCT(Float averageNOCT) {
    this.averageNOCT = averageNOCT;
  }

  public Module betaVoc(Float betaVoc) {
    this.betaVoc = betaVoc;
    return this;
  }

  /**
   * Temperature Coefficient of Open Circuit Voltage, percent per degrees Celsius (β Voc)
   * @return betaVoc
  **/
  @ApiModelProperty(value = "Temperature Coefficient of Open Circuit Voltage, percent per degrees Celsius (β Voc)")


  public Float getBetaVoc() {
    return betaVoc;
  }

  public void setBetaVoc(Float betaVoc) {
    this.betaVoc = betaVoc;
  }

  public Module betaVpmax(Float betaVpmax) {
    this.betaVpmax = betaVpmax;
    return this;
  }

  /**
   * Temperature Coefficient of Voltage at Maximum Power, percent per degrees Celsius (β Vp max)
   * @return betaVpmax
  **/
  @ApiModelProperty(value = "Temperature Coefficient of Voltage at Maximum Power, percent per degrees Celsius (β Vp max)")


  public Float getBetaVpmax() {
    return betaVpmax;
  }

  public void setBetaVpmax(Float betaVpmax) {
    this.betaVpmax = betaVpmax;
  }

  public Module alphaIsc(Float alphaIsc) {
    this.alphaIsc = alphaIsc;
    return this;
  }

  /**
   * Temperature Coefficient of Short Circuit Current, percent per degrees Celsius (α Isc)
   * @return alphaIsc
  **/
  @ApiModelProperty(value = "Temperature Coefficient of Short Circuit Current, percent per degrees Celsius (α Isc)")


  public Float getAlphaIsc() {
    return alphaIsc;
  }

  public void setAlphaIsc(Float alphaIsc) {
    this.alphaIsc = alphaIsc;
  }

  public Module alphaIpmax(Float alphaIpmax) {
    this.alphaIpmax = alphaIpmax;
    return this;
  }

  /**
   * Temperature Coefficient of Current at Maximum Power, percent per degrees Celsius (α Ip max)
   * @return alphaIpmax
  **/
  @ApiModelProperty(value = "Temperature Coefficient of Current at Maximum Power, percent per degrees Celsius (α Ip max)")


  public Float getAlphaIpmax() {
    return alphaIpmax;
  }

  public void setAlphaIpmax(Float alphaIpmax) {
    this.alphaIpmax = alphaIpmax;
  }

  public Module gammaPmax(Float gammaPmax) {
    this.gammaPmax = gammaPmax;
    return this;
  }

  /**
   * Temperature Coefficient of Maximum Power, percent per degrees Celsius (γ Pmax)
   * @return gammaPmax
  **/
  @ApiModelProperty(value = "Temperature Coefficient of Maximum Power, percent per degrees Celsius (γ Pmax)")


  public Float getGammaPmax() {
    return gammaPmax;
  }

  public void setGammaPmax(Float gammaPmax) {
    this.gammaPmax = gammaPmax;
  }

  public Module vpmaxlow(Float vpmaxlow) {
    this.vpmaxlow = vpmaxlow;
    return this;
  }

  /**
   * Voltage at Maximum Power and Low Irradiance (V Pmax, low)
   * @return vpmaxlow
  **/
  @ApiModelProperty(value = "Voltage at Maximum Power and Low Irradiance (V Pmax, low)")


  public Float getVpmaxlow() {
    return vpmaxlow;
  }

  public void setVpmaxlow(Float vpmaxlow) {
    this.vpmaxlow = vpmaxlow;
  }

  public Module ipmaxlow(Float ipmaxlow) {
    this.ipmaxlow = ipmaxlow;
    return this;
  }

  /**
   * Current at Maximum Power and Low Irradiance (I Pmax, low)
   * @return ipmaxlow
  **/
  @ApiModelProperty(value = "Current at Maximum Power and Low Irradiance (I Pmax, low)")


  public Float getIpmaxlow() {
    return ipmaxlow;
  }

  public void setIpmaxlow(Float ipmaxlow) {
    this.ipmaxlow = ipmaxlow;
  }

  public Module vpmaxNOCT(Float vpmaxNOCT) {
    this.vpmaxNOCT = vpmaxNOCT;
    return this;
  }

  /**
   * Voltage at Maximum Power and NOCT. (V Pmax, NOCT)
   * @return vpmaxNOCT
  **/
  @ApiModelProperty(value = "Voltage at Maximum Power and NOCT. (V Pmax, NOCT)")


  public Float getVpmaxNOCT() {
    return vpmaxNOCT;
  }

  public void setVpmaxNOCT(Float vpmaxNOCT) {
    this.vpmaxNOCT = vpmaxNOCT;
  }

  public Module ipmaxNOCT(Float ipmaxNOCT) {
    this.ipmaxNOCT = ipmaxNOCT;
    return this;
  }

  /**
   * Current at Maximum Power and NOCT (I Pmax, NOCT)
   * @return ipmaxNOCT
  **/
  @ApiModelProperty(value = "Current at Maximum Power and NOCT (I Pmax, NOCT)")


  public Float getIpmaxNOCT() {
    return ipmaxNOCT;
  }

  public void setIpmaxNOCT(Float ipmaxNOCT) {
    this.ipmaxNOCT = ipmaxNOCT;
  }

  public Module sizeShortSide(Float sizeShortSide) {
    this.sizeShortSide = sizeShortSide;
    return this;
  }

  /**
   * Size on short side, in Meters
   * @return sizeShortSide
  **/
  @ApiModelProperty(value = "Size on short side, in Meters")


  public Float getSizeShortSide() {
    return sizeShortSide;
  }

  public void setSizeShortSide(Float sizeShortSide) {
    this.sizeShortSide = sizeShortSide;
  }

  public Module sizeLongSide(Float sizeLongSide) {
    this.sizeLongSide = sizeLongSide;
    return this;
  }

  /**
   * Size on long side, in Meters
   * @return sizeLongSide
  **/
  @ApiModelProperty(value = "Size on long side, in Meters")


  public Float getSizeLongSide() {
    return sizeLongSide;
  }

  public void setSizeLongSide(Float sizeLongSide) {
    this.sizeLongSide = sizeLongSide;
  }

  public Module geometricMultiplier(Float geometricMultiplier) {
    this.geometricMultiplier = geometricMultiplier;
    return this;
  }

  /**
   * Geometric Multiplier
   * @return geometricMultiplier
  **/
  @ApiModelProperty(value = "Geometric Multiplier")


  public Float getGeometricMultiplier() {
    return geometricMultiplier;
  }

  public void setGeometricMultiplier(Float geometricMultiplier) {
    this.geometricMultiplier = geometricMultiplier;
  }

  public Module apertureArea(Float apertureArea) {
    this.apertureArea = apertureArea;
    return this;
  }

  /**
   * Aperture Area (A_c)
   * @return apertureArea
  **/
  @ApiModelProperty(value = "Aperture Area (A_c)")


  public Float getApertureArea() {
    return apertureArea;
  }

  public void setApertureArea(Float apertureArea) {
    this.apertureArea = apertureArea;
  }

  public Module numberCellsSeries(Float numberCellsSeries) {
    this.numberCellsSeries = numberCellsSeries;
    return this;
  }

  /**
   * Number cells in series
   * @return numberCellsSeries
  **/
  @ApiModelProperty(value = "Number cells in series")


  public Float getNumberCellsSeries() {
    return numberCellsSeries;
  }

  public void setNumberCellsSeries(Float numberCellsSeries) {
    this.numberCellsSeries = numberCellsSeries;
  }

  public Module numberCellsParallel(Float numberCellsParallel) {
    this.numberCellsParallel = numberCellsParallel;
    return this;
  }

  /**
   * Number of cells in parallel
   * @return numberCellsParallel
  **/
  @ApiModelProperty(value = "Number of cells in parallel")


  public Float getNumberCellsParallel() {
    return numberCellsParallel;
  }

  public void setNumberCellsParallel(Float numberCellsParallel) {
    this.numberCellsParallel = numberCellsParallel;
  }

  public Module type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Module type
   * @return type
  **/
  @ApiModelProperty(value = "Module type")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Module technology(String technology) {
    this.technology = technology;
    return this;
  }

  /**
   * The sort of panel
   * @return technology
  **/
  @ApiModelProperty(value = "The sort of panel")


  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }

  public Module mounting(String mounting) {
    this.mounting = mounting;
    return this;
  }

  /**
   * How the module is mounted
   * @return mounting
  **/
  @ApiModelProperty(value = "How the module is mounted")


  public String getMounting() {
    return mounting;
  }

  public void setMounting(String mounting) {
    this.mounting = mounting;
  }

  public Module lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Last update
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "Last update")


  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Module cecListingDate(String cecListingDate) {
    this.cecListingDate = cecListingDate;
    return this;
  }

  /**
   * Listing date with California Energy Commission
   * @return cecListingDate
  **/
  @ApiModelProperty(value = "Listing date with California Energy Commission")


  public String getCecListingDate() {
    return cecListingDate;
  }

  public void setCecListingDate(String cecListingDate) {
    this.cecListingDate = cecListingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Module module = (Module) o;
    return Objects.equals(this.manufacturer, module.manufacturer) &&
        Objects.equals(this.model, module.model) &&
        Objects.equals(this.description, module.description) &&
        Objects.equals(this.BIPV, module.BIPV) &&
        Objects.equals(this.nameplatePmax, module.nameplatePmax) &&
        Objects.equals(this.PTC, module.PTC) &&
        Objects.equals(this.notes, module.notes) &&
        Objects.equals(this.nameplateVpmax, module.nameplateVpmax) &&
        Objects.equals(this.nameplateIpmax, module.nameplateIpmax) &&
        Objects.equals(this.nameplateVoc, module.nameplateVoc) &&
        Objects.equals(this.nameplateIsc, module.nameplateIsc) &&
        Objects.equals(this.averageNOCT, module.averageNOCT) &&
        Objects.equals(this.betaVoc, module.betaVoc) &&
        Objects.equals(this.betaVpmax, module.betaVpmax) &&
        Objects.equals(this.alphaIsc, module.alphaIsc) &&
        Objects.equals(this.alphaIpmax, module.alphaIpmax) &&
        Objects.equals(this.gammaPmax, module.gammaPmax) &&
        Objects.equals(this.vpmaxlow, module.vpmaxlow) &&
        Objects.equals(this.ipmaxlow, module.ipmaxlow) &&
        Objects.equals(this.vpmaxNOCT, module.vpmaxNOCT) &&
        Objects.equals(this.ipmaxNOCT, module.ipmaxNOCT) &&
        Objects.equals(this.sizeShortSide, module.sizeShortSide) &&
        Objects.equals(this.sizeLongSide, module.sizeLongSide) &&
        Objects.equals(this.geometricMultiplier, module.geometricMultiplier) &&
        Objects.equals(this.apertureArea, module.apertureArea) &&
        Objects.equals(this.numberCellsSeries, module.numberCellsSeries) &&
        Objects.equals(this.numberCellsParallel, module.numberCellsParallel) &&
        Objects.equals(this.type, module.type) &&
        Objects.equals(this.technology, module.technology) &&
        Objects.equals(this.mounting, module.mounting) &&
        Objects.equals(this.lastUpdate, module.lastUpdate) &&
        Objects.equals(this.cecListingDate, module.cecListingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturer, model, description, BIPV, nameplatePmax, PTC, notes, nameplateVpmax, nameplateIpmax, nameplateVoc, nameplateIsc, averageNOCT, betaVoc, betaVpmax, alphaIsc, alphaIpmax, gammaPmax, vpmaxlow, ipmaxlow, vpmaxNOCT, ipmaxNOCT, sizeShortSide, sizeLongSide, geometricMultiplier, apertureArea, numberCellsSeries, numberCellsParallel, type, technology, mounting, lastUpdate, cecListingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Module {\n");
    
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    BIPV: ").append(toIndentedString(BIPV)).append("\n");
    sb.append("    nameplatePmax: ").append(toIndentedString(nameplatePmax)).append("\n");
    sb.append("    PTC: ").append(toIndentedString(PTC)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    nameplateVpmax: ").append(toIndentedString(nameplateVpmax)).append("\n");
    sb.append("    nameplateIpmax: ").append(toIndentedString(nameplateIpmax)).append("\n");
    sb.append("    nameplateVoc: ").append(toIndentedString(nameplateVoc)).append("\n");
    sb.append("    nameplateIsc: ").append(toIndentedString(nameplateIsc)).append("\n");
    sb.append("    averageNOCT: ").append(toIndentedString(averageNOCT)).append("\n");
    sb.append("    betaVoc: ").append(toIndentedString(betaVoc)).append("\n");
    sb.append("    betaVpmax: ").append(toIndentedString(betaVpmax)).append("\n");
    sb.append("    alphaIsc: ").append(toIndentedString(alphaIsc)).append("\n");
    sb.append("    alphaIpmax: ").append(toIndentedString(alphaIpmax)).append("\n");
    sb.append("    gammaPmax: ").append(toIndentedString(gammaPmax)).append("\n");
    sb.append("    vpmaxlow: ").append(toIndentedString(vpmaxlow)).append("\n");
    sb.append("    ipmaxlow: ").append(toIndentedString(ipmaxlow)).append("\n");
    sb.append("    vpmaxNOCT: ").append(toIndentedString(vpmaxNOCT)).append("\n");
    sb.append("    ipmaxNOCT: ").append(toIndentedString(ipmaxNOCT)).append("\n");
    sb.append("    sizeShortSide: ").append(toIndentedString(sizeShortSide)).append("\n");
    sb.append("    sizeLongSide: ").append(toIndentedString(sizeLongSide)).append("\n");
    sb.append("    geometricMultiplier: ").append(toIndentedString(geometricMultiplier)).append("\n");
    sb.append("    apertureArea: ").append(toIndentedString(apertureArea)).append("\n");
    sb.append("    numberCellsSeries: ").append(toIndentedString(numberCellsSeries)).append("\n");
    sb.append("    numberCellsParallel: ").append(toIndentedString(numberCellsParallel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    mounting: ").append(toIndentedString(mounting)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    cecListingDate: ").append(toIndentedString(cecListingDate)).append("\n");
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

