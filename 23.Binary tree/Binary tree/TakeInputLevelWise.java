import java.util.Scanner;

public class TakeInputLevelWise {

    public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data +" "+ "";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s) {
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        root.right = takeInput(s);
		root.left = takeInput(s);
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}


	// count Nodes

	public static int CountNodes(BinaryTreeNode<Integer> root){
		if (root==null){
			return 0;
		}
		int count=1;
		count+=CountNodes(root.left);
		count+=CountNodes(root.right);
		return count;
	}

	// Find sum of nodeas

	public static int SumofNodes(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}

		int Leftsum=SumofNodes(root.left);
		int rightsum=SumofNodes(root.right);
		return root.data + Leftsum + rightsum;
	}


	// Node is present or not

	public static boolean isNodeisPresent(BinaryTreeNode<Integer> root,int x){
		if (root==null){
			return false;
		}
		if (root.data==x){
			return true;
		}

		boolean left=isNodeisPresent(root.left, x);
		boolean right=isNodeisPresent(root.right, x);

		return left || right;
		
	}

	// Node with Largest data

	public static int FindLargestData(BinaryTreeNode<Integer> root){
		if (root==null){
			return -1;
		}
		int LeftLargest=FindLargestData(root.left);
		int rightLargest=FindLargestData(root.right);
		return Math.max(root.data,Math.max(LeftLargest,rightLargest));
	}


	// Find the Node greater than X

	public static int FindNodeGreaterthanX(BinaryTreeNode<Integer> root,int x){
		if(root==null){
			return 0;
		}
		
		int Leftsearch=FindNodeGreaterthanX(root.left, x);
		int rightsearch=FindNodeGreaterthanX(root.right, x);

		return (root.data > x ? 1 : 0) +Leftsearch + rightsearch;
	}

	// Find Height of BinaryTree

	public static int HeightofBinarytree(BinaryTreeNode<Integer> root){
		if (root==null){
			return 0;
		}

		int leftHeight=HeightofBinarytree(root.left);
		int rightHeight=HeightofBinarytree(root.right);

		return Math.max(leftHeight,rightHeight)+1;
	}


	// Number of Leaves Nodes

	public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null &&root.right==null){
            return 1;
        }
        return numLeaves(root.left)+numLeaves(root.right);
}

// Print depth of k node

public static void  PrintdepthK(BinaryTreeNode<Integer> root,int k){
	if (root==null){
		return;
	}
	if (k==0){
		System.out.print(root.data+" ");
		return ;
	}
	PrintdepthK(root.left, k-1);
	PrintdepthK(root.right, k-1);
	
}

// Print depth of Node

public static void changeToDepthTree(BinaryTreeNode<Integer> root) {

	if (root == null) {
		   return;
	   }
	   
	   changeToDepthTreeHelper(root, 0);
   }
   
		   public  static void changeToDepthTreeHelper(BinaryTreeNode<Integer> node, int depth) {
				   if (node == null) {
					   return;
	   }
	   
	   node.data = depth;
	   changeToDepthTreeHelper(node.left, depth + 1);
	   changeToDepthTreeHelper(node.right, depth + 1);
   }
   

   // Is node present or not

   public static boolean IsNodeisPresent(BinaryTreeNode<Integer> root ,int x){
		if (root ==null){
			return false;
		}
		if (root.data==x){
			return true;
		}
		boolean leftcheck =IsNodeisPresent(root.left, x);
		boolean rightcheck=IsNodeisPresent(root.right, x);
		return leftcheck || rightcheck;
   }

    //  Print root without siblings

	public static void Printrootwithoutsiblings(BinaryTreeNode<Integer> root){
		if (root==null){
			return ;
		}
		if(root.left !=null && root.right ==null){
			System.out.println(root.left.data);
		}
		if (root.left ==null && root.right !=null){
			System.out.println(root.right.data);
		}
		Printrootwithoutsiblings(root.left);
		Printrootwithoutsiblings(root.right);
	}

	// RemoveLeaves node

	public static BinaryTreeNode<Integer> RemoveLeaves(BinaryTreeNode<Integer> root){
		if (root==null){
			return null;
		}
		if (root.left==null && root.right==null){
			return null;
		}
		root.left=RemoveLeaves(root.left);
		root.right=RemoveLeaves(root.right);
		return root;
	}

	// Check is tree Balanced or not'

	public static int height(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int leftHeight=height(root.left);
		int rightheight=height(root.right);
			return 1+Math.max(leftHeight,rightheight);
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root){
		if (root==null){
			return true;
	}
	

	int Heightleft=height(root.left);
	int Heightright=height(root.right);
	if(Math.abs(Heightleft-Heightright )>1){
	return false;
	}
	boolean isleftheightisbalanced=isBalanced(root.left);
	boolean isrightheightisbalanced=isBalanced(root.right);
	return isleftheightisbalanced && isrightheightisbalanced;
}
    public static void main (String args[]){
        BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
		System.out.println();
		System.out.println("CountNodes=" + CountNodes(root));
		System.out.println("SumofNodes="+SumofNodes(root));
		System.out.println("IS node present or not= "+isNodeisPresent(root, 5));
		System.out.println("Largest Node ="+FindLargestData(root));
		System.out.println("Nodeis greterthanX= "+FindNodeGreaterthanX(root, 2));
		System.out.println("Height of BinaryTree= "+HeightofBinarytree(root));
		System.out.println("Numbaer of LeavesNodes= "+numLeaves(root));
		System.out.println("Print Deepth k node:"+"/n");
		PrintdepthK(root, 2);
		System.out.println("Print depth of Node:" + "\n");
		System.out.println("IS Node present or not= "+IsNodeisPresent(root, 2));
		System.out.println("Print root without sibligs ");
		Printrootwithoutsiblings(root);
		// BinaryTreeNode<Integer> newRoot=RemoveLeaves(root);
		// printTree(newRoot);
		System.out.println("is balanced root= "+isBalanced(root));




    }
}
