import java.util.Scanner;

class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("enter to taken princeple:");
        float prices = sc.nextFloat();
        System.out.print("enter to time in year :");
        float time = sc.nextFloat();
        System.out.print("enter to ret of  intrest  :");
        float intrest = sc.nextFloat();
        float S = (prices * time * intrest) / 100;
        System.out.println("Simple intrest is :" + S);
    }
}