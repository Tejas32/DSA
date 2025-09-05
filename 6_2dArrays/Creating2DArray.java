import java.util.*;

public class Creating2DArray {
    public static void main(String[] args) {
        int matrix [][] = new int[3][3]; //creating a 2D Matrix

        int n = matrix.length; //number of rows
        int m = matrix[0].length; //number of columns

        Scanner sc = new Scanner(System.in);

        // InputValues

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output values
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

     }
}