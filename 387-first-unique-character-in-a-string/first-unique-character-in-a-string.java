class Solution {
    public int firstUniqChar(String s) {
        int temp[]=new int[26];
        for(int i=0;i<s.length(); i++){
                temp[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length();i++){
            int idx=s.charAt(i)-'a';
            if(temp[idx]==1){
                return i;
            }
        }
        return -1;
    }
}