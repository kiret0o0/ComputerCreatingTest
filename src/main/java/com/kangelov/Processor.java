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
        System.out.println("The processor model is: " + model);
        return model;
    }

    public int getNumberOfCores() {
        System.out.println("The processor cores are: " + numberOfCores);
        return numberOfCores;
    }

    public double getFrequency() {
        System.out.println("The processor frequency is: " + frequency);
        return frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
