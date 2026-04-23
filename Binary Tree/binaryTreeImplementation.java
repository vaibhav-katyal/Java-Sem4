
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class binaryTreeImplementation{
    Node root;

    public binaryTreeImplementation() {
        root = null;
    }

    void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        binaryTreeImplementation tree = new binaryTreeImplementation();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Root Node: " + tree.root.data);
        System.out.println("Left Child of Root: " + tree.root.left.data);
        System.out.println("Right Child of Root: " + tree.root.right.data);

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);
    }
}