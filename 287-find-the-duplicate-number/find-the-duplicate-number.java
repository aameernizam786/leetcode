class Solution {
    public int findDuplicate(int[] nums) {
    //    HashMap<Integer,Integer> map = new HashMap<>();
    //    map.put(nums[0],1);
    //    int val=-1;
    //    for(int i=1 ;i< nums.length ; i++){
    //        if(!map.containsKey(nums[i])){
    //          map.put(nums[i],1);
    //        }else{
    //           val=nums[i];
    //           break;
    //        }
    //    }
    //    return val;
    int maximum=Integer.MIN_VALUE;
    for(int i=0 ; i< nums.length ; i++){
        maximum=Math.max(maximum,nums[i]);
    }
    int temp[]=new int[maximum+1];
    for(int i=0 ; i<nums.length ; i++){
        temp[nums[i]]++;
    }
    int i=0;
    int val=-1;
    while(i<temp.length){
        if(temp[i]>1){
            val=i;
        }
        i++;
    }
    return val;
    }
}