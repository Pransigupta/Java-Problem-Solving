import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args){
       // double r=6;
       // double a =3.14*r*r;
//System.out.println(a);
// aab hame isse input dena h means user se input lena h..
Scanner sc = new Scanner(System.in);
System.out.print("Enter the radius:");
double r = sc.nextDouble();
double a = 3.141592 *r*r;
System.out.println(a);
    }
}
