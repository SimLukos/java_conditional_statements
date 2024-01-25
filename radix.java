// Find radix of a number given in a string

import java.util.Scanner;

public class radix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number in string format");
        String number = scan.nextLine();

        if (number.matches("[01]+")) {
            System.out.println("Binary");
        } else if (number.matches("[0-7]+")) {
            System.out.println("Octal");
        } else if (number.matches("[0-9]+")) {
            System.out.println("Decimal");
        } else if (number.matches("[0-9A-F]+")) {
            System.out.println("Hexal");
        } else {
            System.out.println("Not a number");
        }

        scan.close();
    }
}
