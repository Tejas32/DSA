public class BubbleSort {

    public static void bubbleSort(int nums[]) {
        int swaps = 0;
        for(int i=0;i<nums.length-1; i++){
            for(int j=0;j<nums.length-1-i;j++) {
                if(nums[j] > nums[j+1]) {
                    //swap
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    swaps++;
                }
                if(swaps == 0){
                    break;
                } else {
                    continue;
                }
            }
        }
        for(int i=0; i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(swaps);
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
    }
}
