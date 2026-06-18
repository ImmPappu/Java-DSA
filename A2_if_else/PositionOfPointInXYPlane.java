package A2_if_else;

import java.util.Scanner;

public class PositionOfPointInXYPlane {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x = ");
        int x = sc.nextInt();
        System.out.print("Enter y = ");
        int y = sc.nextInt();
        System.out.println("Your Point is at (" + x + ", "+ y + ")");
        if (x>0 && y>0) System.out.println("The Point is in First Quadrant ");
        else if (x<0 && y>0) System.out.println("The Point is in Second Quadrant ");
        else if (x<0 && y<0) System.out.println("The Point is in Third Quadrant ");
        else if (x>0 && y<0) System.out.println("The Point is in Fourth Quadrant ");
        else if (x>0 || x<0 && y==0) System.out.println("The Point is at X axis ");
        else if (x==0 && y>0 || y<0) System.out.println("The Point is at Y axis ");
        else if (x==0 && y==0) System.out.println("The Point is at Origin ");
    }
}
