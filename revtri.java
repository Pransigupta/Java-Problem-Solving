import java .util.Scanner;
public class revtri {
    public static void main(String[] args) {
    
        Scanner Sc= new Scanner (System.in);
        int n =Sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>n ) System.out.print("* ");
                else System.out.print(" ");

    }
    System.out.println();
}
    }
}
