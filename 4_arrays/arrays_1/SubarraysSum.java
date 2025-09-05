// TC - O(n^3)
//Brute Force

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
