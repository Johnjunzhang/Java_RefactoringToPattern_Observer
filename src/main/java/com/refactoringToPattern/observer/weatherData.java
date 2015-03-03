package com.refactoringToPattern.observer;

import java.util.Arrays;
import java.util.List;

public class weatherData {
    private seedingMachine seedingMachine;
    private reapingMachine reapingMachine;
    private wateringMachine wateringMachine;
    private List<IMachineObserver> observers;

    public weatherData(seedingMachine seedingMachine, reapingMachine reapingMachine, wateringMachine wateringMachine)
    {
        this.seedingMachine = seedingMachine;
        this.reapingMachine = reapingMachine;
        this.wateringMachine = wateringMachine;
        observers = initMachineObservers();
    }

    public void MeasurementsChanged(int temp, int humidity, int windPower)
    {
        observers.forEach(observer -> observer.start(temp, humidity, windPower));
    }

    private List<IMachineObserver> initMachineObservers() {
        seedingMachineObserver seedingMachineObserver = new seedingMachineObserver(seedingMachine);
        reapingMachineObserver reapingMachineObserver = new reapingMachineObserver(reapingMachine);
        wateringMachineObserver wateringMachineObserver = new wateringMachineObserver(wateringMachine);
        return Arrays.asList(seedingMachineObserver, reapingMachineObserver, wateringMachineObserver);
    }
}
