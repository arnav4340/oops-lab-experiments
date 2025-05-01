import java.util.Scanner;  

public class MinMaxFinder {
    public static int[] findMinMax(int[] nums) {
        if (nums.length == 0) {
            System.out.println("Array cannot be empty");
        }

        int max = nums[0]; 
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num; 
            }
            if (num < min) {
                min = num; 
            }
        }
        
        return new int[]{max, min}; 
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

        int[] result = findMinMax(nums); 
        System.out.println("Max: " + result[0] + ", Min: " + result[1]); 
    }
}
