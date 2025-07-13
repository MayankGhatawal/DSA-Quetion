import java.util.Scanner;

public class LargestNumberofArray {

    public static int LargestNumber(int[] number) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int result = LargestNumber(number);
        System.out.println("The Largest Value of the Array is: " + result);
    }
}
