/**
 * Created by Retty on 2016-03-20.
 */
import java.util.ArrayList;
import java.util.List;

public class Solution107 {
	
	List<List<Integer>> temp = new ArrayList<>();

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        serialization(root, 0);
        return temp;
    }
	
	public void serialization(TreeNode root, int depth) {
		if (root == null) return;
		if (temp.size() == depth) temp.add(0, new ArrayList<Integer>());
		temp.get(temp.size()-depth-1).add(root.val);
		serialization(root.left, depth+1);
		serialization(root.right, depth+1);
	}
	
}
