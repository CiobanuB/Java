package exercises;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your text : ");
        String theText = sc.nextLine();
        int[] arrayText = returnAparitions(theText);
        printArray(arrayText);


    }

    private static int[] returnAparitions(String text) {
        int counter = 1;
        String newText = text.toLowerCase();
        int[] array = new int[127];
        for (int i = 0; i < newText.length(); i++) {
            counter = 1;
            for (int j = 0; j < newText.length(); j++) {
                if (newText.charAt(i) == newText.charAt(j)) {
                    counter++;
                    char caracter = newText.charAt(i);
                    int ascii = (int) caracter;
                    for (int k = 0; k < array.length; k++) {
                        array[ascii] = counter;


                    }
                }

            }

        }
        return array;
    }

    private static void printArray(int[] theArray) {
        for (int i = 97; i < theArray.length; i++) {
            if(theArray[i] != 0){
                char ascii = (char) i;
                System.out.println("Letter " + ascii + " has appeared " + theArray[i] + " times ");
            }

        }
    }

}
