package cn.geoary.design.mediatorpattern;

public abstract class AbstractPerson {
    protected String name;
    protected Mediator mediator;

    AbstractPerson(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void startMessage(String message);
}
