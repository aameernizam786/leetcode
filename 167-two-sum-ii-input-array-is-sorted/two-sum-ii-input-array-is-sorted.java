class Solution {
    public int[] twoSum(int[] num, int target) {
        int temp[]=new int[2];
        int lp=0;
        int rp=num.length-1;
        while(lp<rp){
            if(num[lp]+num[rp]==target){
                temp[0]=lp+1;
                temp[1]=rp+1;
                break;
            }
            if(num[lp]+num[rp]>target){
            rp--;
            }else{
                lp++;
            }
        }
        return temp;

    }
}