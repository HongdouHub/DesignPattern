package designpattern.no10_mediator.colleague;

import designpattern.no10_mediator.mediator.Mediator;

public class CDDriver extends Colleague {

    private String data = "";

    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    public String getData() {
        return data;
    }

    public void readCD() {
        this.data = "getThread1,readCD";
        getMediator().changed(this);
    }
}
