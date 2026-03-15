import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a 4 digit integer number :");
int x = sc.nextInt();
if(x>=999 && x<10000) 
    System.out.println("its an 4 digit integer number !!!");
else
     System.out.println("not an integer number..");

    }
    
}
