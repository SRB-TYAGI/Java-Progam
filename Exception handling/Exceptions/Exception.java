package Exceptions;
public class Exception{
    public static int fact(int n){
        public static int divide(int a ,int b) throw DivideByZeroException{
            if (b==0){
                throw new DivideByZeroException();
            }
            return a/b;
        }
        public static void main(String args []){
            try {
                divide (10,0);
                System.out.println("with in try");
            }
            catch( DivideByZeroException){
                System.out.println("Divide by zero exception raised");
            }
            System.out.println("main");
        }
               
            }

        }
    }