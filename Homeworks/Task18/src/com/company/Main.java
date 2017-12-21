package com.company;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(67);
        binarySearchTree.insert(1);
        binarySearchTree.insert(40);
        binarySearchTree.insert(13);
        binarySearchTree.insert(789);
        binarySearchTree.insert(1000);
        binarySearchTree.insert(90);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(82);

        binarySearchTree.inOrderSearch();
        //binarySearchTree.preOrderSearch();
        //binarySearchTree.postOrderSearch();



    }
}
