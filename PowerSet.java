public class powerSet {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        // Total number of subsets is 2^n
        int totalSubsets = 1<<n; // This is equivalent to 2^n
        for(int i=0; i<totalSubsets; i++){
            ArrayList<Integer> subset = new ArrayList<>();
            for(int j=0; j<n; j++){
                // Check if the j-th bit in i is set. If it is set, include arr[j] in the current subset.
                if((i & (1<<j)) > 0){
                    subset.add(arr[j]);
                }
            }
            ans.add(subset);
        }
        System.out.println(ans);
    }
}
