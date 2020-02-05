package exercises;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert first number");
        int firstNumber = sc.nextInt();
        System.out.println("Please insert first number");
        int secondNumber = sc.nextInt();
        buildRectangleAndDiagonals(firstNumber);

    }

    public static void buildRectangleAndDiagonals(int firstNumber) {
        int diagonal2Pos = firstNumber+1;
        for (int i = 1; i <= firstNumber; i++) {
            System.out.println();
            diagonal2Pos--;
            for (int j = 1; j <= firstNumber; j++) {
                if ((i == 1 || j == 1) || (i == firstNumber || j == firstNumber) || (i == j) ||(j == diagonal2Pos)) {
                    System.out.print("* ");

                } else System.out.print("  ");
            }
        }
    }
}
