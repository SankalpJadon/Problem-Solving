// Write an algorithm to find the 'next'node (i.e. in-order successor) of a given node in
// a binary search tree. You may assume that each node has a link to its parent.
package ctc.trees;

import java.util.Scanner;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class Q6NextNodeInTree {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		Scanner sc= new Scanner(System.in);
		int data= sc.nextInt();
		findNextNode(root,data);
	}
	public static TreeNode findNextNode(TreeNode root,int data){
		if(root==null){
			return null;
		}
		if(root.getData()==data){
			return root;
		}
		findNextNode(root,data);
		findNextNode(root,data);
	}
	
}
