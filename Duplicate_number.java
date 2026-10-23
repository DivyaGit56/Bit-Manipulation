class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // find intersection
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);


        // find duplicat(intersection is not necessary duplicate number in all cases)

        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];

        }
        return slow;
    }
}
