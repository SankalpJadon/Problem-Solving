// Implement a function to check if a binary tree is a binary search tree.
// Algo 2-
package ctc.trees;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class Q5BinarySearchTreeOrNot2 {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		int numElements= bt.treeSize;
		int min= Integer.MIN_VALUE;
		int max= Integer.MAX_VALUE;
		if(check(root, min, max))
			System.out.println("BST");
		else
			System.out.println("Not a BST");
			
	}
	public static boolean check(TreeNode root, int min, int max){
		if(root==null)
			return true;
		if(root.getData()<=min&&root.getData()>max)
			return false;
		if(!check(root.getLeftNode(),min,root.getData())||!(check(root.getRightNode(),root.getData(),max)))
				return false;
		return true;
		
	}
}
