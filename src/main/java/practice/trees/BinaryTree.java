package practice.trees;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 9/7/13
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTree {

    Node root;

    void insert(int key, String value) {
        Node node = new Node(key, value);
        if (root == null) {
            root = node;
        } else {
            Node current = root; // always start at root
            Node parent;
            while (true) {
                parent = current;
                if (node.key < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    public void traverseInOrder(Node current) {
        if (current != null) {
            traverseInOrder(current.left);
            System.out.println(current.toString());
            traverseInOrder(current.right);
        }
    }

    public void traversePreOrder(Node current) {
        if (current != null) {
            System.out.println(current.toString());
            traversePreOrder(current.left);
            traversePreOrder(current.right);
        }
    }

    public void traversePostOrder(Node current) {
        if (current != null) {
            traversePostOrder(current.left);
            traversePostOrder(current.right);
            System.out.println(current.toString());
        }
    }

    public Node find(int key) {
        Node current = root();
        while (current.key != key) {
            if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }

            if (current == null) {
                return null;
            }
        }
        return current;
    }

    Node root() {
        return root;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(40, "Paul");
        tree.insert(5, "Finn");
        tree.insert(9, "Elena");
        tree.insert(45, "Amanda");
        tree.insert(7, "Jack");
        tree.insert(2, "Roma");
        tree.insert(4, "Grigio");
        tree.insert(1, "Truffles");

        System.out.println("In order...");
        tree.traverseInOrder(tree.root());
        System.out.println("Pre order...");
        tree.traversePreOrder(tree.root());
        System.out.println("Post order...");
        tree.traversePostOrder(tree.root());

        System.out.println("Search for Grigio(5)...");
        System.out.println(tree.find(4));
    }

}

class Node {
    int key;
    String value;

    Node left;
    Node right;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
