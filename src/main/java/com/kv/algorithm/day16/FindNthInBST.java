package com.kv.algorithm.day16;

import com.kv.algorithm.day15.BuildTreeNode;
import com.kv.algorithm.day15.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindNthInBST {

    static void dfs(TreeNode root, List<Integer> sort) {
        if (root == null)
            return;


        dfs(root.getLeft(), sort);
        sort.add(root.getKey());
        dfs(root.getRight(), sort);

    }

    public static void main(String[] args) {
        TreeNode node = BuildTreeNode.dfsInit();
        List<Integer> sort = new ArrayList<>();
        dfs(node, sort);
        System.out.println(sort);

    }
}
