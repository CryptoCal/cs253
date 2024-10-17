import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "brian";
        String correctPassword = "spam";

        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Welcome Brian!");
                loggedIn = true;
            } else {
                System.out.println("Incorrect username or password, please try again:");
            }
        }
    }
}