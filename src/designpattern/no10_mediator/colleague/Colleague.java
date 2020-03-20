package designpattern.no10_mediator.colleague;

import designpattern.no10_mediator.mediator.Mediator;

public abstract class Colleague {

    /**
     * 持有中介者对象，每个同事类都知道它的中介者对象
     */
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

}
