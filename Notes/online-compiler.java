// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void bubbleSort(int [] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Printing Sorted elements");
        int [] arr= {5,3,8,4,2};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}