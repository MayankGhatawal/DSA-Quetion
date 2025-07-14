import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take size input
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Initialize array
        int[] numbers = new int[n];

        // Take array elements as input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Reverse the array
        reverseArray(numbers);

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
