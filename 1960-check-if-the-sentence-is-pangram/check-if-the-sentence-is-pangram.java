class Solution {
    public boolean checkIfPangram(String sentence) {
     char  map[]=new char[26];
      for(int i=0 ;i<26 ; i++){
           map[i]='f';                        
      }
      int i=0;
     while(i<sentence.length()) {
             char ch=sentence.charAt(i);
             if(map[ch-'a']== 't'){
                i++;
             }else{
                map[ch-'a']='t';
                i++;
             }
      } 
      for(int k=0 ;k<26 ; k++){
        if(map[k] != 't'){
            return false;
        }
      } 
      return true;
    }
}