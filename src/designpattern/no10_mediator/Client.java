package designpattern.no10_mediator;

import designpattern.no10_mediator.colleague.CDDriver;
import designpattern.no10_mediator.colleague.CPU;
import designpattern.no10_mediator.colleague.SoundCard;
import designpattern.no10_mediator.colleague.VideoCard;
import designpattern.no10_mediator.mediator.MainBoard;

public class Client {

    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();

        CDDriver cdDriver = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        VideoCard videoCard = new VideoCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);

        mainBoard.setCdDriver(cdDriver);
        mainBoard.setCpu(cpu);
        mainBoard.setVideoCard(videoCard);
        mainBoard.setSoundCard(soundCard);

        cdDriver.readCD();
    }
}
