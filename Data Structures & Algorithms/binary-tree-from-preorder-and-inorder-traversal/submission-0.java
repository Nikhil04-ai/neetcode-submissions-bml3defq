/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    HashMap <Integer , Integer > map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         for(int i=0; i<inorder.length ; i++){
            map.put(inorder[i] , i);
         }
         return solve(preorder , 0 , preorder.length - 1 , inorder , 0 , inorder.length -1 );
    }
    public TreeNode solve(int [] preorder , int prestart , int preend , int [] inorder , int instart , int  inend){
        if(prestart > preend){
            return null;
        }

        int rootval = preorder[prestart];
        TreeNode root = new TreeNode(rootval);

        int mid = map.get(rootval);
         int leftsize = mid - instart;

        root.left = solve(preorder , prestart +1 , prestart + leftsize , inorder , instart , mid -1 );
        root.right = solve(preorder , prestart + leftsize + 1 , preend , inorder , mid + 1 , inend );

        return root;
    }
}
