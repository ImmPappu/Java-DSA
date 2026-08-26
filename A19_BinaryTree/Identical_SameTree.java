package A19_BinaryTree;

public class Identical_SameTree {
    static void main(String[] args) {

    }
    public boolean isIdentical(Node r1, Node r2) {
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val) return false;
        return isIdentical(r1.left,r2.left) && isIdentical(r1.right,r2.right);
    }
}
