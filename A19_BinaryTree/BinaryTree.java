package A19_BinaryTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        //      3
        //     /  \
        //    4    2
        //   / \  / \
        // -1  1  6  9

        Node a = new Node(3);  //root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
    }
    private static int size(Node root){
        if(root==null)return 0;
        return 1 + size(root.left)+size(root.right); //1 for root itself;
    }
    private static int sum(Node root){
        /*       sum(3)
                /      \
             sum(4)    sum(2)
             /   \      /   \
        sum(-1) sum(1) sum(6) sum(9)
         */
        if(root==null)return 0;
        return root.val + sum(root.left)+sum(root.right); //1 for root itself;
    }
    private static int product(Node root){
    /*    3 × 4 = 12
          12 × 2 = 24
          24 × (-1) = -24
         -24 × 1 = -24
         -24 × 6 = -144
         -144 × 9 = -1296
                            */
        if(root==null)return 1;
        return root.val * product(root.left) * product(root.right); //1 for root itself;
    }
    private static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return root.val + max(root.left)+max(root.right); //1 for root itself;
    }

    private static void display(Node root) {
        if(root==null) return;
        System.out.print(root.val +" ");    //root
        display(root.left);                 //left
        display(root.right);                //right
    }
}
