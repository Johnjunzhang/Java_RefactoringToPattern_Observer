package com.refactoringToPattern.observer;

public class reapingMachineObserver {
    public com.refactoringToPattern.observer.reapingMachine reapingMachine;

    public reapingMachineObserver(reapingMachine reapingMachine) {

        this.reapingMachine = reapingMachine;
    }

    public void start(int temp, int humidity) {
        if (temp > 5)
        {
            if (humidity > 65)
                reapingMachine.Start();
        }
    }
}
