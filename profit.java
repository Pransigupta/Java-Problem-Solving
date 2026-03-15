import java.util.Scanner;
public class profit {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the value of buying the good ");
     System.out.println("Enter the value of selling the good ");
     float b = sc.nextFloat();
     float s =  sc.nextFloat();
     if ( s>b ) System.out.println("profitable ");
    
     if (s==b) System.out.println("both are equal");
     else System.out.println("loss");
     if (s-b==0)System.out.println("no profit no loss");

     if (s-b!= 0)  System.out.println(s-b);
}
    
}
