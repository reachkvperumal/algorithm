package com.kv.algorithm.day15;

public class DeleteNode {

    static TreeNode find(TreeNode root, int key) {
        TreeNode current = root;
        while (current != null) {
            if (current.getKey() == key)
                return current;
            else if (key < current.getKey())
                current = current.getLeft();
            else
                current = current.getRight();
        }
        return current;
    }

    static TreeNode delete(TreeNode root, int k) {
        TreeNode current = find(root, k);

        TreeNode parent = current;
        TreeNode successor = current.getRight();

        while (successor.getLeft() != null) {
            parent = successor;
            successor = successor.getLeft();
        }
        current.setKey(successor.getKey());

        if (successor == parent.getLeft())
            parent.setLeft(successor.getRight());
        else
            parent.setRight(successor.getRight());

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = BuildTreeNode.initDeletion();
        System.out.println(delete(root, 44));
    }
}
