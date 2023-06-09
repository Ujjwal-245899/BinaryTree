package pepcodingBT;

import pepcodingBT.Main.Node;
import java.util.ArrayList;
import java.util.Collections;

public class srchngTree {
	ArrayList<Integer> li= new ArrayList<>();
	public Boolean srch(Node root,int x)
	{
		inorder(root);
		Boolean ob=false;
		Collections.sort(li);
		int lo=0;int hi=li.size()-1;
		while(lo<=hi)
		{
			int mid= (lo+hi)/2;
			if(li.get(mid)==x)
			{
				Boolean ob1= true;
				return ob1;
			}
			
			else if(li.get(mid)<x)
			{
				lo=mid+1;
			}
			else 
			{
				hi=mid+1;
			}
		}
		
		
		return ob;
	}
	public void inorder(Node root)
	{
		if(root==null) return ;
		
		inorder(root.left);
		li.add(root.data);
		inorder(root.right);
		
		
		
	}

}
