package com.ds;

public class TreeMethods {
    public static <T> Node<T> generateBalancedTree(T[] keys, int low, int high) {
        if (low <= high) {
            int medianIndex = low + (high - low) / 2;
            Node<T> root = new Node<T>(keys[medianIndex]);
            root.setLeft(TreeMethods.generateBalancedTree(keys, low, medianIndex - 1));
            root.setRight(TreeMethods.generateBalancedTree(keys, medianIndex + 1, high));
            return root;
        }

        return null;
    }

    private static <T> void inOrder(Node<T> root) {
        if (root != null) {
            TreeMethods.inOrder(root.getLeft());
            System.out.print(root.getKey() + " ");
            TreeMethods.inOrder(root.getRight());
        }
    }

    public static <T> void print(Node<T> root, int method) {
        if (root != null) {
            switch (method) {
                case 0:
                case 1:
                case 2:
                    TreeMethods.inOrder(root);
                default:
                    break;
            }
            System.out.println("-> END");
        }
    }

    public static <T> void invert(Node<T> root) {
        if (root != null) {
            Node<T> temp = root.getRight();
            root.setRight(root.getLeft());
            root.setLeft(temp);
            TreeMethods.invert(root.getLeft());
            TreeMethods.invert(root.getRight());
        }
    }
}
