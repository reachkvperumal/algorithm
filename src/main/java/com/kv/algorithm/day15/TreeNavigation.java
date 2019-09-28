package com.kv.algorithm.day15;

import java.util.Optional;

public class TreeNavigation {

    static TreeNode findSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return null;

        if (p.getRight() != null) {
            TreeNode current = p.getRight();
            while (current.getLeft() != null)
                current = current.getLeft();
            return current;
        }

        TreeNode ancestor = null;
        TreeNode current = root;
        while (current.getKey() != p.getKey()) {
            if (p.getKey() < current.getKey()) {
                ancestor = current;
                current = current.getLeft();
            } else
                current = current.getRight();
        }
        return ancestor;
    }

    static TreeNode findPredecessor(TreeNode root, TreeNode p) {
        if (root == null) return null;
        if (p.getLeft() != null) {
            TreeNode current = p.getLeft();
            while (current.getRight() != null)
                current = current.getRight();
            return current;
        }

        TreeNode ancestor = null;
        TreeNode current = root;
        while (current.getKey() != p.getKey()) {
            if (p.getKey() < current.getKey())
                current = current.getLeft();
            else {
                ancestor = current;
                current = current.getRight();
            }
        }
        return ancestor;
    }


    public static void main(String[] args) {
        TreeNode nodes = BuildTreeNode.init();
        TreeNode deletion = BuildTreeNode.initDeletion();

        Optional.ofNullable(findSuccessor(nodes, BuildTreeNode.getNode(82))).map(o -> {
            System.out.println(o);
            return o;
        }).orElseGet(
                () -> {
                    System.out.println("NO SUCCESSOR");
                    return null;
                });

        Optional.ofNullable(findPredecessor(nodes, BuildTreeNode.getNode(82))).map(o -> {
            System.out.println(o);
            return o;
        }).orElseGet(
                () -> {
                    System.out.println("NO PREDECESSOR");
                    return null;
                });

        System.out.println(BuildTreeNode.getNode(76) == BuildTreeNode.getNodeForDeletion(76));
    }

}
