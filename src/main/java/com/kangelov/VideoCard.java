package com.kangelov;

public class VideoCard{

    private int ram;
    private String model;

    public VideoCard(int ram, String model) {
        this.ram = ram;
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
