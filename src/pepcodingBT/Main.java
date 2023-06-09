package pepcodingBT;
import java.util.*;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Main {

	//Structure Node Class
	public static class Node
	{
		int data ;
		Node left ;
		Node right;
		
		Node(int data,Node left,Node right)
		{
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
	}
	
	//PAIR CLASS FOR STACK
	
	public static class Pair
	{
		Node node;
		int state;  
		Pair(Node node,int state)
		{
			this.node=node;
			this.state=state;
		}
	}
	
	//  Constructing the main function
	
	public static void main(String args[])
	{
		Integer[] arr= {1,null,2,null,3,null,4,null,5,null,6,null,null};
		Stack<Pair> st= new Stack<>();
		
		Node root= new Node(arr[0],null,null);
		Pair rtp= new Pair(root,1);
		
		st.push(rtp);
		int idx=0;
		while(st.size()>0)
		{
			Pair top= st.peek();
			//-----if we have to add to the left of the tree node
			if(top.state==1)
			{
				
				if(arr[++idx]!=null)
				{		
				Node ln=new Node(arr[idx],null,null);
				
				Pair lp= new Pair(ln,1);
				
				top.node.left=ln;
				
				st.push(lp);
				top.state++;
				}
				
			
			else 
			{
				top.node.left=null;
				top.state++;
				
			}
			
			
			}
		
		//------if the we have to add to right element------>>
			else if(top.state==2)
			{
			
				if(arr[++idx]!=null)
				{		
				Node rn=new Node(arr[idx],null,null);
				
				Pair rp= new Pair(rn,1);
				
				top.node.right=rn;
				
				st.push(rp);
				top.state++;
				}
				else 
				{
					top.node.right=null;
					top.state++;
				}
				
				
				//idx++;
			}
			
	// if both we dontneed to add
			else  
			{
				st.pop();
				
			}
		}
	
		System.out.println("All things have been executed correctly");
		
		DISPLAY.display(root);
		System.out.println("-------------------------------------");
//		
		//finding size sum, max,height in binary tree
		Size_Sum_max_Height_OfTree ob1= new Size_Sum_max_Height_OfTree();
		int size=ob1.size(root);
		int sum=ob1.sum(root);
		int max=ob1.max(root);
		int h=ob1.height(root);
		
		System.out.println(size+"|"+sum+"|"+max+"|"+h);
		System.out.println("----------------------------------------");
		TraversalsOfTree ob= new TraversalsOfTree();
		ob.PreOrder(root);//Applying PREOREDER TARVERSAL
		ob.Inorder(root);//APPLYING INORDER TRAVERSAL
		ob.PostOrder(root);//APPLYING POSTORDER TRAVERSAL
	
		System.out.println("--------------------------------------------------");
		//Applying Searching in bst
		srchngTree s= new srchngTree();
		String f=s.srch(root, 6 )?"found":"Not Founf";
		System.out.println(f);
		System.out.println("------------------------------------------------");
		//applying iterative approach to find out the pre order traversal
		IterativeTraversal it= new IterativeTraversal();
		ArrayList<Integer> li= new ArrayList<>();
		li=it.preTraverse(root);
		System.out.println(li);
		System.out.println("---------------------------------------------------");
		NodeToroot nt= new NodeToroot();
		ArrayList<Integer> result= new ArrayList<>();
		boolean res=NodeToroot.NodeToRoot(root, 8);
		result=NodeToroot.getNodeToRoot();
		System.out.println(res+" "+result);
	}
	
	
	
}
