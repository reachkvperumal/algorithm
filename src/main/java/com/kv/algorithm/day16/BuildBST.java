package com.kv.algorithm.day16;

import com.kv.algorithm.day15.TreeNode;

public class BuildBST {

    static TreeNode helper(int[] array, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(array[mid]);

        node.setLeft(helper(array, start, mid - 1));
        node.setRight(helper(array, mid + 1, end));
        return node;
    }

    static TreeNode build(int[] array) {

        if (array == null || array.length == 0)
            return null;

        return helper(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] input = {8, 10, 12, 15, 16, 20, 25};
        System.out.println(build(input));
    }
}
