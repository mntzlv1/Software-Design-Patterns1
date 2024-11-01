import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);


    // Displays the current data to the user
    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    // Prompts the user with a message and reads input
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Displays updated data to the user
    public void displayUpdatedData(String data) {
        System.out.println("Data updated to: " + data);
    }
}