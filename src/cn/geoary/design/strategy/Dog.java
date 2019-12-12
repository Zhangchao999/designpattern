package cn.geoary.design.strategy;

public class Dog implements Comparable<Dog> {

    public int food;
    public int bark;

    public Dog(int food, int bark) {
        this.food = food;
        this.bark = bark;
    }

    @Override
    public int compareTo(Dog o) {
        if(this.food> o.food){
            return 1;
        }else if (this.food< o.food){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                ", bark=" + bark +
                '}';
    }
}
