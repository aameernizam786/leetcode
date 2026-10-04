class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        return totalWays(n,arr);
    }
    public int totalWays(int n , int arr[]){
        if(n==1 || n==0){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(arr[n]!=0){
            return arr[n];
        }
     arr[n] = totalWays(n-1,arr) + totalWays(n-2,arr);
     return arr[n];
    }
}