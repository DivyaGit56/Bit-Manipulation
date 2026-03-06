class Solution {
    static void bitManipulation(int num, int i) {
        
        int getBit = (num >> (i - 1)) & 1;
        int setBit = num | (1 << (i - 1));
        int clearBit = num & ~(1 << (i - 1));
        
        System.out.print(getBit + " " + setBit + " " + clearBit);
    }
}
