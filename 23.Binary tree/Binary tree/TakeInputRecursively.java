import java.util.Scanner;


class BinaryTreeNode<T> {
    public BinaryTreeNode( T data){
        this.data=data;
    }
    T  data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
}

public class TakeInputRecursively {

    public static  BinaryTreeNode<Integer> takeInputrecursively(Scanner s){
        // Scanner s =new Scanner(System.in);
        int rootData;
        System.out.println("Enter root Data");
        rootData=s.nextInt();
        
        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer> (rootData);
        root.left=takeInputrecursively(s);
        root.right=takeInputrecursively(s);
        return root;
    }



public static void PrintBinaryTree(BinaryTreeNode<Integer> root){
    if (root==null){
        return ;
    }

    String tobePrinted=root.data +"";
    if(root.left !=null){
        tobePrinted+="L:" + root.left.data +",";
    }
    if (root.right !=null){
        tobePrinted+= "R:"+ root.right.data +",";
    }

    System.out.println(tobePrinted);
    PrintBinaryTree(root.left);
    PrintBinaryTree(root.right);
}

public static void main (String args[]){
    Scanner s=new Scanner(System.in);
    BinaryTreeNode<Integer> root=takeInputrecursively(s);
    PrintBinaryTree(root);

}
}