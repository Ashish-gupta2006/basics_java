// print to day name usinr to switch statement
import java.util.Scanner;
class Day{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter day number and print to day name : ");
    int dayNumber =sc.nextInt();
    switch (dayNumber) {
        case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thusday");
            break;
            case 6:
            System.out.println("Fridaty");
            break;
            case 7:
            System.out.println("saturay");
            break;
        default:
        System.out.println(" you  not enter right day number ");
            break;
    }
}
}