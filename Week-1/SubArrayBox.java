import java.util.Scanner;

public class SubArrayBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }


        System.out.println("\nAll subarrays in boxes:");
        printSubArraysInBoxes(numbers);

        scanner.close();
    }

    public static void printSubArraysInBoxes(int[] numbers) {
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {

                System.out.print("+");
                for (int k = start; k <= end; k++) {
                    System.out.print("-----+");
                }
                System.out.println();

                // Print values
                System.out.print("|");
                for (int k = start; k <= end; k++) {
                    System.out.printf(" %3d |", numbers[k]);
                }
                System.out.println();

                System.out.print("+");
                for (int k = start; k <= end; k++) {
                    System.out.print("-----+");
                }
                System.out.println("\n");
            }
        }
    }
}
