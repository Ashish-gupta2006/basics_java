//  print sum of given series e.g 1-2+3-4+5----

// import java.util.Scanner;

public class SeriesSum {   
  
    public static void main(String [] args){
       
       int sum = 0;
       int odd = 0;
   int [] series={1,3,5,7,9,-2,-4,-6,-8,-10,11,-12,13};
       for(int i=0; i<series.length; i++){
        if(series[i]%2==0){
            sum=sum+series[i];
        }
        else{
            odd=odd+series[i];
        }
       }
       System.out.println("resut of series : "+(sum+odd));
    }
}
