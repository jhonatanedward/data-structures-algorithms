package problems.trees;


import problems.trees.utils.TreeNode;
/*

Given the root of a binary tree and an integer targetSum, return true if there exists a path from the root to a
leaf such that the sum of the nodes on the path is equal to targetSum, and return false otherwise.

 */


public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.right.right.right = new TreeNode(1);

        PathSum pathSum = new PathSum();
        pathSum.hasPathSum(root, 22);
    }


    void printTreeHelper(TreeNode node, int level) {
        if (node == null) return;

        printTreeHelper(node.right, level + 1);

        String indent = "    ".repeat(level);
        System.out.println(indent + node.val);

        printTreeHelper(node.left, level + 1);
    }
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return dfs(root, 0);
    }

    public boolean dfs(TreeNode node, int curr) {
        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return (curr + node.val) == target;
        }

        curr += node.val;
        boolean left = dfs(node.left, curr);
        boolean right = dfs(node.right, curr);
        return left || right;
    }
}
