package goit.module6.musicShop;

import java.util.Scanner;

public class CorrectScanner {

    public static int getCorrectInt(){

       boolean correctValueOfInt = false;
        int positiveValue = 0;

        while (!correctValueOfInt){
            positiveValue = getInt();
             if (positiveValue < 0) {
                 System.out.println("Your order is not correct. Order must be >=0. Please try again.");
             }
            else {
                 correctValueOfInt = true;
             }
        }
      return positiveValue;
    }

    public static int getInt(){

        boolean correctValueOfInt = false;
        int positiveValue = 0;

        while (!correctValueOfInt){
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                positiveValue = scanner.nextInt();
                correctValueOfInt = true;
            } else {
                System.out.println("Your entered not correct value. Please try again.");
            }
        }
        return  positiveValue;
    }
}
