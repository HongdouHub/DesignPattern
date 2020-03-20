package designpattern.no10_mediator.colleague;

import designpattern.no10_mediator.mediator.Mediator;

public class CPU extends Colleague {

    private String videoData = "";

    private String soundData = "";

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        if (data != null && data.contains(",")) {
            String[] strings = data.split(",");
            this.videoData = strings[0];
            this.soundData = strings.length > 1 ? strings[1] : "";
            getMediator().changed(this);
        }
    }
}
