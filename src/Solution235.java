/**
 * Created by Retty on 2016-03-20.
 */
public class Solution235 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || p == null || q == null) return null;
		if(root == p || root == q) return root;
		while ((root.val - p.val)*(root.val - q.val) > 0) {
			root = p.val < root.val ? root.left : root.right;
		}
        return root;
	}
	
}
