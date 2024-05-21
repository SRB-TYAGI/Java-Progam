public class print_sum_n_natural {
//     public static void sum(int n){
//         if (n==1){
//            System.out.print(1+" ");
//            return ;
//         }
//         sum(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String args[]){
//         int n=20;
//         sum(n);
//     }
// }
   public static int sum(int n){
    if(n==1){
        return 1;
    }
    
    return sum(n-1);
    // System.out.print(n+" ");
   }
   public static void main(String args[]){
    int n=5;
    System.out.println(sum(n));
    
}
}