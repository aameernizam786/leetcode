class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int nG[]=new int[nums2.length];
       Stack<Integer> s=new Stack<>();
       for(int i=nums2.length-1; i>=0;i--){
        int curr=nums2[i];
        while(!s.isEmpty() && curr>=nums2[s.peek()]){
            s.pop();
        }
        if(s.isEmpty()){
            nG[i]=-1;
        }else{
            nG[i]=nums2[s.peek()];
        }
        s.push(i);
       } 
       int ans[]=new int[nums1.length];
       int j=0;
       for( int i=0 ;i<nums1.length ; i++){
        int curr=nums1[i];
           while(curr!=nums2[j]){
            j++;
           }
           ans[i]=nG[j];
           j=0;
       }
       return ans;
    }
}