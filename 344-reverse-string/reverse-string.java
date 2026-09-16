class Solution {
    public void reverseString(char[] s) {
        int f_idx=0;
        int l_idx=s.length-1;
        while(f_idx<=l_idx){
            char temp=s[f_idx];
            s[f_idx]=s[l_idx];
            s[l_idx]=temp;
            f_idx++;
            l_idx--;
        }
    }
}