/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pS = new Stack<>();
        Stack<TreeNode> qS = new Stack<>();

        pS.push(p);
        qS.push(q);

        while (!qS.isEmpty() && !qS.isEmpty()) {
            TreeNode pNode = pS.pop();
            TreeNode qNode = qS.pop();

            if (pNode == null && qNode == null)
                continue;
            if (pNode == null || qNode == null)
                return false;
            if (pNode.val != qNode.val)
                return false;

            pS.push(pNode.left);
            qS.push(qNode.left);

            pS.push(pNode.right);
            qS.push(qNode.right);
        }
        return true;
    }
}
