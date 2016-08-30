package randomInterviewQs.trees;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class DeletingAllNodes {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		TreeNode delNode=deleteNodes(root);
		printTree(root);
	}
	public static TreeNode deleteNodes(TreeNode root){
		if(root.getLeftNode()==null||root.getRightNode()==null)
			return null;
		TreeNode node = null;
		node= deleteNodes(root.getLeftNode());
		node= deleteNodes(root.getRightNode());
		return null;
	}
	public static void printTree(TreeNode root){
		if(root==null){
			return;
		}
		System.out.println(root.getData());
		printTree(root.getLeftNode());
		printTree(root.getRightNode());
	}
}
