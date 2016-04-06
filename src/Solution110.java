/**
 * Created by Retty on 2016-03-20.
 */
public class Solution110 {
	
	public int DFSHeight(TreeNode root) {
		if(root == null) return 0;
		
		int leftHeight = DFSHeight(root.left);
		if(leftHeight == -1) return -1;
		int rightHeight = DFSHeight(root.right);
		if(rightHeight == -1) return -1;
		if (Math.abs(rightHeight - leftHeight) > 1) return -1;
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public int depth(TreeNode root) {
		if(root == null) return 0;
		return Math.max(depth(root.left), depth(root.right)) + 1;
	}

	public boolean isBalanced(TreeNode root) {
		/*时间复杂度(n2)
        if(root == null) return true;     
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        */
		
		//时间复杂度o(n)
        if (DFSHeight(root) == -1) return false;
        return true;
    }
	
}
