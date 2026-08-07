// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MinCostClimbStairs {
    public static int solve(int [] cost,int index){
        if(index>=cost.length)return 0;
        return cost[index]+Math.min(solve(cost,index+1),solve(cost,index+2));
    }
    public static int minCost(int [] cost){
        return Math.min(solve(cost,0),solve(cost,1));
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Stair ");
        int n = sc.nextInt();
        int [] cost =new int[n];
         System.out.print("Enter no. of cost ");
         for(int i =0;i<n ;i++){
             cost[i]=sc.nextInt();
         }
        System.out.print("Total min Cost "+ minCost(cost));
        sc.close();

    }
}