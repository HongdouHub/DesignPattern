package designpattern.no10_mediator.colleague;

import designpattern.no10_mediator.mediator.Mediator;

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundData(String data) {
        System.out.println("SoundCard soundData:" + data);
    }
}
