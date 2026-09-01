package A19_BinaryTree;

public class LowestCommonAncestor {
    Node lca(Node root, int n1, int n2) {
        if(root==null) return null;
        if(root.val==n1 || root.val==n2) return root;
        Node l = lca(root.left,n1,n2);
        Node r = lca(root.right,n1,n2);
        if(l!=null && r!=null) return root;
        return (l==null) ? r:l;
    }
    //If p and q are nodes , not an integer
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null) ? r:l;
    }
}
