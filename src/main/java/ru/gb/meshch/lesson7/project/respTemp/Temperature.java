package ru.gb.meshch.lesson7.project.respTemp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Temperature {
  @JsonProperty(value = "Metric")
  private TemperatureValueMetric metric;
  @JsonProperty(value = "Imperial")
  private TemperatureValueMetric imperial;
  @JsonProperty(value = "Minimum")
  private TemperatureValueMetric minimum;
  @JsonProperty(value = "Maximum")
  private TemperatureValueMetric maximum;

  @JsonGetter("Minimum")
  public TemperatureValueMetric getMinimum() {
    return minimum;
  }
  @JsonSetter("Minimum")
  public void setMinimum(TemperatureValueMetric minimum) {
    this.minimum = minimum;
  }
  @JsonGetter("Maximum")
  public TemperatureValueMetric getMaximum() {
    return maximum;
  }
  @JsonSetter("Maximum")
  public void setMaximum(TemperatureValueMetric maximum) {
    this.maximum = maximum;
  }

  @JsonGetter("Metric")
  public TemperatureValueMetric getMetric() {
    return metric;
  }

  @JsonSetter("Metric")
  public void setMetric(TemperatureValueMetric metric) {
    this.metric = metric;
  }

  @JsonGetter("Imperial")
  public TemperatureValueMetric getImperial() {
    return imperial;
  }

  @JsonSetter("Imperial")
  public void setImperial(TemperatureValueMetric imperial) {
    this.imperial = imperial;
  }
}
