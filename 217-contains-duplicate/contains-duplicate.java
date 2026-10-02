import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1){
            return false;
        }
    HashMap<Integer,Boolean> map = new HashMap<>();
    map.put(nums[0],true);
    for(int i=1 ;i<nums.length ; i++){
        if(map.containsKey(nums[i])){
            return true;
        }else{
            map.put(nums[i],true);
        }
    }
    return false;
    }
}