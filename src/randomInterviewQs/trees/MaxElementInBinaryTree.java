package randomInterviewQs.trees;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class MaxElementInBinaryTree {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(findMax(root));
	}
	public static int findMax(TreeNode root){
		if(root==null)
			return Integer.MIN_VALUE;
		int lmax= findMax(root.getLeftNode());
		int rmax= findMax(root.getRightNode());
		return Integer.max(Integer.max(lmax,rmax), root.getData()); 
	}
}
