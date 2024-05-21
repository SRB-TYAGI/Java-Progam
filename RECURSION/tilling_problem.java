public class tilling_problem {
    public static int tiles(int n){
        if (n==0){
            return 1;
        }
            // horizontally
            int fm1=tiles(n-2);
            // vertically
            int fm2=tiles(n-1);
            return fm1+fm2;
    }
    public static void main(String args[]){
        System.out.println(tiles(3));
    }
}
