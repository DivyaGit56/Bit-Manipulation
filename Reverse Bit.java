class Solution {
    public int reverseBits(int n) {
        if(n==0)return 0;
        int res = 0;
        for(int i=1;i<=32;i++){
            res <<=1;                //give left shift to result
            res = (res|(n&1));       //n&1 check n have 0 or 1
            n>>=1;                   //give right shift to number
        
        }
        return res;
    }
}
