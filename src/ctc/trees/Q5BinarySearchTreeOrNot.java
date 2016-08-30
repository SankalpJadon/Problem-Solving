// Implement a function to check if a binary tree is a binary search tree.
// Algo 1-
package ctc.trees;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class Q5BinarySearchTreeOrNot {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		int numElements= bt.treeSize;
		if(bstOrNot(root,numElements))
			System.out.println("Tree is a BST");
		else
			System.out.println("Tree is not a BST");
	}
	
	static boolean bstOrNot(TreeNode root, int numElements){
		int[] arr= new int[numElements];
		check(root,arr);
		int j=0;
 		System.out.println(arr[0]);
		for(int i=1;i<numElements;i++){
			System.out.println(arr[i]);
			if(arr[j]<arr[i])
				return false;
		}
		return true;
	}
	static int index=0;
	static void check(TreeNode root, int[] arr){
		if(root==null)
			return;
		check(root.getLeftNode(),arr);
		arr[index]=root.getData();
		index++;
		check(root.getRightNode(),arr);
	}
}
