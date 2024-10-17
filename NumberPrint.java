import java.util.Scanner;

class NumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ,where want tom print ");
        int count = sc.nextInt();
        int i = 1;
        while (i <= count) {
            System.out.println(i);
            i++;
        }
    }
}