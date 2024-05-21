public class Fish{
    public static void main(String args[]){
        Machli shark=new Machli();
        shark.eat();
        shark.breath();
    }
}
class Animals{
    String colour;
    void eat(){
        System.out.println("eats");
    }
}
class Machli extends Animals{
    int fins;
    void breath(){
        System.out.println("breath");
    }

}