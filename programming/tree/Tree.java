package programming.tree;

public class Tree {
    int value;
    Tree left;
    Tree right;


    public static void main(String[] args) {
        Tree root = new Tree(1,
                new Tree(2,
                        new Tree(3,null,null),
                        new Tree(4,null,null)),
                new Tree(5,null,null));
        System.out.println(Tree.sumREcursive(root));
        System.out.println(Tree.sumStack(root));

    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

       public static int sumREcursive(Tree root) {
        int sum = root.value;
        if (root.left != null) {
            sum += sumREcursive(root.left);

        }
        if (root.right != null) {
            sum += sumREcursive(root.right);
        }
        return sum;

    }

    public static int sumStack(Tree root){
        SimpleStack<Tree> stack = new SimpleStack<>();
        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty() ){
         Tree node = stack.pop();
         sum = sum + node.value;
            System.out.println(node.value);

         if (node.left != null){
             stack.push(node.left);
         }
         if (node.right != null){
             stack.push(node.right);
         }
     }
        return sum;
    }
}
