
// public class remove_x {

// 	// Return the changed string
// 	public static String removeX(String input,int i){
// 		// Write your code here
// 		String ans="";
// 			if (i==input.length()){
// 				return ans;
// 			}
// 			if (input.charAt(i)=='x'){
// 				ans=ans+"";
// 			}
// 			else {
// 				ans=ans+input.charAt(i);
// 			}
// 			System.out.print(ans);
// 	        return removeX(input,i+1);
// 	}
// 	public static void main(String args []){
//         String str="axbxcxd";
//         System.out.println(removeX((str),0));
//     }
// }







public class remove_x{
	public static String removex(String str,int i){
			if (str.length()==0){
				return str;
			}
			String ans="";
			if (str.charAt(0)!='x'){
				ans=ans+str.charAt(0);
			}

			String smallans = removex(str.substring(1),i);
			return ans+smallans;

	}

	public static void main(String args[]){
		String str="xxxx";
		System.out.println(removex(str,0));
	}
}