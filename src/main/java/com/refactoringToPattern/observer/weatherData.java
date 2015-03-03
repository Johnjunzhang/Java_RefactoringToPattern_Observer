package com.refactoringToPattern.observer;

import java.util.ArrayList;

public class weatherData {
    private final ArrayList<IMachineObserver> machineObserverArrayList = new ArrayList<>();

    public void Subscribe(IMachineObserver seedingMachineObserver) {
        machineObserverArrayList.add(seedingMachineObserver);
    }

    public void MeasurementsChanged(int temp, int humidity, int windPower)
    {
        machineObserverArrayList.forEach(observer -> observer.start(temp, humidity, windPower));
    }

}
