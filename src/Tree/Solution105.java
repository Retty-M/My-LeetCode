package Tree;

/**
 * Created by retty on 16/4/10.
 * Construct Binary Tree from Preorder and Inorder Traversal
 * 根据前序和中序遍历结果重建二叉树
 * 1.前序的第一个元素是跟节点,在中序里查找到该元素,左边是左子树右边是右子树
 * 2.然后确定边界使用递归重建树
 * 3.使用HashMap重建inorder会节约时间
 */
public class Solution105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) return null;
        return constructCore(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode constructCore(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        int rootValue = preorder[preStart];
        TreeNode root = new TreeNode(rootValue);
        if (preStart == preEnd) {
            if (inStart == inEnd && preorder[preStart] == inorder[inStart]) return root;
            else return null;
        }

        int rootInorder = inStart;
        while (rootInorder <= inEnd && inorder[rootInorder] != rootValue) rootInorder++;
        if (rootInorder == inEnd && inorder[rootInorder] != rootValue) return null;

        int leftLength = rootInorder - inStart;
        int leftPreorderEnd = preStart + leftLength;
        if (leftLength > 0) {
            root.left = constructCore(preorder, preStart+1, leftPreorderEnd, inorder, inStart, rootInorder-1);
        }
        if (leftLength < preEnd - preStart) {
            root.right = constructCore(preorder, leftPreorderEnd+1, preEnd, inorder, rootInorder+1, inEnd);
        }
        return root;
    }

}
