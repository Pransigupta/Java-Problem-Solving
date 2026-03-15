import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // correct line
        
        int x = sc.nextInt();
    
        if (x % 2 == 0)
            System.out.println("even num");
        else 
            System.out.println("odd num");
    }
}