/*
TC - O(n^3)
Brute Force

Problem: Subarrays and their Maximum Sum 🧐

An array is a collection of elements, but what about its subarrays? A subarray is a contiguous part of an array. For an array of size n, there are a total of n(n+1)/2 possible subarrays.

Consider an integer array. Your task is to:

Generate and print all possible subarrays.

For each subarray, calculate and print its sum.

Keep track of the maximum sum found across all subarrays and print it at the end.

Example Input:
int[] numbers = {2, 4, 6, 8, 10};

Expected Output (Partial):
(Subarray: [2], Sum: 2)
(Subarray: [2, 4], Sum: 6)
(Subarray: [2, 4, 6], Sum: 12)
...and so on for all 15 subarrays.

Final output should include:
Total number of subarrays: 15
Maximum subarray sum: 30 (from the entire array [2, 4, 6, 8, 10]) */

public class SubarraysSum {

    public static void printSubarrays (int numbers[]) {
        int ts = 0;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i ; j < numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum+k;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The number of total subarrays : " + ts);
        System.out.println("Total sum of subarray = "+ sum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }
}
