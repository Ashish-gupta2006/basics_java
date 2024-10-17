//     print first n number  factorial 
import java.util.Scanner;
public class Factorial {
    public static void main(String [] args){
        System.out.println("enter number");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        System.out.print(num   +"factorial is :");  // printing to enter number
       int factorial=1;
       while( num >0){
        factorial*=num;
        num--;
       }
       System.out.print( factorial);  //calculate the factorial enter number
    }
}
