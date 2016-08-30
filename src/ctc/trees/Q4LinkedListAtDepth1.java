//Given a binary tree, design an algorithm which creates a linked list of all the nodes at
//each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
package ctc.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;
import DataStructuresAndAlgos.linkedList1.LinkNode;

public class Q4LinkedListAtDepth1 {
	
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		ArrayList<LinkedList<TreeNode>> result= new ArrayList<LinkedList<TreeNode>>();
		result=createLists(root);
		for(LinkedList<TreeNode> list:result){
			System.out.println(list.getFirst());
		}
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLists(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result= new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> list= new LinkedList<TreeNode>();
		if(root!=null){
			list.add(root);
		}
		while(list.size()>0){
			result.add(list);
			LinkedList<TreeNode> parents= list;
			list= new LinkedList<TreeNode>();
			for(TreeNode parent:parents){
				if (parent.getLeftNode() != null) {
					list.add(parent.getLeftNode());
				}
				if (parent.getRightNode() != null) {
					list.add(parent.getRightNode());
				}
			}
			
			}
		return result;
			
		}
	}