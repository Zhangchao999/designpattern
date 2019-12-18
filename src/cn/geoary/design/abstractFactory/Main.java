package cn.geoary.design.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new ChineseFactory();
        f.CreateFood().eat();
        f.createTransport().create();

        AbstractFactory ff = new AmericanFactory();
        ff.CreateFood().eat();
        ff.createTransport().create();
    }
}
