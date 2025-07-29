package challenges.trees;


import java.util.Stack;

import challenges.trees.utils.Pair;
import challenges.trees.utils.TreeNode;

/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.
 */

// Definition for a binary tree node.


public class MinimumBinaryTreeDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(2);
        root.right = rootRight;
        root.left = rootLeft;
        rootLeft.right= new TreeNode(5);
        rootLeft.left = new TreeNode(4);
        System.out.println(teste(root));
    }

    public static int teste(TreeNode root) {
        if(root == null) return 0;

        Stack<challenges.trees.utils.Pair> stack = new Stack();
        stack.add(new challenges.trees.utils.Pair(root, 1));
        int ans = Integer.MAX_VALUE;

        while(!stack.isEmpty()) {
            challenges.trees.utils.Pair currentPair = stack.pop();
            int depth = currentPair.depth;
            TreeNode currNode = currentPair.node;
            if(currNode.right == null && currNode.left == null) {
                ans = Math.min(depth, ans);
            }
            if(currNode.left != null) {
                stack.add(new challenges.trees.utils.Pair(currNode.left, depth + 1));
            }
            if(currNode.right != null) {
                stack.add(new challenges.trees.utils.Pair(currNode.right, depth + 1));
            }
        }

        return ans;
    }
}
