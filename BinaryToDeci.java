package Bit;

public class BinaryToDeci {
    public static void main(String[] args){
        String s =  "110";
        int n = 0;
        int len = s.length();
        int powOf2 = 1;

        for(int i = len-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                n = n+ powOf2;

            }
            powOf2 = powOf2*2;
        }
        System.out.println(n);
    }
}
