package com.kangelov;

public class HardDisk {

    private String capacity;
    private String model;

    public HardDisk(String capacity, String model) {
        this.capacity = capacity;
        this.model = model;
    }

    public String getCapacity() {
        System.out.println("The hard capacity is: " + capacity);
        return capacity;
    }

    public void setCapacity(String capacity) {
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
