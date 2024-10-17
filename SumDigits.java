
//  print sum of digits enter number 

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number calculating sum of digits : ");
        int num = sc.nextInt();
        int count;
        int sum = 0;
        while (num > 0) {
            count = num % 10;
            sum = sum + count;
            num = num / 10;
        }
        System.out.println("Sum of digits enter number :" + sum);
    }
}




