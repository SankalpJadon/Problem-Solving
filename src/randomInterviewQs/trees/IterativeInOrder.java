package randomInterviewQs.trees;

import java.util.ArrayList;
import java.util.Stack;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class IterativeInOrder {
	public static void main(String args[]){
	BinaryTree bt= new BinaryTree();
	bt.createTree();
	TreeNode root= bt.getRoot();
	ArrayList<Integer> list= new ArrayList<Integer>();
	list=inOrder(root);
	System.out.println(list);
	}
	public static ArrayList<Integer> inOrder(TreeNode root){
		ArrayList<Integer> list= new ArrayList<Integer>();
		Stack<TreeNode> s= new Stack<TreeNode>();
		boolean flag=false;
		TreeNode currNode=root;
		while(!flag){
			if(currNode!=null){
				s.push(currNode);
				currNode=currNode.getLeftNode();
			}
			else{
				if(s.isEmpty()){
					flag=true;
				}
				else{
					currNode=s.pop();
					list.add(currNode.getData());
					currNode=currNode.getRightNode();
				}
			}
		}
		return list;
	}
}
