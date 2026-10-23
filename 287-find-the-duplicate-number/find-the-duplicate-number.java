class Solution {
    public int findDuplicate(int[] nums) {
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