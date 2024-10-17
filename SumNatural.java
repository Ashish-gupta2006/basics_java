// print  n  of number sum of natural number  where n is input number

import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number you want to add to number: ");
        int n = sc.nextInt();
        int add = n * (n + 1) / 2;
        System.out.print("sum is :" + add);
    }
}
