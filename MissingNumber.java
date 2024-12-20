
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int arraySum = 0;

        // Calculate the sum of the array elements
        for (int num : nums) {
            arraySum += num;
        }

        // Missing number is the difference
        return totalSum - arraySum;
    }
	    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
       System.out.println(missingNumber(nums)); 
    }
}