package pepcodingBT;

import java.util.ArrayList;
import java.util.Stack;

import pepcodingBT.Main.Node;

public class IterativeTraversal {
	ArrayList<Integer> li= new ArrayList<>();
	public ArrayList<Integer> preTraverse(Node root)
	{
		Stack<Node> st= new Stack<>();
		st.push(root);
		
		while(!st.isEmpty())
		{
			Node temp= st.pop();
			
			li.add(temp.data);
			if(temp.right!=null)
			{
				st.push(temp.right);
				
			}
			if(temp.left!=null)
			{
				st.push(temp.left);
			}
		}
		
	return li;
	}

}
