package com.kv.algorithm.day15;

public class DeleteNodeWithSingleChild {

    static TreeNode find(TreeNode root, int key) {
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


    static TreeNode delete(TreeNode root, int key) {
        if (root == null)
            return root;

        TreeNode child = null;
        TreeNode parent = null;
        TreeNode current = root;

        while (current != null) {
            if (key == current.getKey()) {
                if (current.getLeft() != null && current.getRight() == null)
                    child = current.getLeft();
                else if (current.getLeft() == null && current.getRight() != null)
                    child = current.getRight();
                break;
            } else if (key < current.getKey()) {
                parent = current;
                current = current.getLeft();
            } else {
                parent = current;
                current = current.getRight();
            }
        }

        if (parent == null) {
            return child;
        } else if (current == parent.getLeft())
            parent.setLeft(child);
        else
            parent.setRight(child);

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = BuildTreeNode.initDeletion();
        TreeNode delete = delete(root, 32);
        // System.out.println(delete);
        // System.out.println(find(delete,17));

        TreeNode fourtyFour = new TreeNode(44);
        TreeNode eighty = new TreeNode(80);
        eighty.setLeft(fourtyFour);
        System.out.println(eighty);
        delete = delete(eighty, 80);

        System.out.println(delete);


    }

}







