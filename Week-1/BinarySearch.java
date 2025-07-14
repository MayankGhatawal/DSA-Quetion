import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    public static int BinarySearchAlgo(int number[], int target){
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == target) { // FOUND
                return mid;
            }
            else if (number[mid] < target) { // Go Right
                start = mid + 1;
            } else { // Go Left
                end = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.println("Enter " + size + " sorted elements (ascending order):");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        Arrays.sort(number);

        System.out.print("Enter the number you want to search: ");
        int target = sc.nextInt();

        int index = BinarySearchAlgo(number, target);

        if (index != -1) {
            System.out.println("Finally found at index: " + index);
        } else {
            System.out.println("Number not found in the array.");
        }
    }
}
