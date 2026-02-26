package Bit;
import java.util.*;
public class DeciToBinary {
    public static  void main(String[] args){
        int n  = 12;
        StringBuilder Res = new StringBuilder();

        while(n > 0){
            if(n%2 == 1){
                Res.append("1");
            }else{
                Res.append("0");
            }
            n = n/2;
            
        }
        //Res.append("1");
        System.out.println(Res.reverse());
    }
}
