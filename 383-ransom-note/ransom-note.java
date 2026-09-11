import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine){

      int isMap[]=new int[26];
      for(int i=0 ; i<magazine.length();i++){
        isMap[magazine.charAt(i) - 'a']++;
      }
       for(int i=0 ; i<ransomNote.length();i++){
        int idx=ransomNote.charAt(i)-'a';
        isMap[idx]--;
        if(isMap[idx]<0){
            return false;
        }
      }
      return true;
    }
}