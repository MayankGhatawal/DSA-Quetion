import java.util.Scanner;

public class Countevenandoddnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        EvenOdd(numbers);

        sc.close();
    }

    public static void EvenOdd(int numbers[]) {
        int evenSum = 0, oddSum = 0;
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
                evenCount++;
            } else {
                oddSum += numbers[i];
                oddCount++;
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Count of Even Numbers: " + evenCount);
        System.out.println("Sum of Odd Numbers: " + oddSum);
        System.out.println("Count of Odd Numbers: " + oddCount);
    }
}
