package A19_BinaryTree;

public class DiameterOfaBinaryTree {
    static void main(String[] args) {

    }
        static int max;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root==null) return 0;
            max = 0;
            levels(root);
            return max;
        }
        public int levels(TreeNode root){
            if(root==null) return 0;
            int leftlevels = levels(root.left);
            int rightlevels = levels(root.right);
            max = Math.max(max,rightlevels + leftlevels);
            return 1 + Math.max(leftlevels , rightlevels);
        }
    }
