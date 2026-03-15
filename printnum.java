public class printnum {
    public static void main(String[] args) {
        double x = 10.9;

        // Print the original value
        System.out.println("Original value: " + x);

        // Subtract 6
        x = x - 6;
        System.out.println("After subtraction: " + x);

        // Multiply by 6
        x = x * 6;
        System.out.println("After multiplication: " + x);

        // Add 100
        x = x + 100;
        System.out.println("After addition: " + x);

        // Divide by 100
        x = x / 100;
        System.out.println("After division: " + x);

        // Modulo by 4
        x = x % 4;
        System.out.println("After modulo: " + x);
    }
}
