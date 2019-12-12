package cn.geoary.design.strategy;

/**
 * 功能描述:
 * 〈排序〉
 *
 * @author : zhangc
 * @date : 2019/12/12 20:00
 */
public class Sorter<T>{
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[minPos] < arr[j] ? minPos : j;
            }
            swap(arr, minPos, i);
        }
    }

    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[minPos] < arr[j] ? minPos : j;
            }
            swap(arr, minPos, i);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(double arr[], int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*public static void sort(Cat[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[minPos].comareTo(arr[j]) == -1? minPos : j;
            }
            swap(arr, minPos, i);
        }
    }

    public static void swap(Cat arr[], int i, int j) {
        Cat temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[minPos].compareTo(arr[j]) < 0 ? minPos : j;
            }
            swap(arr, minPos, i);
        }
    }

    public static void swap(Comparable arr[], int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[minPos], arr[j]) < 0 ? minPos : j;
            }
            swap(arr, minPos, i);
        }
    }

    public void swap(T arr[], int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
