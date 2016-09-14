public class BinaryTreeNode{
    int value;
    TreeNode left;
    TreeNode right;
}

public BinaryTreeNode Construct(int[] preorder,int[] inorder) throws Exception{
    boolean isHave=false;
    if(preorder==null||inorder==null)
        return null;
    if(preorder.length!=inorder.length)
        throw new Exception("The Length of double order are not same!!");
    BinaryTreeNode root=null;
    for(int i=0;i<inorder.length;i++){
        if(inorder[i]==preorder[0]){
            isHave=true;
            root.value=preorder[0];
            root.left=Construct(Arrays.copyOfRange(preorder,1,i+1),Arrays.copyOfRange(inorder,0,i));
            root.right=Construct(Arrays.copyOfRange(preorder,i+1,preorder.length),Arrays.copyOfRange(inorder,i+1,inorder.length));
        }
        if(!isHave)
		{
			throw new Exception("不包含根节点－非法输入");
        }   
    }
    return root;
}