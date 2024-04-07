import java.util.*;
public class Swap_two_number{
    public static void Swap(ArrayList<Integer> List,int idx1,int idx2){
            int temp=List.get(idx1);
            List.set(idx1,List.get(idx2));
            List.set(idx2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> List=new ArrayList<>();
             List.add(2);
             List.add(5);
             List.add(9);
             List.add(3);
             List.add(6);
             System.out.println(List);
             int idx1=1;
             int idx2=2;
             Swap(List,idx1,idx2);
             System.out.println(List);
    }
}