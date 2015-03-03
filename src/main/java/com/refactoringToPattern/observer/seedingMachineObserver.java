package com.refactoringToPattern.observer;

public class seedingMachineObserver {
    private seedingMachine seedingMachine;

    public seedingMachineObserver(seedingMachine seedingMachine) {
        this.seedingMachine = seedingMachine;
    }

    public void start(int temp) {
        if (temp > 5)
        {
            seedingMachine.Start();
        }
    }
}
