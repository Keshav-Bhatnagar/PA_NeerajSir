class Solution {
    public boolean threeFibonacciSum(int n) {
        int n1 =0;
        int n2=1;
        int n3=n1+n2;
        while(n3<=n){
            int sum = n1+n2+n3;
            if(sum==n) return true;
            n1=n2;
            n2=n3;
            n3=n1+n2;
        }
        return false;
    }
}