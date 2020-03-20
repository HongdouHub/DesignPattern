package designpattern.no10_mediator.colleague;

import designpattern.no10_mediator.mediator.Mediator;

public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data) {
        System.out.println("VideoCard showData:" + data);
    }
}
