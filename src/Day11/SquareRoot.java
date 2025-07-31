package Day11;

public class SquareRoot {
    public static double findSquareRoot(double number) {
        double guess = number / 2;
        double epsilon = 0.00001; // precision level

        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2;
        }

        return guess;
    }

    public static void main(String[] args) {
        double number = 25;
        System.out.println("Square root of " + number + " is: " + findSquareRoot(number));
    }
}