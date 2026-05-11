import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class find_right_sibling {

    public static int right_sibling(Node root, int key) {

        if (root == null)
            return -1;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node curr = q.poll();
                if (curr.data == key) {

                    if (i == size - 1) {
                        return -1;
                    }
                    return q.peek().data;
                }

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             /     \
            5       8
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(5);
        root.right.right = new Node(8);

        int key = 5;

        int ans = right_sibling(root, key);

        System.out.println("Right sibling of " + key + " is: " + ans);
    }
}