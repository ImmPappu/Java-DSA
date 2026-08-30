package A19_BinaryTree;

public class IsBalanceBinaryTree {
    static void main(String[] args) {
        //Input: root = [10, 20, 30, 40, 60]
        //
        //Output: true
        //Explanation: The height difference between the left and
        // right subtrees at all nodes is at most 1. Hence, the tree is balanced.
    }

    class Solution {
        static boolean flag;
        public boolean isBalanced(Node root) {
            if(root==null) return true;
            flag = true;
            levels(root);
            return flag;
        }
        public int levels(Node root){
            if(root==null) return 0;
            int leftLevels = levels(root.left);
            int rightLevels = levels(root.right);
            if(Math.abs(leftLevels-rightLevels) > 1) flag = false;
            return 1 + Math.max(leftLevels , rightLevels);
        }
    }
}
