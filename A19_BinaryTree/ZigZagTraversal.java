package A19_BinaryTree;
import java.util.*;
public class ZigZagTraversal {
    static void main(String[] args) {

    }
    class Solution {
        class Pair{
            TreeNode node;
            int level;
            Pair(TreeNode node,int level){
                this.node=node;
                this.level=level;
            }
        }
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> arr = new ArrayList<>();
            bfs(root,arr,ans);

            // Reverse odd levels AFTER BFS is complete
            // Main Line for this ,ans arraylist ke odd place ke arraylist ko reverse kar do
            for (int i = 1; i < ans.size(); i += 2) {
                Collections.reverse(ans.get(i));
            }
            return ans;
        }
        public void bfs(TreeNode root , List<Integer> arr , List<List<Integer>> ans){
            if(root==null) return;
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(root,0));

            while(q.size()>0){
                Pair front = q.remove();
                TreeNode node = front.node;
                int level = front.level;

                if(ans.size() <= level){  //agar 0 level pr hai toh ek naya arraylist add kardia
                    ans.add(new ArrayList<>());
                }
                ans.get(level).add(node.val);    // ab uss naye arraylist me node ki value add karte jao
                if(node.left!=null) q.add(new Pair(node.left,level+1));
                if(node.right!=null) q.add(new Pair(node.right,level+1));
            }
        }
    }
}
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/


//Input: root = [1, 2, 3, 4, 5, 6, 7]
//
//Output: [1, 3, 2, 4, 5, 6, 7]
//Explanation:
//Level 1 (left to right): [1]
//Level 2 (right to left): [3, 2]
//Level 3 (left to right): [4, 5, 6, 7]
//Final result: [1, 3, 2, 4, 5, 6, 7]
class Solution {
    class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(root,ans);
        return ans;
    }
    public void bfs(Node root , ArrayList<Integer> ans){
        if(root==null) return;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));

        ArrayList<Integer> list = new ArrayList<>();
        int currLevel = 0;
        while(q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(level!=currLevel){
                if(currLevel%2!=0){
                    Collections.reverse(list);
                }

                ans.addAll(list);
                list.clear();

                currLevel = level;
            }
            list.add(node.val);

            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));

        }
        // Last level
        if (currLevel % 2 != 0)
            Collections.reverse(list);

        ans.addAll(list);
    }
}