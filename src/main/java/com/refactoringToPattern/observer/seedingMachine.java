package com.refactoringToPattern.observer;

public class seedingMachine {
    private boolean status;

    public boolean getStatus()
    {
        return status;
    }

    public void Start()
    {
        status = true;
    }
}
