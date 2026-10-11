import java.util.Scanner;

public class SelfATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 30000.00;
        int choice;

        System.out.println("=== WELCOME TO ACMC ATM ===");
        do {
            System.out.println("\n=== ATM OPTIONS ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            choice = input.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Total Balance: "+balance);
                break;

                case 2:
                    System.out.print("Enter Amount of Deposit: ");
                    double deposit = input.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("You successfully deposited: "+ balance);

                        System.out.println("Total Balance: "+balance);
                    } else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                break;

                case 3:
                    System.out.print("Please enter Withdrawal Amount: ");
                    double withdraw = input.nextDouble();

                    if (withdraw > 0) {
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal Amount: "+withdraw);
                            System.out.print("Total Balance: "+balance);
                        } else {
                            System.out.println("Insufficient balance.");
                            System.out.println("Total Balanace: "+balance);
                        }
                    }
                    else {
                        System.out.println("Invalid amount. Please try again.");
                    }
                break;

                case 4:
                    System.out.println("Thank you for using ACMC ATM!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        } while (choice !=4);
    }
}
