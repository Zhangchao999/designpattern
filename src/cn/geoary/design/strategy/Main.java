package cn.geoary.design.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] a = {2, 1, 4, 6, 3, 9};
        //double[] a = {2.2, 0.1, 4.1, 6.0, 3.1, 1.9};
        //Cat[] a = {new Cat(7,2), new Cat(2,3), new Cat(4,2)};
        Dog[] a = {new Dog(3,2), new Dog(1,1), new Dog(2,6)};
        Sorter sorter = new Sorter();
        //sorter.sort(a);
        //sorter.sort(a, new DogFoodComparator());
        sorter.sort(a, new DogBarkComparator());
        System.out.println(Arrays.toString(a));
    }
}
