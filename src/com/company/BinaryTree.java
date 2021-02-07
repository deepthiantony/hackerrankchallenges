package com.company;

public class BinaryTree {
    Node root;
    public Node addNodeRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            addNodeRecursive(current.left, value);
        } else if (value > current.value) {
            addNodeRecursive(current.right, value);
        } else {
            System.out.println("value already exists");
            return current;
        }
        return current;

    }
    public void add(int value){
        addNodeRecursive(root,value);
    }
}
