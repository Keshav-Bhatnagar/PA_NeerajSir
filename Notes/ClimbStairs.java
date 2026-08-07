// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int climb(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        int first =1;
        int second=2;
        for(int i=3;i<=n;i++){
            int curr= first + second;
            first=second;
            second=curr;
        }
        return second;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Stair ");
        int n = sc.nextInt();
        System.out.print("Total Ways "+ climb(n));
        sc.close();

    }
}