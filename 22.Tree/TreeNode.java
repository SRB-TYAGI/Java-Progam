import java.util.ArrayList;

public class TreeNode<T>{
    public T data;
    public ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
    this.data=data;
    children=new ArrayList<>();
   }

   class TreeUse{
    public static void main(String args[]){
        TreeNode<Integer> root=new TreeNode<>(5);
        TreeNode<Integer> node1=new TreeNode<>(2);
        TreeNode<Integer> node2=new TreeNode<>(9);
        TreeNode<Integer> node3=new TreeNode<>(8);
        TreeNode<Integer> node4=new TreeNode<>(7);
        TreeNode<Integer> node5=new TreeNode<>(15);
        TreeNode<Integer> node6=new TreeNode<>(1);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node2.children.add(node5);
        node2.children.add(node6);

        System.out.println(root);

        

        }
   }
}

