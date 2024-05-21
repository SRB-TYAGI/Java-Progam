public class x_ki_power {
    public static int power(int x,int n){
        if (x==1){
            return 1;
        }
        if(n==0){
            return 1;
        }
        return ((int) Math.pow(x,n));
    }
    public static void main(String args[]){
        int x=2;
        int n=3;
        System.out.println(power(x,n));
    }
}
