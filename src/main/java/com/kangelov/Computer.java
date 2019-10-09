package com.kangelov;

public class Computer {
    private String HardDisk;
    private String VideoCard;
    private String Ram;
    private String Processor;

    public Computer() {
    }

    public Computer(String hardDisk, String videoCard, String ram, String processor) {
        HardDisk = hardDisk;
        VideoCard = videoCard;
        Ram = ram;
        Processor = processor;
    }

    public String getHardDisk() {
        return HardDisk;
    }

    public void setHardDisk(String hardDisk) {
        HardDisk = hardDisk;
    }

    public String getVideoCard() {
        return VideoCard;
    }

    public void setVideoCard(String videoCard) {
        VideoCard = videoCard;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }
}
