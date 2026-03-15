import java.util.Scanner;

public class Quadrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x and y coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("The point is at the Origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the x-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point lies in the 1st Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point lies in the 2nd Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point lies in the 3rd Quadrant.");
        } else {
            System.out.println("The point lies in the 4th Quadrant.");
        }
        
        sc.close();
    }
}
