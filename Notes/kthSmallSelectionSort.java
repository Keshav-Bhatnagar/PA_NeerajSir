// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SelectionSort {
    public static void SelectionSort(int [] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                    int temp= arr[i];
                    arr[i]=arr[min];
                    arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Printing Sorted elements");
        int [] arr= {5,3,8,4,2};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int k=3;
        System.out.print("k element "+arr[k-1]);

    }
}