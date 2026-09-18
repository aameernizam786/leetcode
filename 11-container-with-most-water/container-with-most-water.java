class Solution {
    public int maxArea(int[] height) {
        int maximum=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int height_Water=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int max_Water=height_Water*width;
            maximum=Math.max(maximum,max_Water);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        // for(int i=0 ; i<height.length-1 ; i++){
        //     for(int j=i+1 ;j<height.length ; j++){
        //         int height_Water=Math.min(height[i],height[j]);
        //         int width=j-i;
        //         int max_Water=height_Water*width;
        //         maximum=Math.max(maximum,max_Water);
        //     }
        // }
        return maximum;
    }
}