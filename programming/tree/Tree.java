package programming.tree;

public class Tree {
    int value;
    Tree left;
    Tree right;


    public static void main(String[] args) {
        Tree root = new Tree(1,
                new Tree(2,
                        new Tree(21),
                        new Tree(22, null,new Tree(32))),
                new Tree(5,
                        new Tree(51), new Tree(52)));
        System.out.println(Tree.sumRecursive(root) + " \n");
        System.out.println(Tree.sumStack(root) + " \n");
        System.out.println(Tree.sumQueue(root) + " \n");

    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static int sumRecursive(Tree root) {
        int sum = root.value;
        System.out.print( root.value + " ");
        if (root.left != null) {
            sum += sumRecursive(root.left);
        }
        if (root.right != null) {
            sum += sumRecursive(root.right);

        }
        return sum;

    }

    public static int sumStack(Tree root) {
        // find
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            sum = sum + node.value;
            System.out.print(node.value + " ");

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return sum;
    }

    public static int sumQueue(Tree root) {
        SimpleQueue<Tree> queue = new SimpleQueue<>();
        queue.push(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            Tree node = queue.pop();
            int value1 = node.value;
            System.out.print(value1 + " ");
            sum = sum + value1;
            if (node.left != null) {
                queue.push(node.left);
            }
            if (node.right != null) {
                queue.push(node.right);
            }

        }
        return sum;
    }
}
