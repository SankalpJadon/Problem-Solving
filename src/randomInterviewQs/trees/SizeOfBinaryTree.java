package randomInterviewQs.trees;

import java.util.ArrayList;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class SizeOfBinaryTree {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(getSize(root));
	}
	public static int getSize(TreeNode root){
		if(root==null)	
			return 0;
		int lSize= getSize(root.getLeftNode());
		int rSize= getSize(root.getRightNode());
		return lSize+rSize+1;
	}
}
