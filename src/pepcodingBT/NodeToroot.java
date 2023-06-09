package pepcodingBT;

import pepcodingBT.Main.Node;
import java.util.*;
public class NodeToroot {
	static ArrayList<Integer> li= new ArrayList<>();
	
	
	public static boolean NodeToRoot(Node root,int data)
	{
		if(root==null)
		{
			return false;
		}
		
		if(root.data==data)
		{
			li.add(root.data);
			return true;
		}
		boolean fil=NodeToRoot(root.left,data);
				if(fil) 
					{
					li.add(root.data);
					return true;
					}
		boolean fir=NodeToRoot(root.right,data);
				if(fir) 
					{
					li.add(root.data);
					return true;
					}
		
		return false;
	}
	
	public static ArrayList<Integer> getNodeToRoot()
	{
		return li;
	}

}
