import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int index = 0; 

        // Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num; // Place non-zero at the next available position
            }
        }

        // Fill remaining positions with zeroes
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than zero!");
            
        }

        int[] nums = new int[n];

        // Taking user input for array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close(); // Close scanner

        // Move zeroes to the end
        moveZeroes(nums);

        // Print the modified array
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
