import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // System.out.print("enter first number :");
        Scanner sc = new Scanner(System.in);
        // takinr to integer input
        int num1 = sc.nextInt();
        System.out.print("enter first number :");
        int num2 = sc.nextInt();
        int Addition = num1 + num2;
        System.out.println("Sum of two number :" + Addition);

        // taking to input string with out spacing
       // System.out.println("Enter your name :");
        // String name = sc.next();
        //  System.out.println("your name is :"+name);

          // takinr to input string with  spacing
        //   System.out.println("Enter your  full name :");
        // String fullName = sc.nextLine();
        // System.out.println("your  full  name is :"+fullName);

        float salary= sc.nextFloat();
       System.out.println("enter your salary is:"+salary);
    }
}
