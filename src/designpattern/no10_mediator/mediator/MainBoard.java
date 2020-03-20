package designpattern.no10_mediator.mediator;

import designpattern.no10_mediator.colleague.*;

public class MainBoard implements Mediator {

    private CDDriver cdDriver = null;

    private CPU cpu = null;

    private VideoCard videoCard = null;

    private SoundCard soundCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CDDriver) {
            openCDDriverReadData((CDDriver) colleague);
        } else if (colleague instanceof CPU) {
            openCPU((CPU) colleague);
        }
    }

    private void openCDDriverReadData(CDDriver cd) {
        String data = cd.getData();
        if (cpu != null) {
            cpu.executeData(data);
        }
    }

    private void openCPU(CPU cpu) {
        if (cpu != null) {
            String videoData = cpu.getVideoData();
            String soundData = cpu.getSoundData();

            if (videoCard != null) {
                videoCard.showData(videoData);
            }

            if (soundCard != null) {
                soundCard.soundData(soundData);
            }
        }
    }
}
