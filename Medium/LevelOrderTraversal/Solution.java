package Medium.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

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
    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);

        return this.result;
    }

    public void traverse(TreeNode root, int level) {
        if (root == null) return;

        if (this.result.size() < level + 1) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.val);

        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }
}