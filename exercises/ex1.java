package exercises;


import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        printArray(initialize());

    }

    private static int[] initialize() {
        int[] array = new int[101];
        for (int i = 1; i < array.length; i++) {
            array[i] = i*11;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
