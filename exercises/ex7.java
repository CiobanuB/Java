package exercises;

import java.util.Scanner;

public class ex7 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 11, 8, 22, 35, 34, 1, 2, 6, 8, 88, 77, 55, 3, 4, 33, 26, 28, 84, 56, 84, 33, 28, 99, 93, 66, 37, 24, 13};
        int[] arrayTest = {1, 2, 3, 4, 6};
        System.out.println("Please select your option from the menu ");
        System.out.println("   1. Sum values of array :\n  " +
                " 2. Average values of array elements :\n  " +
                " 3. Remove specific element from array and change the size :\n  " +
                "4. Insert an element to specific position into array :\n  " +
                " 5. Find second largest element in array :\n  " +
                "6. Number of even and odd integers in a given array of integers :\n  " +
                "7. Average values of an array except smallest and largest :\n  " +
                "8. Cyclically rotate a given array clockwise by one :\n  " +
                "9. Reverse triangle :\n  " +
                "10. Rectangle with diagonals :\n  " +
                "11. Print sum and Print difference Small-Biggest  :\n  " +
                "12. New numbers as a difference between of the others and the actual number :\n  " +
                "13. Print sum and Print difference Small-Biggest  ");
        boolean flag = false;
        while (!flag) {
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("1. Sum values of array :");
                    System.out.println(sumValues(array));
                    break;
                case 2:
                    System.out.println("2. Average values of array elements :");
                    System.out.println(averageValues(array));
                    break;
                case 3:
                    System.out.println("3. Remove specific element from array and change the size : ");
                    printArray(removeElement(arrayTest));
                    break;
                case 4:
                    System.out.println("4. Insert an element to specific position into array : ");
                    printArray(insertElementPosition(arrayTest));
                    break;
                case 5:
                    System.out.println("5. Find second largest element in array : ");
                    System.out.println(secondLargestElement(array));
                    break;
                case 6:
                    System.out.println("6. Number of even and odd integers in a given array of integers  ");
                    oddAndEven(array);
                    break;
                case 7:
                    System.out.println("7. Average values of an array except smallest and largest   ");
                    System.out.println(averageValueExcept(array));
                    break;
                case 8:
                    System.out.println("8. Cyclically rotate a given array clockwise by one ");
                    printArray(arrayRotation(arrayTest));
                    break;
                case 9:
                    System.out.println("9. Reverse triangle ");
                    System.out.println("It can be found in exercitiu 6");
                   /* int given = giveNumber();
                    reverseTriangle(given);*/
                    break;
                case 10:
                    System.out.println("10. Rectangle with diagonals");
                    System.out.println("It can be found in exercitiu 7");
                    break;
                case 11:
                    System.out.println("11. Print sum and Print difference Small-Biggest  ");
                    System.out.println(difSmallestBiggest());
                    break;
                case 12:
                    System.out.println("12. New numbers as a difference between of the others and the actual number. Type the numbers separating them by  ';'");
                    newNumbers();
                    break;
                case 14:
                    System.out.println("14.  Exit");
                    flag = true;
                    break;

            }

        }
    }

    private static void printArray(int[] array) {
        System.out.println(" Array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private static int sumValues(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    private static int averageValues(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

    private static int[] removeElement(int[] array) {
        System.out.println("The array is :");
        printArray(array);
        int[] newArray = new int[array.length - 1];
        System.out.println("Which element you want to remove ?");
        int element = sc.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == element)
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if(i==j)
                newArray[j] = array[i];
            }

        }
        return newArray;
    }

    private static void removeElementArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) System.out.println(array[i] + " ");
        }
    }

    private static int[] insertElementPosition(int[] array) {
        int[] newArray = new int[array.length];
        System.out.println("What element you wish to insert? ");
        int insert = sc.nextInt();
        System.out.println("What position? ");
        int position = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (i == j) {
                    if (j == position)
                        newArray[position] = insert;
                    else
                        newArray[j] = array[i];
                }

            }
        }
        return newArray;
    }

    private static int secondLargestElement(int[] array) {
        // se mai poate rezolva si salvand valorile intr un array separat de 2 pozitii
        int largesteElement = 0, secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest) {
                if (array[i] > largesteElement) {
                    secondLargest = largesteElement;
                    largesteElement = array[i];
                } else {
                    secondLargest = array[i];
                }
            }
        }
        return secondLargest;
    }

    private static void oddAndEven(int[] array) {
        int evenIntegers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) evenIntegers++;
        }
        System.out.println("Even elements :" + evenIntegers);
        System.out.println("Odd elements :" + (array.length - evenIntegers));
    }

    private static int averageValueExcept(int[] array) {
        int min = Integer.MAX_VALUE, max = 0, sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
            sum += array[i];
        }
        return ((sum - (min + max)) / (array.length - 2));
    }

    private static String difSmallestBiggest() {
        int min = Integer.MAX_VALUE, max = 0, sum = 0;
        System.out.println("Please insert your numbers : ");
        String theString = sc.nextLine();
        for (int i = 0; i < theString.length(); i++) {
            if (theString.charAt(i) != ' ') {
                int number = Integer.parseInt(String.valueOf(theString.charAt(i)));
                if (number < min) min = number;
                if (number > max) max = number;
                sum += number;
            }

        }
        return "Sum of elements is : " + sum + "\n Difference between min and max is :  " + (max - min);
    }

    private static int[] arrayRotation(int[] array) {
        int lastElement = array.length - 1, cache = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (i == 0) {
                    cache = array[i];
                    newArray[i] = array[lastElement];
                    newArray[lastElement] = array[i];
                } else if (i != lastElement) newArray[i] = array[i];
            }
        }
        return newArray;
    }

    public static void reverseTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 1; j <= number; j++) {

                if (j >= i && j <= number - i + 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
        }
    }

    public static int giveNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number : ");
        int number = sc.nextInt();
        return number;
    }

    private static void newNumbers() {
        System.out.println("Please insert your numbers separated by ; ");
        String theString = sc.nextLine();
        for (int i = 0; i < theString.length(); i++) {
            int sum = 0;
            for (int j = 0; j < theString.length(); j++) {
                if (Character.isDigit(theString.charAt(j)) && j != i) {
                    int number = Character.getNumericValue(theString.charAt(j));
                    sum += number;
                }
            }
            if (Character.isDigit(theString.charAt(i))) {
                int number = Character.getNumericValue(theString.charAt(i));
                System.out.println("Difference between " + number + " and sum of the others, is : " + (sum - number));
            }


        }
    }
}
