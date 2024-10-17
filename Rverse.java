
//  reverse  the digits of given number 
//  this not appile to the lat zero digits e.g 100 or 200 

import java.util.Scanner;

public class Rverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number : ");
        int number = sc.nextInt();   //red to input data 
        int reverse = 0;
        while (number > 0) {
            int x = number % 10;
            reverse = (reverse * 10) + x;
            number = number / 10;
        }
        System.out.println(" Reverse is : " + reverse);
    }
}
