
// it program calculate the sub traction of matric 
import java.util.Scanner;

public class MatricsSubtration {
    public static void main(String[] args) {
        // creating the object of the Scanner calss
        Scanner scan = new Scanner(System.in);
        int row, column;
        // row variable store the row of matrics
        System.out.print("enter row of matrics");
        row = scan.nextInt(); 
        // column variable store the column of matrics
        System.out.print("enter column  of matrics");
        column = scan.nextInt(); 
        // declaration of matric1
        System.out.println("Enter the element of matric1");
        int[][] matric1 = new int[row][column]; 
        for (int i = 0; i < matric1.length; i++) {
            for (int j = 0; j < matric1[i].length; j++) {
                matric1[i][j] = scan.nextInt();
            }
        }

        // declaration of matric2
        System.out.println("Enter the element of matric2");
        int[][] matric2 = new int[row][column]; 
        for (int i = 0; i < matric2.length; i++) {
            for (int j = 0; j < matric2[i].length; j++) {
                matric2[i][j] = scan.nextInt();
            }
        }

         // declaration of result matrics
         int [][] result = new int[row][column];
         for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j]= matric1[i][j] - matric2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println(""); 
        }
         
    }
}
