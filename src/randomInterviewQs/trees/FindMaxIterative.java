//Find Max in binary tree iteratively. 
//This approach is used in level order traversal also.
package randomInterviewQs.trees;

import java.util.LinkedList;
import java.util.Queue;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class FindMaxIterative {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		System.out.println(maxElement(root));
	}
	public static int maxElement(TreeNode root){
		int max= Integer.MIN_VALUE;
		if(root==null){
			return max;
		}
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			TreeNode node=q.remove();
			if(node.getData()>max){
				max=node.getData();
			}
			if(node.getLeftNode()!=null){
				q.add(node.getLeftNode());
			}
			if(node.getRightNode()!=null){
				q.add(node.getRightNode());
			}
		}
		return max;
	}
}
