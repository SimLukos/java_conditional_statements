import java.util.Scanner;

public class dayName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number from 1 to 7:");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Pirmadienis");
                break;
            case 2:
                System.out.println("Antradienis");
                break;
            case 3:
                System.out.println("Treciadienis");
                break;
            case 4:
                System.out.println("Ketvirtadienis");
                break;
            case 5:
                System.out.println("Penktadienis");
                break;
            case 6:
                System.out.println("Sestadienis");
                break;
            case 7:
                System.out.println("Sekmadienis");
                break;
            default:
                System.out.println("Wrong number.");
                break;
        }
        scan.close();
    }
}
