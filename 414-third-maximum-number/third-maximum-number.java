class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Stack<Integer> st = new Stack<>();
        int i=0;
        while(i<nums.length){
           int num = nums[i];
            if(!st.contains(num)){
                st.push(num);
                Collections.sort(st);
                if(st.size()>3){
                    st.remove(0);
                }
                
            }
              i++;
        }
        if(st.size()<3){
                return Collections.max(st);
        }
        
        return st.get(0);
    }
}