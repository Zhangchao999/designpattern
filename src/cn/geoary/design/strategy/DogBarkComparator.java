package cn.geoary.design.strategy;

public class DogBarkComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.bark> o2.bark){
            return 1;
        }else if(o1.bark<o2.bark){
            return -1;
        }else{
            return 0;
        }
    }
}
