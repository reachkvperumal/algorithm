package com.kv.algorithm.day16;

import com.kv.algorithm.day15.BuildTreeNode;
import com.kv.algorithm.day15.TreeNode;

public class SumOfKeys {

    static int sum(TreeNode root) {
        if (root == null)
            return 0;
        int left = 0;
        left = left + sum(root.getLeft());
        int right = 0;
        right = right + sum(root.getRight());

        return root.getKey() + left + right;

    }

    public static void main(String[] args) {
        TreeNode root = BuildTreeNode.initSuccessorAndPredecssor();

        long sum = BuildTreeNode.KEYS_PRED_SUCC.entrySet().stream()
                .mapToInt(o -> o.getKey())
                .summaryStatistics()
                .getSum();


        System.out.println(sum);

        System.out.println(sum(root));


    }
}
