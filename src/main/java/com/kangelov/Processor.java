package com.kangelov;

public class Processor{

    private String model;
    private int numberOfCores;
    private int frequency;

    public Processor(String model, int numberOfCores, int frequency) {
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
