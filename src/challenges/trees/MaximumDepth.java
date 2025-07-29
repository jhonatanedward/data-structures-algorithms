package challenges.trees;

import challenges.trees.utils.TreeNode;

import java.util.Stack;

class PairMax {
    TreeNode node;
    int depth;
    PairMax(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}

public class MaximumDepth {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public int maxDepthIteractive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<PairMax> stack = new Stack<>();
        stack.push(new PairMax(root, 1));
        int ans = 0;

        while (!stack.empty()) {
            PairMax pair = stack.pop();
            TreeNode node = pair.node;
            int depth = pair.depth;

            ans = Math.max(ans, depth);
            if (node.left != null) {
                stack.push(new PairMax(node.left, depth + 1));
            }
            if (node.right != null) {
                stack.push(new PairMax(node.right, depth + 1));
            }
        }

        return ans;
    }
}
