class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0 ; i<strs.length; i++){
            String curr=strs[i];
            char[] sort=curr.toCharArray();
            Arrays.sort(sort);
            String newstr=new String(sort);
            if(!map.containsKey(newstr)){
              map.put(newstr,new ArrayList<>());
            }
            map.get(newstr).add(strs[i]);
        }
        list.addAll(map.values());
        return list;
    }
}