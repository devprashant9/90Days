package Foundation.BinaryTree;

public class BasicOperation {

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

    public static void insert(int data) {
        root = insertNode(root, data);
    }

    public static Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    // pre-order traversal -> euler path
    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // in-order traversal
    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    // post-order traversal -> euler path
    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // count Nodes
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        insert(60);
        insert(10);
        insert(70);
        insert(20);
        insert(40);
        preOrderTraversal(root);
        System.out.println("\nRoot is At: " + root.data);
        // inOrderTraversal(root);
        // postOrderTraversal(root);
        int nodes = countNodes(root);
        System.out.println("\nNumber of Nodes: " + nodes);
    }
}

// 60
// / \
// 10 70
// \
// 20
// \
// 40