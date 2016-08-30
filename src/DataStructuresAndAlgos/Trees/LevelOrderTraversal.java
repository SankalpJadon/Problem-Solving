package DataStructuresAndAlgos.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	static void print(TreeNode root){
		if(root==null){
			return;
		}
		Queue<TreeNode> q= new LinkedList<TreeNode>();
		q.add(root);
		while(q.isEmpty()){
			TreeNode current= new TreeNode();
			current=q.peek();
			System.out.println(current.getData());
			if(current.getLeftNode()!=null)
				q.add(current.getLeftNode());
			if(current.getRightNode()!=null)
				q.add(current.getRightNode());
			q.remove();			
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		bt.createTree();
		TreeNode node= new TreeNode();
		node.setData(3);
		print(node);
	}
}
