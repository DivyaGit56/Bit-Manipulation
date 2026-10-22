class Solution {
    public int missingNumber(int[] nums) {
        
        
      // A2: Brute Force
          
        Arrays.sort(nums);
        for(int i= 0; i<nums.length; i++){
        if(i != nums[i]){
            return i;

          }
         
        }
        return nums.length;


        // A1 : BIT SOLUTION

        int ans = nums.length;

        for(int i= 0; i<nums.length; i++){
            ans = ans^i^nums[i];
        }
        return ans;
    }
}
