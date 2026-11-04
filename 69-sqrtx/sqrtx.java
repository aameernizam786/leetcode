import java.util.*;
class Solution {
    public int mySqrt(int x) {
       if(x<2){
        return x;
       }
       int st=1;
       int en=x/2;
       int ans=0;
       while(st<=en){
        int mid = st+(en-st)/2;
        if(mid<=x/mid){
            ans=mid;
            st=mid+1;
        }else{
            en=mid-1;
        }
       }
       return ans;
    }
}