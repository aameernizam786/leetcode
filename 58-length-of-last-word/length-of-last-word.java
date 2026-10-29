class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int count=0;
        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i)==' '){
                if(count>0){
                  length=count;
                }
                count=0;
            }else{
              count++;
            }
            
        }
        return count>0?count:length;
    }
}