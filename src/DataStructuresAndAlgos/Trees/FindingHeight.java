package DataStructuresAndAlgos.Trees;

public class FindingHeight {
	int leftLen=0;
	int rightLen=0;
	public int balanced(TreeNode root){
		if(root==null){
			return 0;
		}
		leftLen= balanced(root.getLeftNode());
		rightLen= balanced(root.getRightNode());
		if(leftLen>rightLen){
			return leftLen+1;
		}
		else{
			return rightLen+1;
		}
	}
}
  
