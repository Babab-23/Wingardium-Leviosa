// FindNameWithLambda.java

import java.util.Arrays;
import java.util.Scanner;

public class FindNameWithLambda {
    public static void main(String[] args) {

        String[] names = {"Adrian", "Joy", "Michael", "Sarah", "Tunde", "Ada"};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name to search for: ");
        String target = input.nextLine();

        // Using a Lambda expression with Stream API
        boolean found = Arrays.stream(names)
                              .anyMatch(name -> name.equalsIgnoreCase(target));

        if (found) {
            System.out.println(target + " was found in the list.");
        } else {
            System.out.println(target + " was NOT found in the list.");
        }

        input.close();
    }
}

