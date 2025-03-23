package Foundation.BinaryTree;

public class BinaryTree {

    public static Node root = null;

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void main(String[] args) {
        Node newNode = new Node(20);
        root = newNode;
        System.out.println(root.data);
        Node newNode1 = new Node(50);
        root.right = newNode1;
        System.out.println(root.right.data);
        Node newNode2 = new Node(10);
        root.left = newNode2;
        System.out.println(root.left.data);

    }
}
