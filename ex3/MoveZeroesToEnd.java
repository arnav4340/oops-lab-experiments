import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int index = 0; 

        
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num; 
            }
        }

        
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than zero!");
            
        }

        int[] nums = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        scanner.close(); 

        
        moveZeroes(nums);

        
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
