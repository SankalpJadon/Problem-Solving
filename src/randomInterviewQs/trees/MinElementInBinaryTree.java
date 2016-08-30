package randomInterviewQs.trees;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class MinElementInBinaryTree {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(findMin(root));
	}
	public static int findMin(TreeNode root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
		int Lmin= findMin(root.getLeftNode());
		int Rmin= findMin(root.getRightNode());
		return Integer.min(Integer.min(Lmin, Rmin),root.getData());
	}
}
