public class SelectionSort2{

    public static void SelectionSort(int nums[]) {
        for(int i=0;i<nums.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
    }
}