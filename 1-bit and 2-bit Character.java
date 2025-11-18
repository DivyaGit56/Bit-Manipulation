class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0;
        while(i<n-1){
        if(bits[i] == 1){
            i += 2; // skip one bit beacause its second char(include two bit)
        }else{
            i++;
        }
        }
        if(i == n-1)return true;
        else 
       return false;
        
    }
}


// APPROACH-2

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int count1 = 0;
        for(int i = n-2;i>=0 && bits[i] == 1; i--){
            count1++;

        }
        return(count1%2 == 0)?true:false;

    }
}
