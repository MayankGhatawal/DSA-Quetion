import java.util.Scanner;

public class SumofAllElement {
    public static int Sum(int numbers[]) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int sumOfArray = Sum(numbers);
        System.out.println("Here is the Sum of total number in Array Elements: " + sumOfArray);

        sc.close();
    }
}
