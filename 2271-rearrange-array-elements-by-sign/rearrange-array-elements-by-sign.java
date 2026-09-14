class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> positive_list = new ArrayList<>();
        List<Integer> negative_list = new ArrayList<>(); 
        for(int i=0 ;i<nums.length;i++){
            if(nums[i]>=0){
                positive_list.add(nums[i]);
            }else{
                negative_list.add(nums[i]);
            }
        }
        int i=0;
        int k=0;
        while(i<positive_list.size()){
            nums[k]=positive_list.get(i);
            k++;
            nums[k]=negative_list.get(i);
            k++;
            i++;
        }
        return nums;
    }
}