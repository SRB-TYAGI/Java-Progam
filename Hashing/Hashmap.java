import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        HashMap<String,Integer> hp=new HashMap<String ,Integer>();
        hp.put("India",100);
        hp.put("America",50);
        hp.put("china",200);
        hp.put("Aus",500);
        
        System.out.println(hp);

        // get 0(1)

        int population=hp.get("India");
        System.out.println(population);
        System.out.println(hp.get("Us"));

        // contains key O(1)

        System.out.println(hp.containsKey("India"));
        System.out.println(hp.containsKey("Pak"));

        // Remove O(1)

        System.out.println(hp.remove("India"));
    }
}