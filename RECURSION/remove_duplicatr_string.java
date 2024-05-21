public class remove_duplicatr_string {
    public static String removeduplicate(String s){
        String ans="";
        char ch=s.charAt(0);
        ans=ans+ch;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==ch){
                ans=ans+"";
            }
            else{
                ans=ans+s.charAt(i);
            }
            ch=s.charAt(i);
        }
        return ans;
    }
    public static void main (String ars[]){
        String ans="abbccddee";
        System.out.println(removeduplicate(ans));
    }
}
