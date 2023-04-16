import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int m = input.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int n = input.nextInt();
        
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        
        System.out.println("Enter the elements of the first matrix: ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix: ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
            }
        }
        
        int[][] c = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        System.out.println("The sum of the two matrices is: ");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}
