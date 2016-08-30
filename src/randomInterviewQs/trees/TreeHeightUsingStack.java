//Q11 Find height using stack
package randomInterviewQs.trees;

import java.util.Stack;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class TreeHeightUsingStack {

	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		TreeHeightUsingStack treeHeight= new TreeHeightUsingStack();
		System.out.println(treeHeight.findHeight(root));
	}
	public int findHeight(TreeNode root){
		Stack s= new Stack();
		s.push(root); 
		int height=0;
		TreeNode prev=null;
		while(!s.isEmpty()){
			TreeNode curr= (TreeNode) s.peek();
			if(prev==null||prev.getLeftNode()==curr||prev.getRightNode()==curr){
				if(curr.getLeftNode()!=null)
					s.push(curr.getLeftNode());
				else if(curr.getRightNode()!=null)
					s.push(curr.getRightNode());
			}
			else if(curr.getLeftNode()==prev){
				if(curr.getRightNode()!=prev){
					s.push(curr.getRightNode());
				}
			}
			else{
				s.pop();
			}
			prev=curr;
			if(height<s.size()){
				height=s.size();
			}
		}
		return height;
	}


}
