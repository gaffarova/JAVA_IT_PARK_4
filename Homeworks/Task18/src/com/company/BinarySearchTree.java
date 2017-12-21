package com.company;

public class BinarySearchTree {

    public Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int number) {

        Node newNode = new Node(number);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node previous;

        while (true) {
            previous = current;
            if (number < current.data) {
                current = current.left;
                if (current == null) {
                    previous.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    previous.right = newNode;
                    return;
                }
            }
        }
    }

    public void preOrderSearch() {
        preOrderSearch(root);
    }

    public void postOrderSearch() {
        postOrderSearch(root);
    }

    public void inOrderSearch() {
        inOrderSearch(root);
    }

    private void preOrderSearch(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            preOrderSearch(node.left);
            preOrderSearch(node.right);
        }
    }

    private void postOrderSearch(Node node) {
        if (node != null) {
            postOrderSearch(node.left);
            postOrderSearch(node.right);
            System.out.println(node.data + " ");
        }
    }

    private void inOrderSearch(Node node) {
        if (node != null) {
            inOrderSearch(node.left);
            System.out.println(node.data + " ");
            inOrderSearch(node.right);
        }
    }
}
