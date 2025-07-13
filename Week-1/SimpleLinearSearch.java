import java.util.Scanner;

public class SimpleLinearSearch {

    public static int linearSearch(int[] number, int target) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to enter: ");
        int size = sc.nextInt();

        int[] number = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int target = sc.nextInt();

        int index = linearSearch(number, target);

        if (index == -1) {
            System.out.println("Not Found in any Index");
        } else {
            System.out.println("The Index is: " + index);
        }
    }
}
