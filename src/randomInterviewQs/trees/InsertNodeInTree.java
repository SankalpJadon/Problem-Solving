package randomInterviewQs.trees;

import java.util.Scanner;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class InsertNodeInTree {
	public static void main(String args[]){
		System.out.println("Enter the element to be added: ");
		Scanner sc= new Scanner(System.in);
		int data=sc.nextInt();
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		boolean res= setNode(root,data);
		printTree(root);
	}
	public static boolean setNode(TreeNode root,int data){
		if(root==null){
			root.setData(data);
			return true;
		}
		else if(root.getLeftNode()==null){
			TreeNode node= new TreeNode();
			node.setData(data);
			root.setLeftNode(node);
			return true;
		}
		else if(root.getRightNode()==null){
			TreeNode node= new TreeNode();
			node.setData(data);
			root.setRightNode(node);	
			return true;
		}
		return(setNode(root.getLeftNode(),data)||setNode(root.getRightNode(),data));
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
