package ru.gb.meshch.lesson7.project;

public class WeatherData {
  private String city;
  private String date;
  private String weatherText;
  private Double temperature;

  public WeatherData() {
  }

  public WeatherData(String city, String date, String weatherText, Double temperature) {
    this.city = city;
    this.date = date;
    this.weatherText = weatherText;
    this.temperature = temperature;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getWeatherText() {
    return weatherText;
  }

  public void setWeatherText(String weatherText) {
    this.weatherText = weatherText;
  }

  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }


}
