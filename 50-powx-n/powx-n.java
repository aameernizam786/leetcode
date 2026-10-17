class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
        // long N = n;
        // if(n<0){
        //     x=1.0/x;
        //     N=-N;
        // }
        // double ans=1.0;
        // while(N>0){
        //     if(N%2 !=0){
        //        ans*=x;
        //     }
        //     x*=x;
        //     N/=2;
            
        // }
        //   return ans;
        // return power(x,N);
    }
    // public double power(double x , long n){
    //     if(n==0){
    //         return 1.0;
    //     }
    //     double half = power(x,n/2);
    //     if(n%2==0){
    //         return half*half;
    //     }
    //     return half*half*x;
    // }
}