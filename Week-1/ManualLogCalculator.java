import java.util.Scanner;

public class ManualLogCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        // Validation
        if (number <= 0 || base <= 1) {
            System.out.println("Invalid input. Number must be > 0 and base > 1.");
            return;
        }

        int count = 0;
        int temp = number;

        // Repeated division
        while (temp > 1) {
            if (temp % base != 0) {
                System.out.println("The number is not a perfect power of the base.");
                return;
            }
            temp = temp / base;
            count++;
        }

        // Output
        System.out.println("log base " + base + " of " + number + " = " + count);
    }
}
