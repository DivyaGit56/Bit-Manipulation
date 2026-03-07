public class ToggleithBit {
    public static void main(String[] args){
        int n = 10; // 1010
        int i = 2;

        n = n ^ (1<<i); // Toggle the ith bit using XOR operator

        System.out.println("After toggling the ith bit, n is: " + n);
    }
}
