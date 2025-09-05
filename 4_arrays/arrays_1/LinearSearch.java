public class LinearSearch{

    public static int linearsearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;
        int index = linearsearch(marks, key);
            if(index == -1){
                System.out.println("Key not found");
            } else {
                System.out.println("Key found at index : " + index);
            }
    }
}