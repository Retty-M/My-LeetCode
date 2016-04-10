package Tree; /**
 * Created by Retty on 2016-03-20.
 */
import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution102 {
	
	List<List<Integer>> temp = new ArrayList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {
        serialization(root, 0);
        return temp;
    }
	
	public void serialization(TreeNode root, int depth) {
		if (root == null) return;
		if (temp.size() == depth) temp.add(new ArrayList<Integer>());
		temp.get(depth).add(root.val);
		serialization(root.left, depth+1);
		serialization(root.right, depth+1);
	}
	
}
