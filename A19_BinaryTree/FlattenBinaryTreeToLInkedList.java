package A19_BinaryTree;
import java.util.*;
public class FlattenBinaryTreeToLInkedList {
    public void flatten(TreeNode root) {
        //Input: root = [1,2,5,3,4,null,6]
        //Output: [1,null,2,null,3,null,4,null,5,null,6]
        //Example 2:

        ArrayList<TreeNode> arr = new ArrayList<>();
        dfs(root, arr);
        for(int i =1;i<arr.size();i++){
            arr.get(i-1).right=arr.get(i);
            arr.get(i-1).left=null;
            arr.get(arr.size()-1).left=null;
            arr.get(arr.size()-1).right=null;
        }
    }
    public static void dfs(TreeNode root , ArrayList<TreeNode> arr){
        if(root==null) return;
        arr.add(root);
        dfs(root.left ,arr);
        dfs(root.right,arr);
    }
}
