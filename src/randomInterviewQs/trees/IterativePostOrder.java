package randomInterviewQs.trees;

import java.util.ArrayList;
import java.util.Stack;

import DataStructuresAndAlgos.Trees.BinaryTree;
import DataStructuresAndAlgos.Trees.TreeNode;

public class IterativePostOrder {
	public static void main(String args[]){
		BinaryTree bt= new BinaryTree();
		bt.createTree();
		TreeNode root= bt.getRoot();
		ArrayList<Integer> list= new ArrayList<Integer>();
		list=postOrder(root);
		System.out.println(list);
	}
	public static ArrayList<Integer> postOrder(TreeNode root){
		ArrayList<Integer> list=new ArrayList<Integer>();
		Stack<TreeNode> s= new Stack<TreeNode>();
		if(root==null)
			return list;
		s.push(root);
		TreeNode prev=null;
		while(!s.isEmpty()){
			TreeNode current= s.peek();
			if(prev==null||prev.getLeftNode()==current||prev.getRightNode()==current){
				if(current.getLeftNode()!=null){
					s.push(current.getLeftNode());
				}
				else if(current.getRightNode()!=null){
					s.push(current.getRightNode());
				}
				else{
					TreeNode node= s.pop();
					list.add(node.getData());
				}
			}
			else if (current.getLeftNode() == prev) {
                if (current.getRightNode() != null) {
                    s.push(current.getRightNode());
                } else {
                    s.pop();
                    list.add(current.getData());
                }
            } else if (current.getRightNode() == prev) {
                s.pop();
                list.add(current.getData());
            }
            prev = current;
        }
        return list;
	}
}
