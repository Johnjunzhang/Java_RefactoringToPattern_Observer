package com.refactoringToPattern.observer;

public class weatherData {
    private seedingMachine seedingMachine;
    private reapingMachine reapingMachine;
    private wateringMachine wateringMachine;

    public weatherData(seedingMachine seedingMachine, reapingMachine reapingMachine, wateringMachine wateringMachine)
    {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
    }

    public void MeasurementsChanged(int temp, int humidity, int windPower)
    {
        new seedingMachineObserver(seedingMachine).start(temp);
        new reapingMachineObserver(reapingMachine).start(temp, humidity);
        new wateringMachineObserver(wateringMachine).start(temp, humidity, windPower);
    }
}
