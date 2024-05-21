import java.util.Scanner;

public class UserInput {

     public static TreeNode<Integer> takeInput(){
        int n;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter next root data");
        n=s.nextInt();
        TreeNode<Integer> root=new TreeNode<Integer>(n);
        System.out.println("Enter number of children for: "+n);
        
        int childcount=s.nextInt();
        for(int i=0;i<childcount;i++){
            TreeNode<Integer> child=takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s=root.data+":";
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String args[]){
        TreeNode<Integer> root=takeInput();
        print(root);
    }
    
}
