class TreeNode {

    int data;
    TreeNode left, right;

    // Constructor
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {

    TreeNode root;

    // Insert Node
    TreeNode insert(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }

        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Search Node
    boolean search(TreeNode root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    // Find Minimum Value Node
    TreeNode minValue(TreeNode root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    // Delete Node
    TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        }

        else if (key > root.data) {
            root.right = delete(root.right, key);
        }

        else {

            // Node with one child or no child
            if (root.left == null) {
                return root.right;
            }

            else if (root.right == null) {
                return root.left;
            }

            // Node with two children
            TreeNode temp = minValue(root.right);

            root.data = temp.data;

            root.right = delete(root.right, temp.data);
        }

        return root;
    }

    // Inorder Traversal
    void inorder(TreeNode root) {

        if (root != null) {

            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }
    }

    // Preorder Traversal
    void preorder(TreeNode root) {

        if (root != null) {

            System.out.print(root.data + " ");

            preorder(root.left);

            preorder(root.right);
        }
    }

    // Postorder Traversal
    void postorder(TreeNode root) {

        if (root != null) {

            postorder(root.left);

            postorder(root.right);

            System.out.print(root.data + " ");
        }
    }
}

public class BSTImplementation {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Insert Nodes
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        // Inorder Traversal
        System.out.println("Inorder Traversal:");
        bst.inorder(bst.root);

        // Preorder Traversal
        System.out.println("\nPreorder Traversal:");
        bst.preorder(bst.root);

        // Postorder Traversal
        System.out.println("\nPostorder Traversal:");
        bst.postorder(bst.root);

        // Search Node
        int key = 40;

        if (bst.search(bst.root, key)) {
            System.out.println("\nNode " + key + " Found");
        } else {
            System.out.println("\nNode " + key + " Not Found");
        }

        // Delete Node
        bst.root = bst.delete(bst.root, 70);

        System.out.println("\nInorder Traversal After Deletion:");
        bst.inorder(bst.root);
    }
}