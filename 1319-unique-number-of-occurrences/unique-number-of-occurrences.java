import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
             freq.put(num, freq.getOrDefault(num, 0) + 1);
              } 
               Set<Integer> occurrences = new HashSet<>(freq.values()); 
                return occurrences.size() == freq.size();
    }
}