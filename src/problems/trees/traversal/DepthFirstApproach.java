package problems.trees.traversal;

import problems.trees.utils.TreeNode;

public class DepthFirstApproach {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);

        root.left = one;
        root.right = two;

        dfs(root);
    }

    public static void dfs(TreeNode treeNode) {
        if(treeNode == null) return;
        dfs(treeNode.left);
        dfs(treeNode.right);
    }
}
