public class sum_of_natural_number {
    public static int naturalsum(int n){
        // base case
        if (n==1){
            return 1;
        }
        return naturalsum(n-1)+n;
    }
    public static void main (String args[]){
        int n=3;
        System.out.println(naturalsum(n));
    }
}
