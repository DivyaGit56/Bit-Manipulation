public class cntSetBit {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;  // right shift by 1 bit. It will divide the number by 2 and remove the last bit.
        }
        System.out.println("Total set bits in given number is : " + count);
    }
    
}
