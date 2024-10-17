
// prin first multiple of 5 which is also multiple of 7
import java.util.Scanner;

public class MultipleOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if ((num % 5 == 0) && (num % 7 == 0)) {
            System.out.println(num + " is multiple of 5 and 7");
        } 
        else  while ((num % 5 != 0) || (num % 7 != 0)) {
            
                System.out.print("your enter number is not multiple of 5 and 7 ,so enter number");
                num = sc.nextInt();
            }

        
        System.out.println(num + " is multiple of 5 and 7 ");
    }
}
