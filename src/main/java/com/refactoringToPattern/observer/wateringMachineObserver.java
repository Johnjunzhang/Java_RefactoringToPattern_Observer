package com.refactoringToPattern.observer;

public class wateringMachineObserver implements IMachineObserver{
    public com.refactoringToPattern.observer.wateringMachine wateringMachine;

    public wateringMachineObserver(wateringMachine wateringMachine) {
        this.wateringMachine = wateringMachine;
    }

    public void start(int temp, int humidity, int windPower) {
        if (temp > 10 && humidity < 55 && windPower < 4)
            wateringMachine.Start();
    }
}
