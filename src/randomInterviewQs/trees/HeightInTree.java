package randomInterviewQs.trees;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class HeightInTree {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.print(heightOfTree(root));		
	}
	public static int heightOfTree(TreeNode root){
		if(root==null){
			return 0;
		}
		int lheight= heightOfTree(root.getLeftNode());
		int rheight= heightOfTree(root.getRightNode());
		return Math.max(lheight,rheight)+1;
	}
}
