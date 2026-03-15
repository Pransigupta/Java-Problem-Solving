import java.util.Scanner;

public class RealNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        double n = sc.nextDouble(); 
        int x = (int)n;
        if (n-x==0) System.out.println("an integer ");
        else System.out.println("not an integer ");
    }
}
