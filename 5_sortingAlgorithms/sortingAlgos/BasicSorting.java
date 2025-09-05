
public class BasicSorting {

    //Bubble sort
    public static void Bubble(int nums[]) {
        for(int turn=0;turn<nums.length-1;turn++) {
            for(int j=0;j<nums.length-1-turn;j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        PrintArr(nums);
    }

    // Print Arrays
    public static void PrintArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Selection sort

    public static void SelectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int minPos = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j; 
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        PrintArr(arr);
    }

    public static void IntertinSort(int nums[]) {
        for(int i=1;i < nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            //finding out correct position to insert
            while(prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev] ;
                prev--;
            }
        //Insertion
        nums[prev+1] = curr;
        }
        PrintArr(nums);
    }

    // Main MethodS
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // Bubble(arr); 
        // SelectionSort(arr);
        IntertinSort(arr);
    }
}