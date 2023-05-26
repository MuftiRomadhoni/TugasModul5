public class tugas {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class BinaryTree {
        public Node root;

        public void newNode(int data) {
            root = newNode(root, new Node(data));
        }

        private Node newNode(Node root, Node newData) {
            if (root == null) {
                root = newData;
                return root;
            }
            if (newData.data < root.data) {
                root.left = newNode(root.left, newData);
            } else {
                root.right = newNode(root.right, newData);
            }
            return root;
        }
        public void inOrder (Node node) {
            if (node != null) {
                inOrder (node.left);
                System.out.print (node.data + " ");
                inOrder(node.right);
            }
        }
        public void preOrder (Node node) {
            if (node != null) {
                System.out.print(node.data + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }
        public void postOrder (Node node) {
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data + " ");
            }
        }
    }

    public static class Main{

        public static void main(String[] args) {
            BinaryTree pohon = new BinaryTree();
            pohon.newNode(20);
            pohon.newNode(2);
            pohon.newNode(25);
            pohon.newNode(37);
            pohon.newNode(16);
            System.out.println("In Order : ");
            pohon.inOrder(pohon.root);
            System.out.println("\nPre Order : ");
            pohon.preOrder(pohon.root);
            System.out.println("\nPost Order : ");
            pohon.postOrder(pohon.root);
        }
    }
}


