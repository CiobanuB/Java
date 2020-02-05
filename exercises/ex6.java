package exercises;

import java.util.ArrayList;
import java.util.List;

public class ex6 {
    public static void main(String[] args) {
        String[] dictionary = {"dot", "dop", "dat", "cat"};
        printArray(changeLetter("dog", "cat", dictionary));
    }

    private static ArrayList<String> changeLetter(String start, String end, String[] dictionary) {
        ArrayList<String> myList = new ArrayList<String>();
        String theString = start + end;

        char[] theChar = new char[theString.length()];
        for (int i = 0; i < theString.length(); i++) {
            for (int j = 0; j < theChar.length; j++) {
                if (i == j) {
                    theChar[j] = theString.charAt(i);
                    System.out.print(theChar[j] + " ");
                }
            }
        }
        for (int i = 0; i < dictionary.length; i++) {
            int contor = 0;
            for (int j = 0; j < dictionary[i].length(); j++) {
                if(searchArray(theChar, dictionary[i].charAt(j)))
                    contor++;
                System.out.print(dictionary[i].charAt(j) + " ");
            }
            System.out.println();
            if(contor == 3) myList.add(dictionary[i]);
        }
        if(myList.size() > 0) return myList;

        return null;
    }
    private static boolean searchArray(char[] array , char theChar)
    {
        for (int i = 0; i <array.length ; i++) {
            if(theChar == array[i])
                return true;
        }
        return false;
    }
    private static void printArray(ArrayList<String> arrayList) {
        System.out.println("The list is : ");
        for (String string : arrayList) {
            System.out.println(string);

        }
    }
}
