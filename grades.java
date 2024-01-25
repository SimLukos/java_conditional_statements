// Find grades for given marks

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write three marks from 1 to 100:");

        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();

        float averageMark = (float) (m1 + m2 + m3) / 3;

        if (averageMark >= 70) {
            System.out.println("A");
        } else if (averageMark < 70 && averageMark >= 60) {
            System.out.println("B");
        } else if (averageMark < 60 && averageMark >= 50) {
            System.out.println("C");
        } else if (averageMark < 50 && averageMark >= 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        scan.close();
    }
}
