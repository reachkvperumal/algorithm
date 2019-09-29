package com.kv.algorithm.day15;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeNode {

    public final static Map<Integer, TreeNode> KEYS = new HashMap<>();

    public static Map<Integer, TreeNode> KEYS_TO_DELETE = new HashMap<>();

    public static final Map<Integer, TreeNode> KEYS_DFS = new HashMap<>();

    public final static Map<Integer, TreeNode> KEYS_PRED_SUCC = new HashMap<>();


    public static TreeNode getNode(int key) {
        return KEYS.get(key);
    }

    public static TreeNode getNodeForDeletion(int key) {
        return KEYS_TO_DELETE.get(key);
    }

    public static TreeNode getKeysPredSucc(int key) {
        return KEYS_PRED_SUCC.get(key);
    }

    public static TreeNode initSuccessorAndPredecssor() {
        TreeNode fourtyFour = new TreeNode(44);
        KEYS_PRED_SUCC.put(44, fourtyFour);
        TreeNode eighty = new TreeNode(80);
        KEYS_PRED_SUCC.put(80, eighty);
        TreeNode seventySix = new TreeNode(76);
        KEYS_PRED_SUCC.put(76, seventySix);
        TreeNode eightyTwo = new TreeNode(82);
        KEYS_PRED_SUCC.put(82, eightyTwo);
        TreeNode sixtyFive = new TreeNode(65);
        KEYS_PRED_SUCC.put(65, sixtyFive);
        TreeNode eightyEight = new TreeNode(88);
        KEYS_PRED_SUCC.put(88, eightyEight);
        TreeNode nintySeven = new TreeNode(97);
        KEYS_PRED_SUCC.put(97, nintySeven);
        TreeNode nintyThree = new TreeNode(93);
        KEYS_PRED_SUCC.put(93, nintyThree);
        TreeNode fiftyFour = new TreeNode(54);
        KEYS_PRED_SUCC.put(54, fiftyFour);
        TreeNode seventeen = new TreeNode(17);
        KEYS_PRED_SUCC.put(17, seventeen);
        TreeNode eight = new TreeNode(8);
        KEYS_PRED_SUCC.put(8, eight);
        TreeNode twentyEight = new TreeNode(28);
        KEYS_PRED_SUCC.put(28, twentyEight);
        TreeNode twentyNine = new TreeNode(29);
        KEYS_PRED_SUCC.put(29, twentyNine);
        TreeNode sixtyEight = new TreeNode(68);
        KEYS_PRED_SUCC.put(68, sixtyEight);

        fourtyFour.setLeft(seventeen);
        seventeen.setLeft(eight);
        seventeen.setRight(twentyEight);
        twentyEight.setRight(twentyNine);

        fourtyFour.setRight(eightyEight);
        eightyEight.setRight(nintySeven);
        nintySeven.setLeft(nintyThree);

        eightyEight.setLeft(sixtyFive);
        sixtyFive.setLeft(fiftyFour);
        sixtyFive.setRight(eightyTwo);
        eightyTwo.setLeft(seventySix);
        seventySix.setLeft(sixtyEight);
        seventySix.setRight(eighty);
        return fourtyFour;
    }


    public static TreeNode initDeletion() {
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


    public static TreeNode init() {
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

    public static TreeNode dfsInit() {
        TreeNode ten = new TreeNode(10);
        KEYS_DFS.put(10, ten);

        TreeNode three = new TreeNode(3);
        ten.setLeft(three);
        KEYS_DFS.put(3, three);

        TreeNode one = new TreeNode(1);
        three.setLeft(one);
        KEYS_DFS.put(1, one);

        TreeNode seven = new TreeNode(7);
        three.setRight(seven);
        KEYS_DFS.put(7, seven);

        TreeNode five = new TreeNode(5);
        seven.setLeft(five);
        KEYS_DFS.put(5, five);

        TreeNode eight = new TreeNode((8));
        seven.setRight(eight);
        KEYS_DFS.put(8, eight);

        TreeNode eleven = new TreeNode(11);
        ten.setRight(eleven);
        KEYS_DFS.put(11, eleven);

        TreeNode thirteen = new TreeNode(13);
        eleven.setRight(thirteen);
        KEYS_DFS.put(13, thirteen);

        TreeNode twelve = new TreeNode(12);
        thirteen.setLeft(twelve);
        KEYS_DFS.put(12, twelve);

        return ten;
    }

    public static TreeNode getDfs(int key) {
        return KEYS_DFS.get(key);
    }
}
