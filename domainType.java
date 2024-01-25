import java.util.Scanner;

public class domainType {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write domain name:");
        String domain = scan.nextLine();

        int lastDotIndex = domain.lastIndexOf(".");

        String ext = domain.substring(lastDotIndex + 1, domain.length());

        switch (ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "lt":
                System.out.println("Lithuanian");
                break;
            case "org":
                System.out.println("Organization");
                break;
            default:
                System.out.println("Wrong domain.");
                break;
        }

        scan.close();
    }
}
