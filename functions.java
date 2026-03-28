//main function ko koi or calll nhi karwa skta 
//ek fxn dusre fxn ko call laga skta h 
//  main fxn sabse phele chalta h 
public class functions {
    public static void yash(){
        karan();
        System.out.println("matcha");
    }
        public static void main(String[] args) {
            priyanshi();
        }
        public static void karan(){
            System.out.println("AYAUSH");
        }
        public static void priyanshi(){
            karan();
            yash();
            System.out.println("mango");
            yash();
        }}