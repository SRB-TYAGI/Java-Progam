import java.util.ArrayList;
public class Array_list{
    public static void main(String args[]){
    ArrayList<Integer>List=new ArrayList<>();
    ArrayList<String>List2=new ArrayList<>();
    ArrayList<Boolean>List3=new ArrayList<>();

    List.add(1);
    List.add(2);
    List.add(3);
    List.add(4);
    List.add(5);
    List.add(6);
    System.out.println(List);

    // get element
    int element =List.get(2);
    System.out.println(element);

    // remove element in list
    
    System.out.println("After removing list");
    System.out.println(List.remove(2));

    // set element at index
    List.set(2,10);
    System.out.println(List);

    // contains element 
    System.out.println("list after using contains ");
    System.out.println(List.contains(2));
    System.out.println(List.contains(20));

    }
}