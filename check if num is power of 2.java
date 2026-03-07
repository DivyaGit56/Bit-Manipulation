public class checkIfnumPowOf2 {
    public static void main(String[] args) {
        int n = 32;
        if((n&n-1) == 0){
            System.out.println("Yes ," + n + " " + " is power of 2.");
        }else{
            System.out.println("No ," + n + " " + " is not power of 2.");
        }
    }
}
