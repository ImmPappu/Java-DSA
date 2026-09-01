package A19_BinaryTree;
import java.util.ArrayList;
public class RightViewOfBinaryTree {
    static void main(String[] args) {
        //Input: root = [1, 2, 3, N, N, 4, 5]
        //
        //Output: [1, 3, 5]
    }
    //Using Extra space ArrayList
        public ArrayList<Integer> rightView(Node root) {
            ArrayList<Integer> ans = new ArrayList<>();
            views(root, 0, ans);
            return ans;
        }

        public void views(Node root, int level, ArrayList<Integer> ans) {
            if (root == null) return;
            if (level >= ans.size()) {
                ans.add(root.val);
            } else ans.set(level, root.val);
            views(root.left, level + 1, ans);
            views(root.right, level + 1, ans);
        }
    }
    //WIth using recursion
    public static void flatten(Node root) {
        if(root==null)return;
        Node lst = root.left;
        Node rst = root.right;

        root.left=null;
        root.right=null;

        flatten(lst);
        flatten(rst);

        root.right=lst;
        Node last = root;   //Ye list ke last ka element hoga
        while(last.right!=null) last=last.right;
        last.right=rst;
    }

