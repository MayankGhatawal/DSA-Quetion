import java.util.Scanner;
import java.util.Arrays;

public class TwoSumWithoutHashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = scanner.nextInt();

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No two sum solution found.");
        }

        scanner.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
