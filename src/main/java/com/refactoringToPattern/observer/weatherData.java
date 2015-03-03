package com.refactoringToPattern.observer;

import java.util.Arrays;
import java.util.List;

public class weatherData {
    private List<IMachineObserver> observers;

    public weatherData(seedingMachine seedingMachine, reapingMachine reapingMachine, wateringMachine wateringMachine)
    {
        seedingMachineObserver seedingMachineObserver = new seedingMachineObserver(seedingMachine);
        reapingMachineObserver reapingMachineObserver = new reapingMachineObserver(reapingMachine);
        wateringMachineObserver wateringMachineObserver = new wateringMachineObserver(wateringMachine);
        observers = Arrays.asList(seedingMachineObserver, reapingMachineObserver, wateringMachineObserver);
    }

    public void MeasurementsChanged(int temp, int humidity, int windPower)
    {
        observers.forEach(observer -> observer.start(temp, humidity, windPower));
    }

}
