public class digits {
   static String digit[]={"zero","one","two","three","three","four","five","six","seven","eight","nine"};
    public static void printdigits(int num){
        if (num==0){
            return;
        }
        int lastdigit=num%10;
        printdigits(num/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main (String args[]){
        printdigits(123);
    }
}
