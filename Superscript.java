// finding a raised to power b
import java.util.Scanner;
 public class Superscript {
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.print(" enter number ");
int a = sc.nextInt();
System.out.print(" enter number ");
int b = sc.nextInt();
int power =1;
for(int i =0 ;i<b ;i++){
power = power *a;
}
System.out.println("b is superscript of a  :"+ power);


}

}
