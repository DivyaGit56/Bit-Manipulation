package String_Recursion.level3;

public class iterativeSubseqences {
    public static void printSubseq(String s){
        int n = s.length();
        int totalSubseq = 1<<n;

        for(int i = 0; i<totalSubseq; i++){
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j<n;j++ ){
                // check if jth bit is set
                // 0->exclude, 1->include
                if((i&(1<<j)) != 0){
                    sb.append(s.charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
        
    }
    public static void main(String []args){
        printSubseq("Div");
    }
    
}
