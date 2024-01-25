// Find a given year is a leap year or not

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a year: ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }

            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

        scan.close();
    }

}