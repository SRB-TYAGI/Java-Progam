public class print_num_1_n {
    public static void priincnum(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        priincnum(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String args[]){
        int n=5;
        priincnum(n);
    }
}
