package A19_BinaryTree;

public class MirrorTree {
    static void main(String[] args) {
        //Input: root = [1, 2, 3, N, N, 4]
        //Output: [1, 3, 2, N, 4]
        //Explanation
        //In the inverted tree, every non-leaf node has its left and right child interchanged.
    }
    // class Solution {
//     void mirror(Node root) {
//         if(root==null) return ;
//         Node temp = root.left;
//         root.left = root.right;
//         root.right = temp;
//         mirror(root.left);
//         mirror(root.right);
//     }
// }
        void mirror(Node root) {
            if(root==null) return ;
            // Pehle left subtree ko mirror karo
            mirror(root.left);

            // Current node ke left/right swap karo
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            // Swap ke baad jo right subtree hai,
            // woh actually old left subtree hai
            mirror(root.right);
    }
}
