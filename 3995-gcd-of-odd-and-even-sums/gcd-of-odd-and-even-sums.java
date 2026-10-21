class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=sumOdd(n);
        int b=sumEven(n);
        return gcd(a,b);
        // while(b!=0){
        //     int rem=a%b;
        //     a=b;
        //     b=rem;
        // }
        // return a;
    }
    public int sumOdd(int n){
       int j=1;
        int sum=0;
        for(int i=0;i<n ; i++){
            sum+=j;
           j+=2;
        }
       return sum;
    }
    public int sumEven(int n){
        int k=2;
        int sum=0;
        for(int i=0 ; i<n ; i++){
            sum+=k;
            k+=2;
        } 
        return sum;
    }
    public int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}