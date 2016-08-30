package randomInterviewQs.trees;

import java.util.Scanner;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class FindNodeInTree {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int data=sc.nextInt();
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(findNode(root,data));
	}
	public static boolean findNode(TreeNode root,int data){
		if(root==null){
			return false;
		}
		if(root.getData()==data){
			return true;
		}
		return (findNode(root.getLeftNode(),data)||findNode(root.getRightNode(),data));
		
	}
}
