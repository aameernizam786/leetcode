class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int temp[]=new int[3];
        for(int i=0;i<n ;i++){
            temp[nums[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            while(temp[i]>0){
                nums[k]=i;
                k++;
                temp[i]--;
            }
        }
    }
}