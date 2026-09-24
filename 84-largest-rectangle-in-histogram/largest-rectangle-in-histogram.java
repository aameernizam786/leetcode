class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==1){
            return heights[0];
        }
      int rSmall[]=new int[heights.length];
      //rSmall[heights.length-1]=heights.length;
      Stack<Integer> sc = new Stack<>();
      for(int i=heights.length-1 ; i>=0 ;i--){
        while(!sc.isEmpty() && heights[i]<=heights[sc.peek()]){
            sc.pop();
        }
        if(sc.isEmpty()){
            rSmall[i]=heights.length;
        }else{
            rSmall[i]=sc.peek();
        }
            sc.push(i);
        } 
        int lSmall[]=new int[heights.length];
         Stack<Integer> s = new Stack<>();
        for(int i=0 ;i<heights.length ;i++){
            while(!s.isEmpty() &&  heights[i]<=heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                lSmall[i]=-1;
            }else{
                lSmall[i]=s.peek();
            }
            s.push(i);
        } 
        int maxArea=Integer.MIN_VALUE;
        for(int i=0 ;i<heights.length ; i++){
            int width=rSmall[i]-lSmall[i]-1;
            int area=heights[i]*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}