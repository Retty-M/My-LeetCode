/**
 * Created by Retty on 2016-03-20.
 */
import java.util.ArrayList;
import java.util.List;

public class Solution257 {

	private String join = "->";
	
	public List<String> binaryTreePaths(TreeNode root) {
		String str = "";
        List<String> result = new ArrayList<>();
        if(root == null) return result;
        return help(result, root, str);
    }
	
	public List<String> help(List<String> temp, TreeNode root, String str) {
		if(root == null) return null;
		str += root.val + join;
		if(root.left == null && root.right == null) {
			str = str.substring(0, str.length()-2);
			temp.add(str);
			return null;
		}
		help(temp, root.left, str);
		help(temp, root.right, str);
		return temp;
	}
	
}
