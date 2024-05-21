// public class decnum {
//     public static void printdecnum(int n){
//         if (n==1){
//             System.out.print(n);
//             return;
//         }
//         System.out.print(n+" ");
//         printdecnum(n-1);
//     }
//     public static void main(String args[]){
//         int n=10;
//         printdecnum(n);
//     }
// }

public class decnum{
    public static int printdecnum(int n){
        if (n==1){
            return 1;
        }
         System.out.print(n+" ") ;
        return printdecnum(n-1);
    }
    public static void main(String args[]){
        int n=10;
        System.out.print(printdecnum(n));
    }
}