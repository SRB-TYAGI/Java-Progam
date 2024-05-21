public class optimize_power {
    public static int optimizedpower(int a,int n){
       
        if(n==0){
            return 1;
        }
        int optimize=optimizedpower(a,n/2)*optimizedpower(a,n/2);
        if(n%2!=0){
            return a*optimize;
        }
        return optimize;
    }
    public static void main(String args[]){
        int a=2;
        int n=5;
        System.out.println(optimizedpower(2,3));
    }
}
