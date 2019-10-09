package com.kangelov;

public class Ram{

    private int capacity;
    private int frequency;

    public Ram(int capacity, int frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
