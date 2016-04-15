package Tree;

/**
 * Created by retty on 16/4/14.
 * Construct Binary Tree from Inorder and Postorder Traversal
 * 根据中序和后序遍历结果重建树
 * 与Solution105的原理相似,同样使用HashMap可以缩短时间
 */
public class Solution106 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return constructCore(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode constructCore(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;
        int rootValue = postorder[postEnd];
        TreeNode root = new TreeNode(rootValue);

        int rootInorder = inStart;
        while (rootInorder <= inEnd && inorder[rootInorder] != rootValue) rootInorder++;
        if (rootInorder == inEnd && inorder[rootInorder] != rootValue) return null;

        int leftLength = rootInorder - inStart;
        root.left = constructCore(inorder, inStart, rootInorder-1, postorder, postStart, postStart+leftLength-1);
        root.right = constructCore(inorder, rootInorder+1, inEnd, postorder, postStart+leftLength, postEnd-1);
        return root;
    }

}
