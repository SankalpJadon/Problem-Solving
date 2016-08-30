package randomInterviewQs.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class IterativePreOrder {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		ArrayList<Integer> list= new ArrayList<Integer>();
		list=preOrder(root);
		System.out.println(list);
	}
	public static ArrayList<Integer> preOrder(TreeNode root){
		ArrayList<Integer> list= new ArrayList<Integer>();
		Stack<TreeNode> s= new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode node= s.pop();
			list.add(node.getData());
			if(node.getRightNode()!=null)
				s.push(node.getRightNode());
			if(node.getLeftNode()!=null)	
				s.push(node.getLeftNode());
		}
		return list;
	}
}
