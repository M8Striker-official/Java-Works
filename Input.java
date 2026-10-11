import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    String userName = scanner.nextLine(); // Read user input (a full line including spaces)

    System.out.println("Username is: " + userName); // Output user input

    scanner.close(); // Close the scanner to prevent resource leaks
  }
}