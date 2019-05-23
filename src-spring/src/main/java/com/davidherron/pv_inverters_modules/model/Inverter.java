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
 * Inverter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-23T10:48:04.857Z")

public class Inverter   {
  @JsonProperty("manufacturer")
  private String manufacturer = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("powerRating")
  private Float powerRating = null;

  @JsonProperty("voltageNominalAC")
  private Float voltageNominalAC = null;

  @JsonProperty("efficiency")
  private Float efficiency = null;

  @JsonProperty("UL1741SA")
  private String ul1741SA = null;

  @JsonProperty("firmwareVersionTested")
  private String firmwareVersionTested = null;

  @JsonProperty("builtInMeter")
  private String builtInMeter = null;

  @JsonProperty("microInverter")
  private String microInverter = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("nightTareLoss")
  private String nightTareLoss = null;

  @JsonProperty("powerRatingContinuous")
  private Float powerRatingContinuous = null;

  @JsonProperty("nightTareLoss40C")
  private String nightTareLoss40C = null;

  @JsonProperty("voltageMinDC")
  private Float voltageMinDC = null;

  @JsonProperty("voltageNominalDC")
  private Float voltageNominalDC = null;

  @JsonProperty("voltageMaxDC")
  private Float voltageMaxDC = null;

  @JsonProperty("powerLevel10")
  private Float powerLevel10 = null;

  @JsonProperty("powerLevel20")
  private Float powerLevel20 = null;

  @JsonProperty("powerLevel30")
  private Float powerLevel30 = null;

  @JsonProperty("powerLevel50")
  private Float powerLevel50 = null;

  @JsonProperty("powerLevel75")
  private Float powerLevel75 = null;

  @JsonProperty("powerLevel100")
  private Float powerLevel100 = null;

  @JsonProperty("efficiencyVmin10")
  private Float efficiencyVmin10 = null;

  @JsonProperty("efficiencyVmin20")
  private Float efficiencyVmin20 = null;

  @JsonProperty("efficiencyVmin30")
  private Float efficiencyVmin30 = null;

  @JsonProperty("efficiencyVmin50")
  private Float efficiencyVmin50 = null;

  @JsonProperty("efficiencyVmin75")
  private Float efficiencyVmin75 = null;

  @JsonProperty("efficiencyVmin100")
  private Float efficiencyVmin100 = null;

  @JsonProperty("efficiencyVnom10")
  private Float efficiencyVnom10 = null;

  @JsonProperty("efficiencyVnom20")
  private Float efficiencyVnom20 = null;

  @JsonProperty("efficiencyVnom30")
  private Float efficiencyVnom30 = null;

  @JsonProperty("efficiencyVnom50")
  private Float efficiencyVnom50 = null;

  @JsonProperty("efficiencyVnom75")
  private Float efficiencyVnom75 = null;

  @JsonProperty("efficiencyVnom100")
  private Float efficiencyVnom100 = null;

  @JsonProperty("efficiencyVmax10")
  private Float efficiencyVmax10 = null;

  @JsonProperty("efficiencyVmax20")
  private Float efficiencyVmax20 = null;

  @JsonProperty("efficiencyVmax30")
  private Float efficiencyVmax30 = null;

  @JsonProperty("efficiencyVmax50")
  private Float efficiencyVmax50 = null;

  @JsonProperty("efficiencyVmax75")
  private Float efficiencyVmax75 = null;

  @JsonProperty("efficiencyVmax100")
  private Float efficiencyVmax100 = null;

  @JsonProperty("sortOrder")
  private String sortOrder = null;

  @JsonProperty("cecListingDate")
  private String cecListingDate = null;

  @JsonProperty("lastUpdate")
  private String lastUpdate = null;

