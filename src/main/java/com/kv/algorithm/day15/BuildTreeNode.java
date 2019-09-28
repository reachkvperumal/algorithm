package com.kv.algorithm.day15;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeNode {

    private final static Map<Integer, TreeNode> KEYS = new HashMap<>();

    private static Map<Integer, TreeNode> KEYS_TO_DELETE = new HashMap<>();


    static TreeNode getNode(int key) {
        return KEYS.get(key);
    }

    static TreeNode getNodeForDeletion(int key) {
        return KEYS_TO_DELETE.get(key);
    }

    static TreeNode initDeletion() {
        TreeNode fourtyFour = new TreeNode(44);
        KEYS_TO_DELETE.put(44, fourtyFour);
        TreeNode eighty = new TreeNode(80);
        KEYS_TO_DELETE.put(80, eighty);
        TreeNode seventySix = new TreeNode(76);
        KEYS_TO_DELETE.put(76, seventySix);
        TreeNode sixtyEight = new TreeNode(68);
        KEYS_TO_DELETE.put(68, sixtyEight);
        TreeNode eightyTwo = new TreeNode(82);
        KEYS_TO_DELETE.put(82, eightyTwo);
        TreeNode sixtyFive = new TreeNode(65);
        KEYS_TO_DELETE.put(65, sixtyFive);
        TreeNode eightyEight = new TreeNode(88);
        KEYS_TO_DELETE.put(88, eightyEight);
        TreeNode nintySeven = new TreeNode(97);
        KEYS_TO_DELETE.put(97, nintySeven);
        TreeNode nintyThree = new TreeNode(93);
        KEYS_TO_DELETE.put(93, nintyThree);
        TreeNode fiftyFour = new TreeNode(54);
        KEYS_TO_DELETE.put(54, fiftyFour);
        TreeNode seventeen = new TreeNode(17);
        KEYS_TO_DELETE.put(17, seventeen);
        TreeNode eight = new TreeNode(8);
        KEYS_TO_DELETE.put(8, eight);
        TreeNode thirtyTwo = new TreeNode(32);
        KEYS_TO_DELETE.put(32, thirtyTwo);
        TreeNode twentyEight = new TreeNode(28);
        KEYS_TO_DELETE.put(28, twentyEight);
        TreeNode twentyNine = new TreeNode(29);
        KEYS_TO_DELETE.put(29, twentyNine);

        fourtyFour.setLeft(seventeen);
        seventeen.setLeft(eight);
        seventeen.setRight(thirtyTwo);
        thirtyTwo.setLeft(twentyEight);
        twentyEight.setRight(twentyNine);

        fourtyFour.setRight(eightyEight);
        eightyEight.setRight(nintySeven);
        nintySeven.setLeft(nintyThree);

        eightyEight.setLeft(sixtyFive);
        sixtyFive.setLeft(fiftyFour);
        sixtyFive.setRight(eightyTwo);
        eightyTwo.setLeft(seventySix);
        seventySix.setRight(eighty);
        seventySix.setLeft(sixtyEight);

        return fourtyFour;

    }


    static TreeNode init() {
        TreeNode fourtyFour = new TreeNode(44);
        KEYS.put(44, fourtyFour);
        TreeNode eighty = new TreeNode(80);
        KEYS.put(80, eighty);
        TreeNode seventySix = new TreeNode(76);
        KEYS.put(76, seventySix);
        TreeNode eightyTwo = new TreeNode(82);
        KEYS.put(82, eightyTwo);
        TreeNode sixtyFive = new TreeNode(65);
        KEYS.put(65, sixtyFive);
        TreeNode eightyEight = new TreeNode(88);
        KEYS.put(88, eightyEight);
        TreeNode nintySeven = new TreeNode(97);
        KEYS.put(97, nintySeven);
        TreeNode nintyThree = new TreeNode(93);
        KEYS.put(93, nintyThree);
        TreeNode fiftyFour = new TreeNode(54);
        KEYS.put(54, fiftyFour);
        TreeNode seventeen = new TreeNode(17);
        KEYS.put(17, seventeen);
        TreeNode eight = new TreeNode(8);
        KEYS.put(8, eight);
        TreeNode thirtyTwo = new TreeNode(32);
        KEYS.put(32, thirtyTwo);
        TreeNode twentyEight = new TreeNode(28);
        KEYS.put(28, twentyEight);
        TreeNode twentyNine = new TreeNode(29);
        KEYS.put(29, twentyNine);

        fourtyFour.setLeft(seventeen);
        seventeen.setLeft(eight);
        seventeen.setRight(thirtyTwo);
        thirtyTwo.setLeft(twentyEight);
        twentyEight.setRight(twentyNine);

        fourtyFour.setRight(eightyEight);
        eightyEight.setRight(nintySeven);
        nintySeven.setLeft(nintyThree);

        eightyEight.setLeft(sixtyFive);
        sixtyFive.setLeft(fiftyFour);
        sixtyFive.setRight(eightyTwo);
        eightyTwo.setLeft(seventySix);
        seventySix.setRight(eighty);
        return fourtyFour;
    }

}
