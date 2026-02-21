import java.util.*;

class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        HashSet<Integer> set = new HashSet<>(
            Arrays.asList(2,3,5,7,11,13,17,19)
        );
        
        int result = 0;
        
        for(int num = left; num <= right; num++){
            
            int setBits = Integer.bitCount(num);
            
            if(set.contains(setBits)){
                result++;
            }
        }
        
        return result;
    }
}
