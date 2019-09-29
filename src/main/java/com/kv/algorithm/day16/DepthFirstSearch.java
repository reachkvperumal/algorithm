package com.kv.algorithm.day16;

import com.kv.algorithm.day15.BuildTreeNode;
import com.kv.algorithm.day15.TreeNode;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DepthFirstSearch {

    private final static TreeNodeN NARRAY = new TreeNodeN(1);

    static {
        NARRAY.setChilds(IntStream
                .rangeClosed(2, 7)
                .mapToObj(TreeNodeN::new)
                .collect(Collectors.toList()));
    }

    static void dfsWithChildrens(TreeNodeN root) {
        if (root == null)
            return;
        System.out.println(root.getKey());
        if (root.getChilds() != null) {
            for (TreeNodeN n : root.getChilds()) {
                dfsWithChildrens(n);

            }
        }
    }

    static void dfs(TreeNode root) {
        if (root == null)
            return;

        System.out.println(root.getKey());
        dfs(root.getLeft());
        dfs(root.getRight());
    }

    static void dfsPrintPretty(TreeNodeN root, int counter) {
        if (root == null)
            return;

        System.out.format("%1$" + counter + "s", " ");


        System.out.println(root.getKey());

        if (Objects.nonNull(root.getChilds())) {
            for (TreeNodeN n : root.getChilds())
                dfsPrintPretty(n, counter + 1);
        }
    }

    public static void main(String[] args) {
        TreeNode node = BuildTreeNode.dfsInit();
        //   dfs(node);
        // dfsWithChildrens(NARRAY);

        //dfs(BreathFirstSearch.init());
        dfsPrintPretty(NARRAY, 1);


    }
}
