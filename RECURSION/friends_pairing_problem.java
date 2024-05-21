public class friends_pairing_problem {
    public static int friends(int n){
        if (n==1 || n==2){
            return n;

        }
        return friends(n-1)+((n-1)*friends(n-2));
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(friends(n));
    }
}
