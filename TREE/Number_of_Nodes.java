public class Number_of_Nodes {
    public static int numNodes(TreeNode<Integer> root){
        if (root ==null){
            return 0;
        }
        int count=1;
        for(int i=0;i<root.children.size();i++){
            count+=numNodes(root.children.get(i));
        }
        return count;
    }
    public static void main(String[] args) {
        //		Scanner s= new Scanner(System.in);
        //		
        //		TreeNode<Integer> root = takeInput(s);
        TreeNode<Integer> root = takeInputLevelWise();
		print(root);
            }
}
