import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter username: ");
            String user = scanner.nextLine();
            System.out.println("Hello " + user + " !");
        }
    }

}
