public class Count_Number_of_Nodes {
    
    public static int number(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count=1;
        for(int i=0;i<root.children.size();i++){
            count+=number(root.children.get(i));
        }
        return count;
    }
   
}
