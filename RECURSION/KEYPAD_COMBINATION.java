public class KEYPAD_COMBINATION {
    public static  String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printcomb(String str,int idx,String combination){
        if (idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currchar=str.charAt(idx);
        String mapping =keypad[currchar-'0'];
        for (int i=0;i<mapping.length();i++){
            printcomb(str, idx+1,combination+mapping.charAt(i));
        }
    }
    
        
   
   
    public static void main (String args[]){
        String str="234";
        printcomb(str,0,"");
    }
}


