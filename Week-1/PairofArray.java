import java.util.Scanner;

public class PairofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("All unique pairs:");
        printPairs(numbers);

        scanner.close();
    }

    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int currentValue = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("( " + currentValue + ", " + numbers[j] + " ) ");
            }
            System.out.println();
        }
    }
}
