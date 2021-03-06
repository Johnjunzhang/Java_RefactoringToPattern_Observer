package com.refactoringToPattern.observer;

public class weatherData {
    private seedingMachine seedingMachine;
    private reapingMachine reapingMachine;
    private wateringMachine wateringMachine;

    public weatherData(seedingMachine seedingMachine, reapingMachine reapingMachine, wateringMachine wateringMachine) {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
    }

    public void MeasurementsChanged(int temp, int humidity, int windPower) {
        if (temp > 5) {
            seedingMachine.Start();

            if (humidity > 65)
                reapingMachine.Start();
        }

        if (temp > 10 && humidity < 55 && windPower < 4)
            wateringMachine.Start();
    }
}
