import java.util.*;

// Largest and Smallest in Matrix

public class LargestSmallest {

    public static void Largest(int arr[][]) {
        int largest = arr[0][0];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest : " + largest);
    }

    public static void smallest(int arr[][]) {
        int smallest = arr[0][0];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                 if(arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Smallest : " + smallest);
    }

       

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            } 
        }
        Largest(matrix);
        smallest(matrix);
    }
}
