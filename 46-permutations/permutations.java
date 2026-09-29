class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        per(list,nums,0,nums.length-1);
        return list;


    }
    public void per( List<List<Integer>> list , int nums[] ,int si,int ei){
        if(si==ei){
             ArrayList<Integer> li = new ArrayList<>();
            for(int i=0 ;i<nums.length; i++){
                  li.add(nums[i]);
            }
           list.add(li);
           return;
        }
        for(int i=si ;i<=ei ; i++){
            swap(nums,si,i);
            per(list,nums,si+1,ei);
            swap(nums,si,i);
        }
    }
    public void swap(int nums[],int si,int ei){
        int temp=nums[si];
        nums[si]=nums[ei];
        nums[ei]=temp;
    }
}