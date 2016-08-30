package DataStructuresAndAlgos.Trees;

import java.util.Scanner;

class TreeTraversal {
	
	public static void inOrderTraversal(TreeNode root){
		if(root!=null){
			inOrderTraversal(root.getLeftNode());
			System.out.println(root.getData());
			inOrderTraversal(root.getRightNode());
		}
	}
	public static void preOrderTraversal(TreeNode root){
		if(root!=null){
			System.out.println(root.getData());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());
		}
	}
	public static void postOrderTraversal(TreeNode root){
		if(root!=null){
			postOrderTraversal(root.getLeftNode());
			postOrderTraversal(root.getRightNode());
			System.out.println(root.getData() );
		}
	}

	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		inOrderTraversal(root);
	}
}
