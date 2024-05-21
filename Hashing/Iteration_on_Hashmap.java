import java.util.*;
public class Iteration_on_Hashmap {
    public static void main(String args[]){
        HashMap <String,Integer> hp=new HashMap< String,Integer>();
        hp.put("India",100);
        hp.put("America",50);
        hp.put("china",200);
        hp.put("Aus",500);
        
        // Iterator 
        Set <String> Keys=hp.keySet();
        System.out.println(Keys);

        for (String k : Keys){
            System.out.println(k+"="+hp.get(k));
        }
    }
}
