import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.println("enter the values of a,b,c");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int greater = (a>b)?(a>c ? a:c):(b>c ? b:c);
        System.out.println("Greatest number is:"+ greater);
    }
}
