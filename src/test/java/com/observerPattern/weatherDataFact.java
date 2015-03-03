package com.observerPattern;

import com.refactoringToPattern.observer.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class weatherDataFact {
    private seedingMachine seedingMachine = new seedingMachine();
    private reapingMachine reapingMachine = new reapingMachine();
    private wateringMachine wateringMachine = new wateringMachine();

    @Test
    public void seeding_machine_should_start_if_temperature_over_5_degree() {
        getWeatherData().MeasurementsChanged(10, 0, 0);
        assertTrue(seedingMachine.getStatus());
    }

    @Test
    public void reaping_machine_should_start_if_temperature_over_5_degree_and_humidity_over_65() {
        getWeatherData().MeasurementsChanged(10, 70, 0);
        assertTrue(reapingMachine.getStatus());
    }

    @Test
    public void water_machine_should_start_if_temperature_over_10_degree_and_humidity_less_than_55_and_wind_power_less_than_4() {
        getWeatherData().MeasurementsChanged(12, 50, 2);
        assertTrue(wateringMachine.getStatus());
    }

    private weatherData getWeatherData() {
        return new weatherData(seedingMachine, reapingMachine, wateringMachine);
    }
}
