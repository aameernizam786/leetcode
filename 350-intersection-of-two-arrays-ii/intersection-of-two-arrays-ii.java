import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     List<Integer> list  = new ArrayList<>();
     Arrays.sort(nums1);
     Arrays.sort(nums2);
     if(nums1.length==1 & nums2.length==1){
        if(nums1[0]==nums2[0]){
            return nums1;
        }
     }
     int i=0;
     int j=0;
     while(i<nums1.length & j<nums2.length){
             if(nums1[i]<nums2[j]){
                i++;
             }else if(nums1[i]>nums2[j]){
                j++;
             }else{
                list.add(nums1[i]);
                i++;
                j++;
             }
     }
     int ans[]=new int[list.size()];
     for(int m=0 ; m<list.size(); m++){
        ans[m]=list.get(m);
     }
     return ans;
        
    }
}