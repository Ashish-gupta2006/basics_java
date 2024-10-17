
//   bubble sorting methodes

public class BubbleSorting {
    public static void main(String [] args){
        System.out.println("hello");
     int [] arr ={68,75,96,91,80,23,18};
for(int i=0 ;i < arr.length ; i++){
    int tem;
    for(int j=i+1 ;j < arr.length ;j++){
        if(arr[i] > arr[j]){
            tem=arr[i];
            arr[i]=arr[j];
            arr[j]=tem;
          }
      }
    }
    for(int i =0 ; i<arr.length ; i++){
        System.err.print( arr[i]+ "\t");
    }
}
}