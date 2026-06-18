package A2_if_else;

import java.util.Scanner;

public class WhichBiggerOfRectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle: ");
        double l = input.nextDouble();
        System.out.print("Enter the Breadth of Rectangle: ");
        double b = input.nextDouble();
        double Area = (l*b);
        System.out.println("The Area of the Rectangle is: " + Area);
        double Perimeter = 2*(l+b);
        System.out.println("The Perimeter of the Rectangle is: " + Perimeter);

        if (Area > Perimeter) {
            System.out.println("The Area is greater than Perimeter ");
        }
        else if ( Area < Perimeter) {
            System.out.println("The Area is less than Perimeter ");
        }
        else  {
            System.out.println("The Area is equal to Perimeter ");
        }
    }
}
