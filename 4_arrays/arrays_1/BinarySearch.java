public class BinarySearch {

    public static int binarysearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end){
            int mid = (start+end) / 2 ;

            // comparisons
            if(numbers[mid] == key){ // found condition
                return mid;
            }
            if(numbers[mid] < key){ // right condition
                start = mid + 1;
            }
            if(numbers[mid] > key){ // left condition
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key =10;

        System.out.println("Key found at index : "+ binarysearch(numbers, key));
    }
}
