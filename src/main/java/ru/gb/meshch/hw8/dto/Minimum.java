package ru.gb.meshch.hw8.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Minimum extends TemperatureValueMetric {
    @Override
    public String toString() {
        return "Minimum{" +
                "Unit='" + getUnit() + '\'' +
                ", UnitType=" + getUnitType() +
                ", Value=" + getValue() +
                '}';
    }

}
