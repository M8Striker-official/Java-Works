import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the user for input of wood type//
        System.out.print("Enter Wood Type (1 for Pine, 2 for Oak, 3 for Mahogany): ");
        int woodType = input.nextInt();

        //Ask the user for Table Size//
        System.out.print("Enter Table Size (S for Small or L for Large): ");
        String tableSize = input.next();
        String upperTableSize = tableSize.toUpperCase();

        String L = "Large";
        String S = "Small";
        String wood = "";
        double price = 0;
        System.out.println("Calculation of Furniture Price");
        if (woodType == 1 && upperTableSize.equals("L")) {
            price = 5500;
            double percentage = price*0.1;
            double totalPrice = price + percentage;
            wood = "Pine";
            System.out.println("Wood Type: " + wood);
            System.out.println("Table Size: " + L);
            System.out.println("Price: " + totalPrice);
        } else if (woodType == 1 && upperTableSize.equals("S")) {
            price = 5500;
            wood = "Pine";
            System.out.println("Wood Type: " + wood);
            System.out.println("Table Size: " + S);
            System.out.println("Price: " + price);
        } else if (woodType == 2 && upperTableSize.equals("L")) {
            price = 12375;
            double percentage = price*0.1;
            double totalPrice = price + percentage;
            wood = "Oak";
            System.out.print("Wood Type: "+wood);
            System.out.println("Table Size: " + L);
            System.out.println("Price: " + totalPrice);
        } else if (woodType == 2 && upperTableSize.equals("S")) {
            price = 12375;
            wood = "Oak";
            System.out.println("Wood Type: " + wood);
            System.out.println("Table Size: " + S);
            System.out.println("Price: " + price);
        } else if (woodType == 3 && upperTableSize.equals("L")) {
            price = 17050;
            double percentage = price*0.1;
            double totalPrice = price + percentage;
            wood = "Mahogany";
            System.out.println("Wood Type: " + wood);
            System.out.println("Table Size: " + L);
            System.out.println("Price: " + totalPrice);
        } else if (woodType == 3 && upperTableSize.equals("S")) {
            price = 18750;
            wood = "Mahogany";
            System.out.println("Wood Type: " + wood);
            System.out.println("Table Size: " + S);
            System.out.println("Price: " + price);
        } else {
            System.out.println("Invalid input for wood type or table size.");
        }
    }
}
