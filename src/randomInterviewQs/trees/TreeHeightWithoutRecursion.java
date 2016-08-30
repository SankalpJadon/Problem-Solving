//Q12 Find the size/height of the tree without using recursion.
package randomInterviewQs.trees;

import java.util.LinkedList;
import java.util.Queue;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class TreeHeightWithoutRecursion {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(findHeight(root));
	}
	public static int findHeight(TreeNode root){
		Queue q= new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		int height=0;
		while(!q.isEmpty()){
			TreeNode curr=(TreeNode) q.remove();
			if(curr!=null){
				if(curr.getLeftNode()==null&&curr.getRightNode()==null){
					continue;
				}
				if(curr.getLeftNode()!=null){
					q.add(curr.getLeftNode());
				}
				if(curr.getRightNode()!=null){
					q.add(curr.getRightNode());
				}
			}
			else{
				if(!q.isEmpty()){
					height++;
					q.add(null);
				}
			}	
		}
		return height;
	}

}
