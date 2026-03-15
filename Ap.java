import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        
        int a = 2;   
        int d = 3;  
        
        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a + d;
    }
}
}

