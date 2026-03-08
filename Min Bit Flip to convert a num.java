public class MinBitflip {
    public static void main(String[] args) {
        int a = 10; // 1010 in binary
        int b = 20; // 10100 in binary
        int xor = a ^ b; // XOR will give us the bits that are different between a and b
        int count = 0;
        while(xor > 0){
            if((xor & 1) == 1){ // Check if the last bit is set
                count++;
            }
            xor = xor >> 1; // Right shift to check the next bit
        }
        System.out.println("Minimum number of bits to flip to convert " + a + " to " + b + " is : " + count);
    }
    
}
