package com.kangelov;

public class HardDisk {

    private int capacity;
    private String model;

    public HardDisk(int capacity, String model) {
        this.capacity = capacity;
        this.model = model;
    }

    public int getCapacity() {

        System.out.println("The hard capacity is: " + capacity);
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        System.out.println("The hard model is: " + model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
