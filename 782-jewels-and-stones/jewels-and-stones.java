class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if(jewels.length()==1 && stones.length()==1){
            if(jewels.charAt(0)==stones.charAt(0)){
                return 1;
            }
        }
        int count=0;
        for(int i=0 ;i<jewels.length() ; i++){
            char ch=jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                 if(ch==stones.charAt(j)){
                    count++;
                 }
            }
        }
        return count;
    }
}