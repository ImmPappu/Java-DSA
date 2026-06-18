package A2_if_else;

import java.util.Scanner;

public class Profir_Loss_Question {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price of item = ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter Selling Price of item =");
        double sellingPrice = sc.nextDouble();

        if (costPrice < sellingPrice) {
            System.out.println("Profit =" + (sellingPrice-costPrice));
        }
        else if(costPrice > sellingPrice) {
            System.out.println("Loss = " + (costPrice-sellingPrice));
        }
        else {
            System.out.println("No Profir or loss ");
        }
    }
}
