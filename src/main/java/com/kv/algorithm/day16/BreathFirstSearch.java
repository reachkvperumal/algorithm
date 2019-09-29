package com.kv.algorithm.day16;

import com.kv.algorithm.day15.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class BreathFirstSearch {

    private final static Map<Integer, TreeNode> NODES = IntStream
            .rangeClosed(1, 7)
            .mapToObj(TreeNode::new)
            .collect(toMap(TreeNode::getKey, Function.identity()));

    private final static TreeNodeN NARRAY = new TreeNodeN(1);

    static {
        NARRAY.setChilds(IntStream
                .rangeClosed(2, 7)
                .mapToObj(TreeNodeN::new)
                .collect(Collectors.toList()));
    }


    public static TreeNode init() {
        for (int i = 1; i < 4; i++) {
            int index = i * 2;
            TreeNode node = NODES.get(i);
            node.setLeft(NODES.get(index));
            node.setRight(NODES.get(index + 1));
        }
        return NODES.get(1);
    }

    static void levelOrder(TreeNode root) {
        if (root == null)
            return;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            System.out.println(node.getKey());

            if (node.getLeft() != null)
                deque.add(node.getLeft());

            if (node.getRight() != null)
                deque.add(node.getRight());
        }
    }

    static void levelOrderWithChilds(TreeNodeN root) {
        if (root == null)
            return;

        Deque<TreeNodeN> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            TreeNodeN node = deque.poll();
            System.out.println(node.getKey());

            if (node.getChilds() != null && node.getChilds().size() > 0) {
                for (TreeNodeN child : node.getChilds())
                    deque.add(child);
            }
        }
    }

    public static void main(String[] args) {
        levelOrder(init());
        System.out.println();

        levelOrderWithChilds(NARRAY);

    }
}
