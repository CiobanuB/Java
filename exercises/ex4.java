package exercises;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int given = giveNumber();
        System.out.println(given);
        reverseTriangle(given);
    }

    public static int giveNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number : ");
        int number = sc.nextInt();
        return number;
    }

    public static void reverseTriangle(int number) {
        for (int i = 1; i <=number; i++) {
            System.out.println();
            for (int j = 1; j <= number; j++) {

               if(j>=i && j<= number-i+1)
                System.out.print("*");
               else System.out.print(" ");
            }
        }
    }
}
