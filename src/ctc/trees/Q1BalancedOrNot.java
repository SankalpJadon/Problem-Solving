// Implement a function to check if a binary tree is balanced. For the purposes of this
// question, a balanced tree is defined to be a tree such that the heights of the two
// subtrees of any node never differ by more than one.
package ctc.trees;
import DataStructuresAndAlgos.Trees.*;

public class Q1BalancedOrNot {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		boolean result=balancedOrNot(root);
		if(result)
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}
	
	public static boolean balancedOrNot(TreeNode root){
		if(getHeight(root)==-1)
			return false;
		else
			return true;
	}
	
	public static int getHeight(TreeNode root){
		if(root==null){
			return 0;
		}
		int leftHeight= getHeight(root.getLeftNode());
		if(leftHeight==-1)
			return -1;
		int rightHeight= getHeight(root.getRightNode());
		if(rightHeight==-1) 
			return -1;
		int diff= leftHeight-rightHeight;
		if(diff>1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight)+1;
	}
}
 