package DataStructuresAndAlgos.Trees;

public class TreeNode {
	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;	
	
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
}
