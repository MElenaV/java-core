package ru.gb.meshch.hw8.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Maximum extends TemperatureValueMetric {
    @Override
    public String toString() {
        return "Maximum{" +
                "Unit='" + getUnit() + '\'' +
                ", UnitType=" + getUnitType() +
                ", Value=" + getValue() +
                '}';
    }

}
