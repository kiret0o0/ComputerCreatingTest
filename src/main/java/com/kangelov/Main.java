package com.kangelov;

public class Main {

    public static void main(String[] args) {

        HardDisk hardDisk = new HardDisk(1000,"Sony");
        VideoCard videoCard = new VideoCard(6,"nVidia GeForce 1060");
        Ram ram = new Ram(16,1600);
        Processor processor = new Processor("Intel i7-7750",8,4.3);
        Computer computer = new Computer(hardDisk,videoCard,ram,processor);
        computer.getHardDisk().getModel();
    }
}
