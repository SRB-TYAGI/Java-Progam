import java.util.Scanner;



// LinkedList Node

class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
	
}

//  Queeueusing LinkedList
class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;

	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	int size(){
		return size;
	}

	boolean isEmpty(){
		return size == 0;
	}

	T front() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		return front.data;
	}

	void enqueue(T element){
		Node<T> newNode = new Node<>(element);
		if(rear == null){
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
		size++;

	}

	T dequeue() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		
		T temp = front.data;
		front = front.next;
		if(size == 1){
			rear = null;
		}
		size--;
		
		return temp;
	}

}



//  Queue exception


class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7243921724361015813L;

}


public class Print_LevelWise {
    
    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData=s.nextInt();

        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        TreeNode<Integer> root=new TreeNode<Integer>(rootData);
            pendingNodes.enqueue(root);

            while(!pendingNodes.isEmpty()){
                try{
                        TreeNode<Integer> frontNode=pendingNodes.dequeue();
                        System.out.println("Enter number of children of "+frontNode.data);
                        int numberchildren=s.nextInt();

                        for(int i=0;i<numberchildren;i++){
                            System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                            int child=s.nextInt();

                            TreeNode<Integer> childNode=new TreeNode<Integer>(child);
                            frontNode.children.add(childNode);
                            pendingNodes.enqueue(childNode);

                        }
            }
            catch(QueueEmptyException e){
                // should not come here;
                return null;
            }
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
            // Number of NODes

            
                public static int NumberNodes(TreeNode<Integer> root){
                    if(root==null){
                        return 0;
                    }
                    int count=1;
                    for(int i=0;i<root.children.size();i++){
                        count+=NumberNodes(root.children.get(i));
                    }
                    return count;
                }

    

    // SUM OF ROOTS

    public static int sumofAll(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=sumofAll(root.children.get(i));
        }
        return sum;
    }


    // Largest Node

    public static int LargestNode(TreeNode<Integer> root){
        if (root==null){
            return Integer.MIN_VALUE;
        }

        int ans=root.data;
        for(int i=0;i<root.children.size();i++){
            int Childlargest=LargestNode(root.children.get(i));
        
        if(Childlargest>ans){
            ans=Childlargest;

        }
    }
    return ans;
    }


    // HOW MANY TIME NUMBER OF NODE GREATER

    public static int GreaterNumberofNodes(TreeNode<Integer> root,int x){
        if (root==null){
            return 0;
        }
        int count=0;
        if (root.data>x){
            count++;
        }
        for(int i=0;i<root.children.size();i++){
            count+=GreaterNumberofNodes(root.children.get(i), x);
            
        }

        return count;

    }

    // HEIGHT OF TREE

    public static int Height(TreeNode<Integer> root){
        if (root==null){
            return 0;
        }
        int ans=0;
        for(int i=0;i<root.children.size();++i){
            int temp=Height(root.children.get(i));

            if (temp > ans){
                ans=temp;
            }
        }
        return ans+1;
    }

    // Depth of Nodes

    public static void PrintkAt(TreeNode<Integer> root,int k){
        if (k<0){
            return;
        }
        if (k==0){
            System.out.print(root.data+" ");
            return ;
        }
        for (int i=0;i<root.children.size();i++){
            PrintkAt(root.children.get(i),k-1);
        }
    }

    // PREORRDER TRAVERSAL

    public static void Preorder(TreeNode<Integer> root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
            Preorder(root.children.get(i));
        }

    }

    // POSTORDER

    public static void PsotOrder(TreeNode<Integer> root){
        if (root==null){
            return ;
        }
        for(int i=0;i<root.children.size();i++){
            PsotOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    

    //  Check if generic tree contain element x

    public static boolean CheckElementPreseintinX(TreeNode<Integer> root,int x){
        if (root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        for(int i=0;i<root.children.size();i++){
            if (CheckElementPreseintinX(root.children.get(i), x)){
                return true;
            }
        }
        return false;
    }


   /// Next Largest Element


   public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
    if (root==null){
        return null;
    }
    TreeNode<Integer> ans=null;
    if (root.data>n){
        ans=root;
    }
    for(int i=0;i<root.children.size();i++){
        TreeNode<Integer> NextLargestElement=findNextLargerNode(root.children.get(i), n);
        if(NextLargestElement !=null){
            if (ans==null || NextLargestElement.data < ans.data){
                ans=NextLargestElement;

            }
        }
    }
    return ans;

   }



   // COUNT LEAFNODES

   public static int CountLeafNodes(TreeNode<Integer> root){
    if (root==null){
        return 0;
    }
    if (root.children.isEmpty()){
        return 1;
    }
    int Leafcount=0;
    for(TreeNode<Integer> child:root.children){
        Leafcount+=CountLeafNodes(child);
    }
    return Leafcount;
   }
    public static void main(String args[]){
        TreeNode<Integer> root=takeInputLevelWise();
        print(root);
        System.out.println("Number of Nodes= "+NumberNodes(root));
        System.out.println("Sum of all nodes= "+sumofAll(root));
        System.out.println("Largest data= "+LargestNode(root));
        System.out.println("Node is greater than given value= "+GreaterNumberofNodes(root, 3));
        System.out.println("Height of Tree= "+Height(root));
        System.out.println("Depth of Nodes");
        PrintkAt(root, 2);
        System.out.println();
        System.out.println("Preorder");
        Preorder(root);
        System.out.println();
        System.out.println("Postorder");
        PsotOrder(root);
        System.out.println();
        System.out.println("Check element present or not");
        System.out.println(CheckElementPreseintinX(root, 2));
        System.out.println("Next Largest Element");
        System.out.println(findNextLargerNode(root, 20));
        System.out.println("Count LeafNodes");
        System.out.println(CountLeafNodes(root));
        
    }
}
