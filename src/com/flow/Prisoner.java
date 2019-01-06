package com.flow;

public class Prisoner<Status extends Boolean, WalkCounter extends Integer> {
    private Status status;
    private WalkCounter walkCounter;
    private String nameOfThePrisoner;


    public Prisoner(String nameOfThePrisoner, Status status, WalkCounter walkCounter) {
        this.status = status;
        this.walkCounter = walkCounter;
        this.nameOfThePrisoner = nameOfThePrisoner;
    }

    public Status getStatus() {
        return status;
    }

    public int getWalkCounter() {
        return walkCounter;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setWalkCounter(WalkCounter walkCounter) {
        this.walkCounter = walkCounter;
    }

    public void setNameOfThePrisoner(String nameOfThePrisoner) {
        this.nameOfThePrisoner = nameOfThePrisoner;
    }

    @Override
    public String toString() {
        return (" Name: " + nameOfThePrisoner + " | Status: " + status + " | WalkCounter: " + walkCounter + '\n');
    }
}
