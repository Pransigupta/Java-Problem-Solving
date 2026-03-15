import java.util.Scanner;

public class sp6{
    public static void main(String[] args) {

        int n = 5;   // size of pattern

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(i == 3 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}