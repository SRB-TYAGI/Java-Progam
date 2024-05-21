public class Returnsubsequence {
    public static String[] Subsequence(String s){
        if (s.length()==0){
            String ans[]={""};
                return ans;
            }
            
            String smallans[]=Subsequence(s.substring(1));
            String ans[]=new String[2*smallans.length];

            for(int i=0;i<smallans.length;i++){
                ans[i]=smallans[i];
            }
            for (int i=0;i<smallans.length;i++){
                ans[i+smallans.length]=s.charAt(0)+smallans[i];
            }

            return ans;

        }

        public static void main(String args[]){
            String str="xyz";
            String ans[]=Subsequence(str);
            for (int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }
        }
    }

