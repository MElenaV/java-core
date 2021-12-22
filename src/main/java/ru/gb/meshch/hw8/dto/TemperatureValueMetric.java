package ru.gb.meshch.hw8.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperatureValueMetric {

  public String getUnit() {
    return unit;
  }

  public float getUnitType() {
    return unitType;
  }

  public float getValue() {
    return value;
  }

  @JsonProperty(value = "Unit")
  private String unit;

  @JsonProperty(value = "UnitType")
  private float unitType;

  @JsonProperty(value = "Value")
  private float value;

}
