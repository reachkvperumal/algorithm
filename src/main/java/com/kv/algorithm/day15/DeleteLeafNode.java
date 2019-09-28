package com.kv.algorithm.day15;

public class DeleteLeafNode {

    static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        TreeNode current = root;
        TreeNode previous = null;

        while (current != null) {
            if (current.getKey() == key)
                break;
            else if (key < current.getKey()) {
                previous = current;
                current = current.getLeft();
            } else {
                previous = current;
                current = current.getRight();
            }
        }

        if (previous == null)
            return null;
        else if (current.getLeft() == null & current.getRight() == null) {
            if (previous.getLeft() == current)
                previous.setLeft(null);
            else
                previous.setRight(null);
        }

        return root;
    }

    static TreeNode findNode(TreeNode root, int key) {
        if (root == null)
            return null;

        TreeNode current = root;
        while (current != null) {
            if (current.getKey() == key)
                break;
            else if (key < current.getKey())
                current = current.getLeft();
            else
                current = current.getRight();
        }

        return current;
    }

    public static void main(String[] args) {
        TreeNode root = BuildTreeNode.initDeletion();
        System.out.println(root);
        System.out.println(findNode(root, 68));

        System.out.println(findNode(deleteNode(root, 68), 68));


    }

}
