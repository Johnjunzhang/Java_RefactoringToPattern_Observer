package com.refactoringToPattern.observer;

public class seedingMachineObserver implements IMachineObserver {
    private seedingMachine seedingMachine;

    public seedingMachineObserver(seedingMachine seedingMachine) {
        this.seedingMachine = seedingMachine;
    }

    @Override
    public void start(int temp, int humidity, int windPower) {
        if (temp > 5)
        {
            seedingMachine.Start();
        }
    }
}
