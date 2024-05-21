public class String_to_Integer {
    public static String convertStringToInt(String input,int i){
        String  ans="";
        if (i==input.length()){
            return ans;
        }
        if (input.charAt(i)!='0'){
            ans=ans+input.charAt(i);
            
        }
        
        System.out.print(ans);
        return convertStringToInt(input,i+1);
    }
    public static void main(String ans[]){
        String str="00001234";
        System.out.println(convertStringToInt((str),0));
    }
}
