public class Binarysearchtree{


    // INSERT NODE  


    public BinaryTreeNode<Integer> root;


    public void insertdata(int data){

        root=insertData(data, root);
    }
    public BinaryTreeNode<Integer> insertData(int data,BinaryTreeNode<Integer> root){
         if (root ==null){
            BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(data);
            return  newNode;
    }
    if (root.data> data){
        root.left=insertData(data, root.left);
    }else{
        root.right=insertData(data, root.right);
    }
    return root;
}

  // DELETE DATA IN NODE
    
    public void deletedata(int data){
        root=deletenode(data, root);

        }
        public BinaryTreeNode<Integer> deletenode(int data,BinaryTreeNode<Integer> root){
            if (root==null){
                return null;
            }
            if (root.data> data){
                root.left=deletenode(data, root.left);
                return root;
            }else if (root.data<data){
                root.right=deletenode(data, root.right);
                return root;
            }
                else{
                    if(root.left == null  && root.right==null){
                        return null;
                    }
                    else if (root.left ==null){
                        return root.right;
                    }
                    else if(root.right==null){
                        return root.left;
                    }
                    else{
                        BinaryTreeNode<Integer> minNode=root.right;
                        while(minNode.left!=null){
                            minNode=minNode.left;
                        }
                        root.data=minNode.data;
                        root.right=deletenode(minNode.data, root.right);
                        return root;
                    }
                }
            }


    public static void printTree(BinaryTreeNode<Integer> root){
        if (root==null){
            return ;
        }
        String toBeprinted=root.data+"";
        if (root.left!=null){
            toBeprinted+="L:"+root.left.data+",";
        }
        if (root.right!=null){
            toBeprinted+="R:"+root.right.data+",";
        }
        System.out.println(toBeprinted);
        printTree((root.left));
        printTree(root.right);
    }
    public void printTree(){
        printTree(root);
    }
    

    public static void main(String args[]){
        Binarysearchtree bst=new Binarysearchtree();
        bst.insertdata(10);
        bst.insertdata(20);
        bst.insertdata(5);
        bst.insertdata(15);
        bst.insertdata(3);
        bst.insertdata(7);
        System.out.println("print nodes");
        bst.printTree();
        System.out.println("After delete nodes:");
        bst.deletedata(5);
        bst.printTree();
        
        
        


    }
}

