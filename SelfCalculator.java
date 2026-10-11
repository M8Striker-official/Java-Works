import java.util.Scanner;

public class SelfCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, results=0;
        char operator;
        char choice;

        do {
            System.out.println("=== ACMC CALCULATOR ===");

            System.out.print("Enter First Number: ");
            num1 = input.nextDouble();

            System.out.print("Enter the Operator: ");
            operator = input.next().charAt(0);

            System.out.print("Enter Second Number: ");
            num2 = input.nextDouble();

            switch(operator) {
                case '+':
                    results = num1+num2;
                    break;
                case '-':
                    results = num1-num2;
                    break;
                case '/':
                    results = num1/num2;
                    break;
                case '*':
                    results = num1*num2;
                    break;
                case '%':
                    results = num1%num2;
                    break;
                default:
                    System.out.println("Invalid Operator, Please Try Again.");
            }

            System.out.println("Equation: "+num1+" "+operator+" "+num2+" = "+results);
            
            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next().charAt(0);
            switch (choice) {
                case 'y':
                    System.out.println();
                    break;
                case 'n':
                    System.out.println("Shutting Down...");
                    break;
                default:
                    System.out.println("Invalid Input, Please Try Again.");
                break;
            } 
        } while (choice == 'y' || choice == 'Y');
    }
}
