package ex14;

import java.util.Scanner;

public class ex14 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String order_in = input.next();
        System.out.print("What is the state? ");
        String state = input.next();

        String state_WI = "WI";

        double order = Double.parseDouble(order_in);
        double tax, tax_add, total = order;

        if (state.equals(state_WI)) {
            tax = 5.5 / 100;
            tax_add = order * tax;
            total = order + tax_add;

            System.out.printf("The subtotal is $%.2f.\n", order);
            System.out.printf("The tax is $%.2f.\n", tax_add);
        }

        System.out.printf("The total is $%.2f.\n", total);
    }
}