package A19_BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
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
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(product(a));
//        System.out.println(max(a));
//        System.out.println(levels(a));
//        preorder(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
//        inorder(a);
//          levelOrder(a);
        levelOrderLineWise(a);


    }

    private static void levelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currlevel = 0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level!=currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(node.left!=null) q.add(new Pair(node.left,currlevel+1));
            if(node.right!=null) q.add(new Pair(node.right,currlevel+1));
        }
    }
    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    public ArrayList<Integer> levelOrders(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            ans.add(front.val);
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        return ans;
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
        return Math.max(root.val , Math.max(max(root.left) ,max(root.right))); //1 for root itself;
    }
    private static void preorder(Node root) {
        if(root==null) return;
        System.out.print(root.val +" ");    //root
        preorder(root.left);                 //left
        preorder(root.right);                //right
    }
    private static void postorder(Node root) {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    private static void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }
    private static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(
                levels(root.left),
                levels(root.right)
        );
        //              3
        //             / \
        //            4   2
        //           / \ / \
        //         -1  1 6  9
        
        //              3
        //              ↓
        //       1 + max(2, 2)
        //            /     \
        //           /       \
        //          4         2
        //          ↓         ↓
        //      1+max(1,1)  1+max(1,1)
        //          ↓         ↓
        //         2          2
    }
}
