package ru.gb.meshch.hw8.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Metric extends TemperatureValueMetric {
    @Override
    public String toString() {
        return "Metric{" +
                "Unit='" + getUnit() + '\'' +
                ", UnitType=" + getUnitType() +
                ", Value=" + getValue() +
                '}';
    }

}
