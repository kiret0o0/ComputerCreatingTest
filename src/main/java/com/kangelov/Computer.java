package com.kangelov;

public class Computer {
    private HardDisk hardDisk;
    private VideoCard videoCard;
    private Ram ram;
    private Processor processor;

    public Computer(HardDisk hardDisk, VideoCard videoCard, Ram ram, Processor processor) {
        this.hardDisk = hardDisk;
        this.videoCard = videoCard;
        this.ram = ram;
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public Ram getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }
}
