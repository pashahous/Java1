package D10;

public class Node {
    public int value;
    public Node left = null;
    public Node right = null;

    public static void main(String[] args) {
        Node root = new Node(20);
        root.addNode(new Node(14), root);
        root.addNode(new Node(23), root);
        root.addNode(new Node(11), root);
        root.addNode(new Node(16), root);
        root.addNode(new Node(22), root);
        root.addNode(new Node(27), root);
        root.addNode(new Node(5), root);
        root.addNode(new Node(15), root);
        root.addNode(new Node(18), root);
        root.addNode(new Node(24), root);
        root.addNode(new Node(150), root);
        root.addNode(new Node(8), root);
        System.out.println("-------------------------");

        Node.printBinaryTreeAsc(root);
        System.out.println("------------");
        Node.printBinaryTreeDesc(root);
    }

    public Node(int value) {
        this.value = value;
    }

    public static void printBinaryTreeAsc(Node root) {

        if (root != null) {
            printBinaryTreeAsc(root.left);
            System.out.print(root.value + " ");
            printBinaryTreeAsc(root.right);

        }
    }

    public static void printBinaryTreeDesc(Node root) {

        if (root != null) {
            printBinaryTreeAsc(root.right);
            System.out.print(root.value + " ");
            printBinaryTreeAsc(root.left);

        }
    }

    public void addNode(Node node, Node tree) {
        if (node.value < tree.value) {
            if (tree.left == null) tree.left = node;
            else addNode(node, tree.left);

        } else if (node.value > tree.value) {
            if (tree.right == null) tree.right = node;
            else addNode(node, tree.right);

        }
    }
}