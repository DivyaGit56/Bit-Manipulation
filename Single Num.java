package Bit;
import java.util.*;

public class SingleNum {
    public static int SingleNumber(int[]nums){
        HashMap<Integer, Integer>mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1 );
        }
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1; // This line should never be reached for valid input

    }
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        System.out.println(SingleNumber(nums));
    }
    
}
// TC = O(n) where n is the number of elements in the array
// SC = O(n) in the worst case when all elements are unique and we have to store all of them in the HashMap.

// XOR  METHOD

public class SingleNum {
    public static void main(String[] args){
        int [] nums = {2,2,1};
        int result = 0;
        for(int num: nums){
            result ^= num; // XOR operation will cancel out the duplicate numbers and leave us with the single number
        }
        System.out.println(result);
    }
}

//TC = O(n) where n is the number of elements in the array
//SC = O(1) since we are using only a constant amount of extra space for the result variable.
