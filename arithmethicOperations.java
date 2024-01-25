import java.util.Scanner;

public class arithmethicOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Menu\n 1. Sudetis\n 2. Atimtis\n 3. Daugyba\n 4. Dalyba");

        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter option in words:");
        String option = scan.nextLine();

        switch (option.toLowerCase()) {
            case "sudetis":
                System.out.println(a + b);
                break;
            case "atimtis":
                System.out.println(a - b);
                break;
            case "daugyba":
                System.out.println(a * b);
                break;
            case "dalyba":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Error");
                break;

        }
        scan.close();
    }
}
