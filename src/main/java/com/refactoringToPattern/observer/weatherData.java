package com.refactoringToPattern.observer;

import java.util.Arrays;
import java.util.List;

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
        seedingMachineObserver seedingMachineObserver = new seedingMachineObserver(seedingMachine);
        reapingMachineObserver reapingMachineObserver = new reapingMachineObserver(reapingMachine);
        wateringMachineObserver wateringMachineObserver = new wateringMachineObserver(wateringMachine);
        List<IMachineObserver> machineObservers = Arrays.asList(seedingMachineObserver, reapingMachineObserver, wateringMachineObserver);
        
        machineObservers.forEach(observer -> observer.start(temp, humidity, windPower));
    }
}
