/*
 *You are given an integer array nums. Your task is to find a contiguous subarray (containing at least one number) which has the largest sum and return its sum. A contiguous subarray is a sequence of elements that are adjacent in the original array.

For example, in the array [1, 2, -1, 4], the subarray [1, 2, -1, 4] has a sum of 6, while the subarray [1, 2] has a sum of 3.

Example
Input: nums = [-2, -3, 4, -1, -2, 1, 5, -3]

Output: 7

Explanation: The contiguous subarray [4, -1, -2, 1, 5] has the largest sum of 4−1−2+1+5=7.
 */

// Kadanes Algorithm

public class MaxSubarrayKadanes {

    public static void Kadanes(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i < nums.length;i++) {
            currSum = currSum + nums[i];
            if(currSum < 0) {
                currSum =0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our maximum subarray sum is " + maxSum);
    }
    
    public static void main(String[] args) {        
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        Kadanes(arr);
    }
}
