
// print  if value is even and diviable int 3
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int number = sc.nextInt();
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number);
        }

    }
}
