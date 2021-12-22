package ru.gb.meshch.lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.gb.meshch.lesson7.project.respTemp.Temperature;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
  @JsonProperty("Date")
  private String date;
  @JsonProperty("LocalObservationDateTime")
  private String localObservationDateTime;
  @JsonProperty("EpochTime")
  private Integer epochTime;
  @JsonProperty("WeatherText")
  private String weatherText;
  @JsonProperty("Temperature")
  private Temperature temperature;
  @JsonProperty("Link")
  private String link;
  @JsonIgnore
  private String city;

  @JsonProperty("LocalObservationDateTime")
  public String getLocalObservationDateTime() {
    return localObservationDateTime;
  }

  @JsonProperty("LocalObservationDateTime")
  public void setLocalObservationDateTime(String localObservationDateTime) {
    this.localObservationDateTime = localObservationDateTime;
  }

  @JsonProperty("Date")
  public String getDate() {
    return date;
  }

  @JsonProperty("Date")
  public void setDate(String date) {
    this.date = date;
  }

  @JsonProperty("EpochTime")
  public Integer getEpochTime() {
    return epochTime;
  }

  @JsonProperty("EpochTime")
  public void setEpochTime(Integer epochTime) {
    this.epochTime = epochTime;
  }

  @JsonProperty("WeatherText")
  public String getWeatherText() {
    return weatherText;
  }

  @JsonProperty("WeatherText")
  public void setWeatherText(String weatherText) {
    this.weatherText = weatherText;
  }

  @JsonProperty("Temperature")
  public Temperature getTemperature() {
    return temperature;
  }

  @JsonProperty("Temperature")
  public void setTemperature(Temperature temperature) {
    this.temperature = temperature;
  }

  @JsonProperty("Link")
  public String getLink() {
    return link;
  }

  @JsonProperty("Link")
  public void setLink(String link) {
    this.link = link;
  }

  @JsonIgnore
  public String getCity() {
    return city;
  }

  @JsonIgnore
  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    String mode = ApplicationGlobalState.getInstance().getSelectedMode();
    if (mode.equals("1"))  {
      return "В городе " + ApplicationGlobalState.getInstance().getSelectedCity() + " на дату " + localObservationDateTime + " ожидается " + weatherText + ", температура " + temperature.getMetric().getValue() + temperature.getMetric().getUnit()+"\n";
    } else {
      return "В городе " + ApplicationGlobalState.getInstance().getSelectedCity() + " на дату " + date + " температура от " + temperature.getMinimum().getValue() + temperature.getMinimum().getUnit() + " до "+ temperature.getMaximum().getValue() + temperature.getMaximum().getUnit()+"\n";
    }
}


}
