package exercises;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your text : ");
        String theText = sc.nextLine();
        System.out.println(countAparitions(theText));


    }
    public static Set<String> countAparitions(String Text)
    {
        String newText=  Text.replaceAll(" ", "");
        Set<String> remberAparatitions = new HashSet<String>();
        for (int i = 0; i < newText.length(); i++) {
            int count = 1;
            for (int j = 0; j < newText.length(); j++) {
                if (newText.charAt(i) == newText.charAt(j)) count++;

            }
            remberAparatitions.add(newText.charAt(i) + " has :" + count + " aparitions in the text \n");
        }
        return remberAparatitions;
    }
}
