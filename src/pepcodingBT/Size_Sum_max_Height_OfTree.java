package pepcodingBT;

import pepcodingBT.Main.Node;

public class Size_Sum_max_Height_OfTree {
	
	int size=0,sum=0,max=Integer.MIN_VALUE,h=0;
	public  int size(Node root)
	{
		helper(root);
		
		return size;
	}
	public int sum(Node root)
	{
		if(root==null) return 0;
		int ls=sum(root.left);
		int rs=sum(root.right);
		
		int ts=ls+rs+root.data;
		
		return ts;
		
	}
	public  int max(Node root)
	{
		helper(root);
		
		return max;
		
	}
	public  int height(Node root)
	{
		if(root==null) return -1;
		
		int lh=height(root.left);
		int rh=height(root.right);
		
		int th= lh+rh+1;
		return th;
		
	}
	public void helper(Node root)
	{
		if(root==null) return;
		
		size++;
		max=Math.max(max, root.data);
		
		helper(root.left);
		helper(root.right);
		
	}

}
