package ie.atu;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        while(true) {
            System.out.println("Please enter a number between 0 - 9: ");
            Scanner myscan = new Scanner(System.in);
            try {
                String input = myscan.nextLine();

                int myNum = Integer.parseInt(input);

                if (myNum >= 0 && myNum <= 9) {

                    System.out.println("You entered " + myNum);
                    break;

                } else{
                    System.out.println("Not a valid number");

                }

            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid number");
            }
        }
    }
}
