
    //   Count the number of digits for a given number n

import java.util.Scanner;
public class CounDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for counting to digits");
        int num =sc.nextInt();
      int count = 0;
while( num > 0){
    num/=10;  // num=num/10;
  count++;
}
System.out.println(count+" digits of enter number");
    }
}
