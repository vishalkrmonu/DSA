//  binary tree traversal(inorder,preorder,postorder): leetcode

// Level order traversal


// class Solution
// {
//     //Function to return the level order traversal of a tree.
//     static ArrayList <Integer> levelOrder(Node node) 
//     {
//         // Your code here
//         ArrayList<Integer> ans=new ArrayList<>();
//         Queue<Node> q=new LinkedList<>();
//         q.add(node);
//         while(!q.isEmpty()){
//             Node x=q.remove();
//             if(x.left!=null){
//                 q.add(x.left);
//             }
//             if(x.right!=null){
//                 q.add(x.right);
//             }
//                 ans.add(x.data);
//         }
//         return ans;
//     }
// }
class HelloWorld {
    public static void main(String[] args){
        int[]  x = {120, 200, 016};
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
 }}
}