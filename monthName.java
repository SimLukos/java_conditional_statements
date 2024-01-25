import java.util.Scanner;

public class monthName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number of the month:");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                System.out.println("Sausis");
                break;
            case 2:
                System.out.println("Vasaris");
                break;
            case 3:
                System.out.println("Kovas");
                break;
            case 4:
                System.out.println("Balandis");
                break;
            case 5:
                System.out.println("Geguze");
                break;
            case 6:
                System.out.println("Birzelis");
                break;
            case 7:
                System.out.println("Liepa");
                break;
            case 8:
                System.out.println("Rugpjutis");
                break;
            case 9:
                System.out.println("Rugsejis");
                break;
            case 10:
                System.out.println("Spalis");
                break;
            case 11:
                System.out.println("Lapkritis");
                break;
            case 12:
                System.out.println("Gruodis");
                break;
            default:
                System.out.println("Wrong number.");
                break;
        }
        scan.close();
    }
}
