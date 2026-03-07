public class RemoveLastSetBit {
    public static void main(String[] args){
        int n = 84;

        n = n&n-1;
        System.out.println("After removing last set bit from rightmost, n is" +" "+ n);

    }
    
}
