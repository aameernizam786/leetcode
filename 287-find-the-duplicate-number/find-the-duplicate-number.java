class Solution {
    public int findDuplicate(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(nums[0],1);
       int val=-1;
       for(int i=1 ;i< nums.length ; i++){
           if(!map.containsKey(nums[i])){
             map.put(nums[i],1);
           }else{
              val=nums[i];
              break;
           }
       }
       return val;
    }
}