package com.kv.algorithm.day16;

import com.kv.algorithm.day15.BuildTreeNode;
import com.kv.algorithm.day15.TreeNode;

import java.util.Optional;

public class SuccessorAndPredecessor {

    static TreeNode findSuccessor(TreeNode root, TreeNode p) {
        if (root == null)
            return root;

        if (p.getRight() != null) {
            TreeNode current = p.getRight();
            while (current.getLeft() != null)
                current = current.getLeft();
            return current;
        }

        TreeNode current = root;
        TreeNode parent = null;

        while (p.getKey() != current.getKey()) {
            if (p.getKey() < current.getKey()) {
                parent = current;
                current = current.getLeft();
            } else
                current = current.getRight();
        }
        return parent;
    }

    static TreeNode findPredecessor(TreeNode root, TreeNode p) {
        if (root == null)
            return root;

        if (p.getLeft() != null) {
            TreeNode current = p.getLeft();
            while (current.getRight() != null)
                current = current.getRight();
            return current;
        }

        TreeNode current = root;
        TreeNode parent = null;
        while (p.getKey() != current.getKey()) {
            if (p.getKey() < current.getKey())
                current = current.getLeft();
            else {
                parent = current;
                current = current.getRight();
            }
        }
        return parent;
    }

    static String getValue(TreeNode v) {
        return Optional.ofNullable(v).map(o -> String.valueOf(o.getKey())).orElseGet(() -> "N/A");
    }

    public static void main(String[] args) {
        TreeNode root = BuildTreeNode.initSuccessorAndPredecssor();
        int input = 80;
        System.out.printf("For: %d%n Predecessor is %s%n Successor is %s%n", input,
                getValue(findPredecessor(root, BuildTreeNode.getKeysPredSucc(input))),
                getValue(findSuccessor(root, BuildTreeNode.getKeysPredSucc(input))));

        input = 97;
        System.out.printf("For: %d%n Predecessor is %s%n Successor is %s%n", input,
                getValue(findPredecessor(root, BuildTreeNode.getKeysPredSucc(input))),
                getValue(findSuccessor(root, BuildTreeNode.getKeysPredSucc(input))));


    }
}
