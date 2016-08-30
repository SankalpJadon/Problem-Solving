package DataStructuresAndAlgos.Trees;
import java.util.Scanner;
 
 /* Class BTNode */
public class BinaryTree{
	private static TreeNode root;
	public static int treeSize=0;
	
	static void addNode(TreeNode newNode){
		if(root==null){
			root=newNode;
			treeSize++;
		}
		else{
			TreeNode focusNode=root;
			TreeNode parent;
			while(true){
				parent=focusNode;
				if(newNode.getData()<focusNode.getData()){
					focusNode=focusNode.getLeftNode();
					if(focusNode==null){
						parent.setLeftNode(newNode);
						treeSize++;
						return;
					}
				}
				else{
					focusNode=focusNode.getRightNode();
					if(focusNode==null){
						parent.setRightNode(newNode);
						treeSize++;
						return;
					}
					
				}
			}
		}
	}
	
	public static void createTree(){
		TreeNode n1= new TreeNode();
		n1.setData(6);
		TreeNode n2= new TreeNode();
		n2.setData(3);
		TreeNode n3= new TreeNode();
		n3.setData(8);
		TreeNode n4= new TreeNode();
		n4.setData(2);
		TreeNode n5= new TreeNode();
		n5.setData(4);
		TreeNode n6= new TreeNode();
		n6.setData(7);
		TreeNode n7= new TreeNode();
		n7.setData(9);
		TreeNode n8= new TreeNode();
		n8.setData(22);
		
		addNode(n1);
		addNode(n2);
		addNode(n3);
		addNode(n4);
		addNode(n5);
		addNode(n6);
		addNode(n7);
		addNode(n8);
	}
	
	public static TreeNode getRoot(){
		return root;
	}
	
	public static void main(String args[]){
		createTree();
		System.out.println(treeSize);
	}

}