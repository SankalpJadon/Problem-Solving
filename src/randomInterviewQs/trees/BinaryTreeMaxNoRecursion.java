package randomInterviewQs.trees;

import java.util.LinkedList;
import java.util.Queue;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class BinaryTreeMaxNoRecursion {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(maxElement(root));
	}
	
	public static int maxElement(TreeNode root){
		Queue<TreeNode> list= new LinkedList<TreeNode>();
		list.add(root);
		int minElement=Integer.MAX_VALUE;
		while(!list.isEmpty()){
			TreeNode node=list.remove();
			if(node.getData()<minElement)
				minElement=node.getData();
			if(node.getLeftNode()!=null)
				list.add(node.getLeftNode());
			if(node.getRightNode()!=null)
				list.add(node.getRightNode());
		}
		return minElement;	
	}
}
