package problems.trees;

import problems.trees.utils.TreeNode;

import java.util.Stack;

class PairSameNode {
    TreeNode p;
    TreeNode q;

    PairSameNode(TreeNode p, TreeNode q) {
        this.p = p;
        this.q = q;
    }
}

public class SameTree {
    public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean left = isSameTreeRecursive(p.left, q.left);
        boolean right = isSameTreeRecursive(p.right, q.right);
        return left && right;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<PairSameNode> stack = new Stack<>();
        stack.push(new PairSameNode(p, q));

        while (!stack.empty()) {
            PairSameNode pair = stack.pop();
            TreeNode node1 = pair.p;
            TreeNode node2 = pair.q;

            if (node1 == null && node2 == null) {
                continue;
            }

            if (node1 == null || node2 == null) {
                return false;
            }

            if (node1.val != node2.val) {
                return false;
            }

            stack.push(new PairSameNode(node1.left, node2.left));
            stack.push(new PairSameNode(node1.right, node2.right));
        }

        return true;
    }
}
