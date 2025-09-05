// Brute Force 

/*
 *You are given an integer array nums. Your task is to find a contiguous subarray (containing at least one number) which has the largest sum and return its sum. A contiguous subarray is a sequence of elements that are adjacent in the original array.

For example, in the array [1, 2, -1, 4], the subarray [1, 2, -1, 4] has a sum of 6, while the subarray [1, 2] has a sum of 3.

Example
Input: nums = [-2, -3, 4, -1, -2, 1, 5, -3]

Output: 7

Explanation: The contiguous subarray [4, -1, -2, 1, 5] has the largest sum of 4−1−2+1+5=7.
 */
public class MaxSubarraySum{

    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                currSum = 0; //Everytime the loop runs, the currSum value is initialized to 0.
                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k] + " "); //
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The sum of maximum subarray is : " + maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}