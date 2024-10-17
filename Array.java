
// print to aaray element  
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        System.out.print("Enter  number : ");
        for (int i = 0; i < 10; i++) {
            array1[i] = sc.nextInt();
        }
        // for each loop
        // for(int i:array1){
        // System.out.print( ","+i);
        // }

        // for loop
    System.out.println("out put is: ");
        for (int count = 0; count < array1.length; count++) {
            System.out.println(array1[count]);
        }
    }
}
