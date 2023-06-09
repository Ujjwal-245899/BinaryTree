package pepcodingBT;

import pepcodingBT.Main.Node;

public class TraversalsOfTree {
	
	public void PreOrder(Node root)
	{
		if(root==null) return ;
		
		System.out.println(root.data+" Pre-Order");// follows N->L->R
		
		PreOrder(root.left);
		PreOrder(root.right);
		
	}
	public void Inorder(Node root)
	{
		if(root==null) return ;
		
		Inorder(root.left);
		System.out.println(root.data+"in-order");//follows L->N->R
		Inorder(root.right);
	
		
	}
	public void PostOrder(Node root)
	{
		if(root==null) return ;
		PostOrder(root.left);
		PostOrder(root.right);
		
		System.out.println(root.data+"post-order");
		
	}

}
