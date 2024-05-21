import java.util.*;
public class LinkedHashMa {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> Lhm=new LinkedHashMap<>();
        
        Lhm.put("India",100);
        Lhm.put("America",50);
        Lhm.put("china",200);
        Lhm.put("Aus",500);

        System.out.println(Lhm);
    }
}