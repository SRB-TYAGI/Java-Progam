public class BinaryTreeNode<T> {
    public BinaryTreeNode( T data){
        this.data=data;
    }
    T  data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
}