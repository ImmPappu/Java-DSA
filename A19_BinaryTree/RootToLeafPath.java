package A19_BinaryTree;
import java.util.*;
public class RootToLeafPath {
    static void main(String[] args) {
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
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr,ans);
        return ans;
    }

    public void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans) {
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null && root.right==null){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
        }
        dfs(root.left,arr,ans);
        dfs(root.right,arr,ans);
        arr.remove(arr.size()-1);
    }

}
