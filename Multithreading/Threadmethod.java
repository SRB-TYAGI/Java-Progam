public class Threadmethod {
    public static void main(String args []){
        A thread1=new A();
        B thread2=new B();
        C thread3=new C();
        System.out.println("Thread A is being Started ......");
        try{
            thread1.start();
        }
        catch(exception e){
            System.out.println(e);
        }
        
    }
}

 class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            if (i==1)
            try{
                yield();
            }
            catch(exception e){
                System.out.println(e);
            }
                
                System.out.println("\n from Thread a:i="+i);
        }
        System.out.println("End of Thread B");
    }
 }
 class B extends Thread{
    public void run(){
        for (int j=1;j<=5;j++){
            if (j==3)
            try{
                Stop();
            }
            catch (exception e){
                System.out.println(e);
            }
            System.out.println("\n from Thread B: j"+j);
        }
        System.out.println("End of thread:");
    }
 }
 class C extends Thread{
    public void run(){
        for (int k=1;k<=5;k++){
            System.out.println("\n from Thread C: K="+k);
            if  (k==1)
            try{
                sleep(1000);
            }
            catch(exception  e){
                System.out.println(e);

            }
        }
        System.out.println("End of Thread C:");
    }
 }