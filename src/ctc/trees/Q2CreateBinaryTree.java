//Given a sorted (increasing order) array with unique integer elements, write an algorithm
//to create a binary search tree with minimal height.
package ctc.trees;

import DataStructuresAndAlgos.Trees.TreeNode;

public class Q2CreateBinaryTree {
	static int[] arr={1, 2, 3, 4, 5, 6, 7};
	public static void main(String args[]){
		TreeNode root=constructTree(0,arr.length-1);
		preOrder(root);
	}
	
	static TreeNode constructTree(int start, int end){
		if(start>end){
			return null;
		}
		int mid= (start+end)/2;
		TreeNode root= new TreeNode();
		root.setData(arr[mid]);
		TreeNode leftNode= new TreeNode();
		leftNode= constructTree(start,mid-1);
		root.setLeftNode(leftNode);
		TreeNode rightNode= new TreeNode();
		rightNode= constructTree(mid+1,end);
		root.setRightNode(rightNode);
		return root; 
	}
	
	static void preOrder(TreeNode root){
		if(root==null){
			return;
		}
		System.out.println(root.getData());
		preOrder(root.getLeftNode());
		preOrder(root.getRightNode());
	}
}
