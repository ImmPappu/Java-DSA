package A19_BinaryTree;

public class PathSum {
    static void main(String[] args) {
        //Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        //Output: true
        //Explanation: The root-to-leaf path with the target sum is shown.
    }
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root==null) return false;
            if(root.left==null && root.right==null){
                if(targetSum==root.val) return true;
                else return false;
            }
            return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
        }
    }
}
