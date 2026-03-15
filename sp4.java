import java.util.Scanner;

public class sp4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {

                if(i % 2 != 0) {          // odd row → numbers
                    System.out.print(j + " ");
                }
                else {                    // even row → alphabets
                    System.out.print((char)('a' + j - 1) + " ");
                }

            }

            System.out.println();
        }

        sc.close();
    }
}