package com.ds;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] keys = {15, 3, 4, 11, 8, 9, 13, 14, 17, 12, 16, 19, 10, 1, 2};
        Arrays.sort(keys);
        Node<Integer> root = TreeMethods.generateBalancedTree(keys, 0, keys.length - 1);
        TreeMethods.print(root, 0);
        TreeMethods.invert(root);
        TreeMethods.print(root, 0);
    }
}