  public Inverter manufacturer(String manufacturer) {
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

  public Inverter model(String model) {
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

  public Inverter description(String description) {
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

  public Inverter powerRating(Float powerRating) {
    this.powerRating = powerRating;
    return this;
  }

  /**
   * Power Rating, Continuous at Unity Power Factor (kW)
   * @return powerRating
  **/
  @ApiModelProperty(value = "Power Rating, Continuous at Unity Power Factor (kW)")


  public Float getPowerRating() {
    return powerRating;
  }

  public void setPowerRating(Float powerRating) {
    this.powerRating = powerRating;
  }

  public Inverter voltageNominalAC(Float voltageNominalAC) {
    this.voltageNominalAC = voltageNominalAC;
    return this;
  }

  /**
   * Nominal Voltage (Vac)
   * @return voltageNominalAC
  **/
  @ApiModelProperty(value = "Nominal Voltage (Vac)")


  public Float getVoltageNominalAC() {
    return voltageNominalAC;
  }

  public void setVoltageNominalAC(Float voltageNominalAC) {
    this.voltageNominalAC = voltageNominalAC;
  }

  public Inverter efficiency(Float efficiency) {
    this.efficiency = efficiency;
    return this;
  }

  /**
   * Weighted Efficiency (%)
   * @return efficiency
  **/
  @ApiModelProperty(value = "Weighted Efficiency (%)")


  public Float getEfficiency() {
    return efficiency;
  }

  public void setEfficiency(Float efficiency) {
    this.efficiency = efficiency;
  }

  public Inverter ul1741SA(String ul1741SA) {
    this.ul1741SA = ul1741SA;
    return this;
  }

  /**
   * UL 1741 Supplement A Certification*** (Certification Date)
   * @return ul1741SA
  **/
  @ApiModelProperty(value = "UL 1741 Supplement A Certification*** (Certification Date)")


  public String getUl1741SA() {
    return ul1741SA;
  }

  public void setUl1741SA(String ul1741SA) {
    this.ul1741SA = ul1741SA;
  }

  public Inverter firmwareVersionTested(String firmwareVersionTested) {
    this.firmwareVersionTested = firmwareVersionTested;
    return this;
  }

  /**
   * Firmware Version Tested
   * @return firmwareVersionTested
  **/
  @ApiModelProperty(value = "Firmware Version Tested")


  public String getFirmwareVersionTested() {
    return firmwareVersionTested;
  }

  public void setFirmwareVersionTested(String firmwareVersionTested) {
    this.firmwareVersionTested = firmwareVersionTested;
  }

  public Inverter builtInMeter(String builtInMeter) {
    this.builtInMeter = builtInMeter;
    return this;
  }

  /**
   * Built-In Meter
   * @return builtInMeter
  **/
  @ApiModelProperty(value = "Built-In Meter")


  public String getBuiltInMeter() {
    return builtInMeter;
  }

  public void setBuiltInMeter(String builtInMeter) {
    this.builtInMeter = builtInMeter;
  }

  public Inverter microInverter(String microInverter) {
    this.microInverter = microInverter;
    return this;
  }

  /**
   * Microinverter
   * @return microInverter
  **/
  @ApiModelProperty(value = "Microinverter")


  public String getMicroInverter() {
    return microInverter;
  }

  public void setMicroInverter(String microInverter) {
    this.microInverter = microInverter;
  }

  public Inverter notes(String notes) {
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

  public Inverter nightTareLoss(String nightTareLoss) {
    this.nightTareLoss = nightTareLoss;
    return this;
  }

  /**
   * Night Tare Loss (W)
   * @return nightTareLoss
  **/
  @ApiModelProperty(value = "Night Tare Loss (W)")


  public String getNightTareLoss() {
    return nightTareLoss;
  }

  public void setNightTareLoss(String nightTareLoss) {
    this.nightTareLoss = nightTareLoss;
  }

  public Inverter powerRatingContinuous(Float powerRatingContinuous) {
    this.powerRatingContinuous = powerRatingContinuous;
    return this;
  }

  /**
   * Power Rating, Continuous, 40 deg C (kW)
   * @return powerRatingContinuous
  **/
  @ApiModelProperty(value = "Power Rating, Continuous, 40 deg C (kW)")


  public Float getPowerRatingContinuous() {
    return powerRatingContinuous;
  }

  public void setPowerRatingContinuous(Float powerRatingContinuous) {
    this.powerRatingContinuous = powerRatingContinuous;
  }

  public Inverter nightTareLoss40C(String nightTareLoss40C) {
    this.nightTareLoss40C = nightTareLoss40C;
    return this;
  }

  /**
   * Night Tare Loss 40 deg C (W)
   * @return nightTareLoss40C
  **/
  @ApiModelProperty(value = "Night Tare Loss 40 deg C (W)")


  public String getNightTareLoss40C() {
    return nightTareLoss40C;
  }

  public void setNightTareLoss40C(String nightTareLoss40C) {
    this.nightTareLoss40C = nightTareLoss40C;
  }

  public Inverter voltageMinDC(Float voltageMinDC) {
    this.voltageMinDC = voltageMinDC;
    return this;
  }

  /**
   * Voltage Minimum (Vdc)
   * @return voltageMinDC
  **/
  @ApiModelProperty(value = "Voltage Minimum (Vdc)")


  public Float getVoltageMinDC() {
    return voltageMinDC;
  }

  public void setVoltageMinDC(Float voltageMinDC) {
    this.voltageMinDC = voltageMinDC;
  }

  public Inverter voltageNominalDC(Float voltageNominalDC) {
    this.voltageNominalDC = voltageNominalDC;
    return this;
  }

  /**
   * Voltage Nominal (Vdc)
   * @return voltageNominalDC
  **/
  @ApiModelProperty(value = "Voltage Nominal (Vdc)")


  public Float getVoltageNominalDC() {
    return voltageNominalDC;
  }

  public void setVoltageNominalDC(Float voltageNominalDC) {
    this.voltageNominalDC = voltageNominalDC;
  }

  public Inverter voltageMaxDC(Float voltageMaxDC) {
    this.voltageMaxDC = voltageMaxDC;
    return this;
  }

  /**
   * Voltage Maximum (Vdc)
   * @return voltageMaxDC
  **/
  @ApiModelProperty(value = "Voltage Maximum (Vdc)")


  public Float getVoltageMaxDC() {
    return voltageMaxDC;
  }

  public void setVoltageMaxDC(Float voltageMaxDC) {
    this.voltageMaxDC = voltageMaxDC;
  }

  public Inverter powerLevel10(Float powerLevel10) {
    this.powerLevel10 = powerLevel10;
    return this;
  }

  /**
   * Power Level 10% (kW)
   * @return powerLevel10
  **/
  @ApiModelProperty(value = "Power Level 10% (kW)")


  public Float getPowerLevel10() {
    return powerLevel10;
  }

  public void setPowerLevel10(Float powerLevel10) {
    this.powerLevel10 = powerLevel10;
  }

  public Inverter powerLevel20(Float powerLevel20) {
    this.powerLevel20 = powerLevel20;
    return this;
  }

  /**
   * Power Level 20% (kW)
   * @return powerLevel20
  **/
  @ApiModelProperty(value = "Power Level 20% (kW)")


  public Float getPowerLevel20() {
    return powerLevel20;
  }

  public void setPowerLevel20(Float powerLevel20) {
    this.powerLevel20 = powerLevel20;
  }

  public Inverter powerLevel30(Float powerLevel30) {
    this.powerLevel30 = powerLevel30;
    return this;
  }

  /**
   * Power Level 30% (kW)
   * @return powerLevel30
  **/
  @ApiModelProperty(value = "Power Level 30% (kW)")


  public Float getPowerLevel30() {
    return powerLevel30;
  }

  public void setPowerLevel30(Float powerLevel30) {
    this.powerLevel30 = powerLevel30;
  }

  public Inverter powerLevel50(Float powerLevel50) {
    this.powerLevel50 = powerLevel50;
    return this;
  }

  /**
   * Power Level 50% (kW)
   * @return powerLevel50
  **/
  @ApiModelProperty(value = "Power Level 50% (kW)")


  public Float getPowerLevel50() {
    return powerLevel50;
  }

  public void setPowerLevel50(Float powerLevel50) {
    this.powerLevel50 = powerLevel50;
  }

  public Inverter powerLevel75(Float powerLevel75) {
    this.powerLevel75 = powerLevel75;
    return this;
  }

  /**
   * Power Level 75% (kW)
   * @return powerLevel75
  **/
  @ApiModelProperty(value = "Power Level 75% (kW)")


  public Float getPowerLevel75() {
    return powerLevel75;
  }

  public void setPowerLevel75(Float powerLevel75) {
    this.powerLevel75 = powerLevel75;
  }

  public Inverter powerLevel100(Float powerLevel100) {
    this.powerLevel100 = powerLevel100;
    return this;
  }

  /**
   * Power Level 100% (kW)
   * @return powerLevel100
  **/
  @ApiModelProperty(value = "Power Level 100% (kW)")


  public Float getPowerLevel100() {
    return powerLevel100;
  }

  public void setPowerLevel100(Float powerLevel100) {
    this.powerLevel100 = powerLevel100;
  }

  public Inverter efficiencyVmin10(Float efficiencyVmin10) {
    this.efficiencyVmin10 = efficiencyVmin10;
    return this;
  }

  /**
   * Efficiency @Vmin, 10% (%)
   * @return efficiencyVmin10
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 10% (%)")


  public Float getEfficiencyVmin10() {
    return efficiencyVmin10;
  }

  public void setEfficiencyVmin10(Float efficiencyVmin10) {
    this.efficiencyVmin10 = efficiencyVmin10;
  }

  public Inverter efficiencyVmin20(Float efficiencyVmin20) {
    this.efficiencyVmin20 = efficiencyVmin20;
    return this;
  }

  /**
   * Efficiency @Vmin, 20% (%)
   * @return efficiencyVmin20
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 20% (%)")


  public Float getEfficiencyVmin20() {
    return efficiencyVmin20;
  }

  public void setEfficiencyVmin20(Float efficiencyVmin20) {
    this.efficiencyVmin20 = efficiencyVmin20;
  }

  public Inverter efficiencyVmin30(Float efficiencyVmin30) {
    this.efficiencyVmin30 = efficiencyVmin30;
    return this;
  }

  /**
   * Efficiency @Vmin, 30% (%)
   * @return efficiencyVmin30
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 30% (%)")


  public Float getEfficiencyVmin30() {
    return efficiencyVmin30;
  }

  public void setEfficiencyVmin30(Float efficiencyVmin30) {
    this.efficiencyVmin30 = efficiencyVmin30;
  }

  public Inverter efficiencyVmin50(Float efficiencyVmin50) {
    this.efficiencyVmin50 = efficiencyVmin50;
    return this;
  }

  /**
   * Efficiency @Vmin, 50% (%)
   * @return efficiencyVmin50
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 50% (%)")


  public Float getEfficiencyVmin50() {
    return efficiencyVmin50;
  }

  public void setEfficiencyVmin50(Float efficiencyVmin50) {
    this.efficiencyVmin50 = efficiencyVmin50;
  }

  public Inverter efficiencyVmin75(Float efficiencyVmin75) {
    this.efficiencyVmin75 = efficiencyVmin75;
    return this;
  }

  /**
   * Efficiency @Vmin, 75% (%)
   * @return efficiencyVmin75
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 75% (%)")


  public Float getEfficiencyVmin75() {
    return efficiencyVmin75;
  }

  public void setEfficiencyVmin75(Float efficiencyVmin75) {
    this.efficiencyVmin75 = efficiencyVmin75;
  }

  public Inverter efficiencyVmin100(Float efficiencyVmin100) {
    this.efficiencyVmin100 = efficiencyVmin100;
    return this;
  }

  /**
   * Efficiency @Vmin, 100% (%)
   * @return efficiencyVmin100
  **/
  @ApiModelProperty(value = "Efficiency @Vmin, 100% (%)")


  public Float getEfficiencyVmin100() {
    return efficiencyVmin100;
  }

  public void setEfficiencyVmin100(Float efficiencyVmin100) {
    this.efficiencyVmin100 = efficiencyVmin100;
  }

  public Inverter efficiencyVnom10(Float efficiencyVnom10) {
    this.efficiencyVnom10 = efficiencyVnom10;
    return this;
  }

  /**
   * Efficiency @Vnom, 10% (%)
   * @return efficiencyVnom10
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 10% (%)")


  public Float getEfficiencyVnom10() {
    return efficiencyVnom10;
  }

  public void setEfficiencyVnom10(Float efficiencyVnom10) {
    this.efficiencyVnom10 = efficiencyVnom10;
  }

  public Inverter efficiencyVnom20(Float efficiencyVnom20) {
    this.efficiencyVnom20 = efficiencyVnom20;
    return this;
  }

  /**
   * Efficiency @Vnom, 20% (%)
   * @return efficiencyVnom20
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 20% (%)")


  public Float getEfficiencyVnom20() {
    return efficiencyVnom20;
  }

  public void setEfficiencyVnom20(Float efficiencyVnom20) {
    this.efficiencyVnom20 = efficiencyVnom20;
  }

  public Inverter efficiencyVnom30(Float efficiencyVnom30) {
    this.efficiencyVnom30 = efficiencyVnom30;
    return this;
  }

  /**
   * Efficiency @Vnom, 30% (%)
   * @return efficiencyVnom30
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 30% (%)")


  public Float getEfficiencyVnom30() {
    return efficiencyVnom30;
  }

  public void setEfficiencyVnom30(Float efficiencyVnom30) {
    this.efficiencyVnom30 = efficiencyVnom30;
  }

  public Inverter efficiencyVnom50(Float efficiencyVnom50) {
    this.efficiencyVnom50 = efficiencyVnom50;
    return this;
  }

  /**
   * Efficiency @Vnom, 50% (%)
   * @return efficiencyVnom50
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 50% (%)")


  public Float getEfficiencyVnom50() {
    return efficiencyVnom50;
  }

  public void setEfficiencyVnom50(Float efficiencyVnom50) {
    this.efficiencyVnom50 = efficiencyVnom50;
  }

  public Inverter efficiencyVnom75(Float efficiencyVnom75) {
    this.efficiencyVnom75 = efficiencyVnom75;
    return this;
  }

  /**
   * Efficiency @Vnom, 75% (%)
   * @return efficiencyVnom75
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 75% (%)")


  public Float getEfficiencyVnom75() {
    return efficiencyVnom75;
  }

  public void setEfficiencyVnom75(Float efficiencyVnom75) {
    this.efficiencyVnom75 = efficiencyVnom75;
  }

  public Inverter efficiencyVnom100(Float efficiencyVnom100) {
    this.efficiencyVnom100 = efficiencyVnom100;
    return this;
  }

  /**
   * Efficiency @Vnom, 100% (%)
   * @return efficiencyVnom100
  **/
  @ApiModelProperty(value = "Efficiency @Vnom, 100% (%)")


  public Float getEfficiencyVnom100() {
    return efficiencyVnom100;
  }

  public void setEfficiencyVnom100(Float efficiencyVnom100) {
    this.efficiencyVnom100 = efficiencyVnom100;
  }

  public Inverter efficiencyVmax10(Float efficiencyVmax10) {
    this.efficiencyVmax10 = efficiencyVmax10;
    return this;
  }

  /**
   * Efficiency @Vmax, 10% (%)
   * @return efficiencyVmax10
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 10% (%)")


  public Float getEfficiencyVmax10() {
    return efficiencyVmax10;
  }

  public void setEfficiencyVmax10(Float efficiencyVmax10) {
    this.efficiencyVmax10 = efficiencyVmax10;
  }

  public Inverter efficiencyVmax20(Float efficiencyVmax20) {
    this.efficiencyVmax20 = efficiencyVmax20;
    return this;
  }

  /**
   * Efficiency @Vmax, 20% (%)
   * @return efficiencyVmax20
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 20% (%)")


  public Float getEfficiencyVmax20() {
    return efficiencyVmax20;
  }

  public void setEfficiencyVmax20(Float efficiencyVmax20) {
    this.efficiencyVmax20 = efficiencyVmax20;
  }

  public Inverter efficiencyVmax30(Float efficiencyVmax30) {
    this.efficiencyVmax30 = efficiencyVmax30;
    return this;
  }

  /**
   * Efficiency @Vmax, 30% (%)
   * @return efficiencyVmax30
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 30% (%)")


  public Float getEfficiencyVmax30() {
    return efficiencyVmax30;
  }

  public void setEfficiencyVmax30(Float efficiencyVmax30) {
    this.efficiencyVmax30 = efficiencyVmax30;
  }

  public Inverter efficiencyVmax50(Float efficiencyVmax50) {
    this.efficiencyVmax50 = efficiencyVmax50;
    return this;
  }

  /**
   * Efficiency @Vmax, 50% (%)
   * @return efficiencyVmax50
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 50% (%)")


  public Float getEfficiencyVmax50() {
    return efficiencyVmax50;
  }

  public void setEfficiencyVmax50(Float efficiencyVmax50) {
    this.efficiencyVmax50 = efficiencyVmax50;
  }

  public Inverter efficiencyVmax75(Float efficiencyVmax75) {
    this.efficiencyVmax75 = efficiencyVmax75;
    return this;
  }

  /**
   * Efficiency @Vmax, 75% (%)
   * @return efficiencyVmax75
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 75% (%)")


  public Float getEfficiencyVmax75() {
    return efficiencyVmax75;
  }

  public void setEfficiencyVmax75(Float efficiencyVmax75) {
    this.efficiencyVmax75 = efficiencyVmax75;
  }

  public Inverter efficiencyVmax100(Float efficiencyVmax100) {
    this.efficiencyVmax100 = efficiencyVmax100;
    return this;
  }

  /**
   * Efficiency @Vmax, 100% (%)
   * @return efficiencyVmax100
  **/
  @ApiModelProperty(value = "Efficiency @Vmax, 100% (%)")


  public Float getEfficiencyVmax100() {
    return efficiencyVmax100;
  }

  public void setEfficiencyVmax100(Float efficiencyVmax100) {
    this.efficiencyVmax100 = efficiencyVmax100;
  }

  public Inverter sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Sort order
   * @return sortOrder
  **/
  @ApiModelProperty(value = "Sort order")


  public String getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Inverter cecListingDate(String cecListingDate) {
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

  public Inverter lastUpdate(String lastUpdate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inverter inverter = (Inverter) o;
    return Objects.equals(this.manufacturer, inverter.manufacturer) &&
        Objects.equals(this.model, inverter.model) &&
        Objects.equals(this.description, inverter.description) &&
        Objects.equals(this.powerRating, inverter.powerRating) &&
        Objects.equals(this.voltageNominalAC, inverter.voltageNominalAC) &&
        Objects.equals(this.efficiency, inverter.efficiency) &&
        Objects.equals(this.ul1741SA, inverter.ul1741SA) &&
        Objects.equals(this.firmwareVersionTested, inverter.firmwareVersionTested) &&
        Objects.equals(this.builtInMeter, inverter.builtInMeter) &&
        Objects.equals(this.microInverter, inverter.microInverter) &&
        Objects.equals(this.notes, inverter.notes) &&
        Objects.equals(this.nightTareLoss, inverter.nightTareLoss) &&
        Objects.equals(this.powerRatingContinuous, inverter.powerRatingContinuous) &&
        Objects.equals(this.nightTareLoss40C, inverter.nightTareLoss40C) &&
        Objects.equals(this.voltageMinDC, inverter.voltageMinDC) &&
        Objects.equals(this.voltageNominalDC, inverter.voltageNominalDC) &&
        Objects.equals(this.voltageMaxDC, inverter.voltageMaxDC) &&
        Objects.equals(this.powerLevel10, inverter.powerLevel10) &&
        Objects.equals(this.powerLevel20, inverter.powerLevel20) &&
        Objects.equals(this.powerLevel30, inverter.powerLevel30) &&
        Objects.equals(this.powerLevel50, inverter.powerLevel50) &&
        Objects.equals(this.powerLevel75, inverter.powerLevel75) &&
        Objects.equals(this.powerLevel100, inverter.powerLevel100) &&
        Objects.equals(this.efficiencyVmin10, inverter.efficiencyVmin10) &&
        Objects.equals(this.efficiencyVmin20, inverter.efficiencyVmin20) &&
        Objects.equals(this.efficiencyVmin30, inverter.efficiencyVmin30) &&
        Objects.equals(this.efficiencyVmin50, inverter.efficiencyVmin50) &&
        Objects.equals(this.efficiencyVmin75, inverter.efficiencyVmin75) &&
        Objects.equals(this.efficiencyVmin100, inverter.efficiencyVmin100) &&
        Objects.equals(this.efficiencyVnom10, inverter.efficiencyVnom10) &&
        Objects.equals(this.efficiencyVnom20, inverter.efficiencyVnom20) &&
        Objects.equals(this.efficiencyVnom30, inverter.efficiencyVnom30) &&
        Objects.equals(this.efficiencyVnom50, inverter.efficiencyVnom50) &&
        Objects.equals(this.efficiencyVnom75, inverter.efficiencyVnom75) &&
        Objects.equals(this.efficiencyVnom100, inverter.efficiencyVnom100) &&
        Objects.equals(this.efficiencyVmax10, inverter.efficiencyVmax10) &&
        Objects.equals(this.efficiencyVmax20, inverter.efficiencyVmax20) &&
        Objects.equals(this.efficiencyVmax30, inverter.efficiencyVmax30) &&
        Objects.equals(this.efficiencyVmax50, inverter.efficiencyVmax50) &&
        Objects.equals(this.efficiencyVmax75, inverter.efficiencyVmax75) &&
        Objects.equals(this.efficiencyVmax100, inverter.efficiencyVmax100) &&
        Objects.equals(this.sortOrder, inverter.sortOrder) &&
        Objects.equals(this.cecListingDate, inverter.cecListingDate) &&
        Objects.equals(this.lastUpdate, inverter.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manufacturer, model, description, powerRating, voltageNominalAC, efficiency, ul1741SA, firmwareVersionTested, builtInMeter, microInverter, notes, nightTareLoss, powerRatingContinuous, nightTareLoss40C, voltageMinDC, voltageNominalDC, voltageMaxDC, powerLevel10, powerLevel20, powerLevel30, powerLevel50, powerLevel75, powerLevel100, efficiencyVmin10, efficiencyVmin20, efficiencyVmin30, efficiencyVmin50, efficiencyVmin75, efficiencyVmin100, efficiencyVnom10, efficiencyVnom20, efficiencyVnom30, efficiencyVnom50, efficiencyVnom75, efficiencyVnom100, efficiencyVmax10, efficiencyVmax20, efficiencyVmax30, efficiencyVmax50, efficiencyVmax75, efficiencyVmax100, sortOrder, cecListingDate, lastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inverter {\n");
    
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    powerRating: ").append(toIndentedString(powerRating)).append("\n");
    sb.append("    voltageNominalAC: ").append(toIndentedString(voltageNominalAC)).append("\n");
    sb.append("    efficiency: ").append(toIndentedString(efficiency)).append("\n");
    sb.append("    ul1741SA: ").append(toIndentedString(ul1741SA)).append("\n");
    sb.append("    firmwareVersionTested: ").append(toIndentedString(firmwareVersionTested)).append("\n");
    sb.append("    builtInMeter: ").append(toIndentedString(builtInMeter)).append("\n");
    sb.append("    microInverter: ").append(toIndentedString(microInverter)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    nightTareLoss: ").append(toIndentedString(nightTareLoss)).append("\n");
    sb.append("    powerRatingContinuous: ").append(toIndentedString(powerRatingContinuous)).append("\n");
    sb.append("    nightTareLoss40C: ").append(toIndentedString(nightTareLoss40C)).append("\n");
    sb.append("    voltageMinDC: ").append(toIndentedString(voltageMinDC)).append("\n");
    sb.append("    voltageNominalDC: ").append(toIndentedString(voltageNominalDC)).append("\n");
    sb.append("    voltageMaxDC: ").append(toIndentedString(voltageMaxDC)).append("\n");
    sb.append("    powerLevel10: ").append(toIndentedString(powerLevel10)).append("\n");
    sb.append("    powerLevel20: ").append(toIndentedString(powerLevel20)).append("\n");
    sb.append("    powerLevel30: ").append(toIndentedString(powerLevel30)).append("\n");
    sb.append("    powerLevel50: ").append(toIndentedString(powerLevel50)).append("\n");
    sb.append("    powerLevel75: ").append(toIndentedString(powerLevel75)).append("\n");
    sb.append("    powerLevel100: ").append(toIndentedString(powerLevel100)).append("\n");
    sb.append("    efficiencyVmin10: ").append(toIndentedString(efficiencyVmin10)).append("\n");
    sb.append("    efficiencyVmin20: ").append(toIndentedString(efficiencyVmin20)).append("\n");
    sb.append("    efficiencyVmin30: ").append(toIndentedString(efficiencyVmin30)).append("\n");
    sb.append("    efficiencyVmin50: ").append(toIndentedString(efficiencyVmin50)).append("\n");
    sb.append("    efficiencyVmin75: ").append(toIndentedString(efficiencyVmin75)).append("\n");
    sb.append("    efficiencyVmin100: ").append(toIndentedString(efficiencyVmin100)).append("\n");
    sb.append("    efficiencyVnom10: ").append(toIndentedString(efficiencyVnom10)).append("\n");
    sb.append("    efficiencyVnom20: ").append(toIndentedString(efficiencyVnom20)).append("\n");
    sb.append("    efficiencyVnom30: ").append(toIndentedString(efficiencyVnom30)).append("\n");
    sb.append("    efficiencyVnom50: ").append(toIndentedString(efficiencyVnom50)).append("\n");
    sb.append("    efficiencyVnom75: ").append(toIndentedString(efficiencyVnom75)).append("\n");
    sb.append("    efficiencyVnom100: ").append(toIndentedString(efficiencyVnom100)).append("\n");
    sb.append("    efficiencyVmax10: ").append(toIndentedString(efficiencyVmax10)).append("\n");
    sb.append("    efficiencyVmax20: ").append(toIndentedString(efficiencyVmax20)).append("\n");
    sb.append("    efficiencyVmax30: ").append(toIndentedString(efficiencyVmax30)).append("\n");
    sb.append("    efficiencyVmax50: ").append(toIndentedString(efficiencyVmax50)).append("\n");
    sb.append("    efficiencyVmax75: ").append(toIndentedString(efficiencyVmax75)).append("\n");
    sb.append("    efficiencyVmax100: ").append(toIndentedString(efficiencyVmax100)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    cecListingDate: ").append(toIndentedString(cecListingDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

