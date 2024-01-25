// Find a number is odd or even

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
        scan.close();
    }

}