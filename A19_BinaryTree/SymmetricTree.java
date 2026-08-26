package A19_BinaryTree;

public class SymmetricTree {
    static void main(String[] args) {

    }
    void mirror(Node root) {
        if(root==null) return ;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }

    public boolean isIdentical(Node r1, Node r2) {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val) return false;
        return isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }
    public boolean isSymmetric(Node root) {
        mirror(root.left);
        return isIdentical(root.left,root.right);



    }
}
