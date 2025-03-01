import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserName() {
        System.out.print("Enter user name: ");
        scanner.nextLine(); // Consume newline
        return scanner.nextLine();
    }

    // Now displays a list of user names (Strings) instead of UserModel objects
    public void displayUsers(List<String> userNames) {
        System.out.println("User List:");
        for (String name : userNames) {
            System.out.println("- " + name);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void closeScanner() {
        scanner.close();
    }
}
