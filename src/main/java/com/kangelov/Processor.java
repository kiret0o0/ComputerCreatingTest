package com.kangelov;

public class Processor{

    private String model;
    private int numberOfCores;
    private double frequency;

    public Processor(String model, int numberOfCores, double frequency) {
        this.model = model;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
