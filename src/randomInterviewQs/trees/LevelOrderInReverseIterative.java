//Print out all the nodes in reverse order of level order traversal iteratively
package randomInterviewQs.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class LevelOrderInReverseIterative {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		printReverse(root);
	}
	public static void printReverse(TreeNode root){
		TreeNode node= new TreeNode();
		Stack s= new Stack();
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.add(root);
		try{
			while(!q.isEmpty()){
				node= q.remove();
				if(node.getRightNode()!=null){
					q.add(node.getRightNode());
				}	
				if(node.getLeftNode()!=null){
					q.add(node.getLeftNode());
				}
				s.push(node);
			}
			while(!s.isEmpty()){
				System.out.println(s.pop());
			}
		}catch(Exception e){
			System.out.println("Exception Occurred and catched");
		}
		
	}
}
