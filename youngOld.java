// Find person is young or not young

import java.util.Scanner;

public class youngOld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = scan.nextInt();

        if (age >= 14 && age <= 55) {
            System.out.println("Young");
        } else {
            System.out.println("Old or too young");
        }

        scan.close();
    }
}
