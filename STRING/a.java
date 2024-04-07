
public class a {

	// Return the updated string
	public static String addStars(String s,int i,int j) {
		// Write your code here
		
		String ans="";
		int k=s.length()-1;

		if (i==s.length()-1){
			return "";
		}
		
		if(s.charAt(i)==s.charAt(j)){
			ans=ans+s.charAt(i)+'*';
			
		}
		else if(s.charAt(i)!=s.charAt(j)) {
			ans=ans+s.charAt(i);
		}
		else{
			ans=ans+s.charAt(i);
		}

		
		System.out.print(ans);
		return addStars(s,i+1,j+1) ;
		

}

	public static void main(String args[]){
	    String str="abcdd";

	    System.out.println(addStars((str),0,1));
	}
}


