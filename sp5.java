import java.util.Scanner;
public class sp5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int m= Sc.nextInt();
        int n= Sc. nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if (i==1||i==m||j==1||j==n)
                    System.out.print("*");
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
