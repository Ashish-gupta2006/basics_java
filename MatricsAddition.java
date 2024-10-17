// matrics addition
import java.util.Scanner;
public class MatricsAddition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int k,l;    // k variable store to the row and l variable store to the column of matrics
        System.out.print("Enter row of matrics :");
        k=sc.nextInt();
        System.out.print("Enter column of matrics :");
        l=sc.nextInt();
        int [][] a =  new int [k][l];
        int [][] b = new int [k][l];
        int [][] c = new int [k][l];
        System.out.println("Enter the  element of first matrics :");
        for(int i = 0; i< a.length ; i++){
            for(int j=0 ;j < a[i].length ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the  element of second matrics :");
        for(int i = 0; i< b.length ; i++){
            for(int j=0 ; j < b[i].length ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("add of two matrics :");
        for(int i = 0; i< c.length ; i++){
            for(int j=0 ;j < c[i].length ; j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
