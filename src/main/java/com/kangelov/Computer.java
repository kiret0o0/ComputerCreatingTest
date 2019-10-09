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
        System.out.println("The computer HardDisk is: " + hardDisk);
        return hardDisk;
    }

    public VideoCard getVideoCard() {
        System.out.println("The computer VideoCard is: " + videoCard);
        return videoCard;
    }

    public Ram getRam() {
        System.out.println("The computer Ram is: " + ram);
        return ram;
    }

    public Processor getProcessor() {
        System.out.println("The computer Processor is: " + processor);
        return processor;
    }
}
