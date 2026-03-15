
import java.util.Scanner;
public class sp3 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in) ;
        System.out.println("enter a number :");
 int n= Sc.nextInt();
for(int i = 65; i <= 68; i++) {      // ASCII values of B, C, D
            for(int j = 1; j <= 4; j++) {
                System.out.print((char)i+" ");   // type casting int → char
            }
    }
    System.err.println();
}
    }

