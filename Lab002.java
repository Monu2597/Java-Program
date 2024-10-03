package Oct.ex_03102024;

public class Multiply {
    public static void main(String[] args) {
        int number = 10; // The number for which we want the multiplication table

        System.out.println("Multiplication Table of 10:");
        for (int i = 1; i <= 10; i++) {
            int result = number * i; // Calculate the product
            System.out.println(number + " x " + i + " = " + result); // Print the result
        }
    }


}
