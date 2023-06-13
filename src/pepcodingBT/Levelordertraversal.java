import pepCodingBT

import java.util.*;
// the Mian Idea behiind the level Order Traverrsal is to Follow Remove, Print and Add to the queue ..
public class LevelOrderTraversal
{
  public void Traverse(Node root)
  {
    if(root==null) System.out.println("Nothing can be printed out coz root is null");
    else 
    {
      Qeue<Integer> mq= new ArrayDeque<Integer>(); // Declaring the data
      mq.add(root);
      
      while(mq.size()>0)
      {
        int count = mq.size();
        
          for(int i=0;i<count ;i++)
          {
             Node temp= mq.remove(); // Node is removed from the queue and saved to the temp REMOVING
            System.out.print(temp.data+" ");// Printing the data
            
            if(root.left!=null)
            {
              mq.add(root.left);// adding the data to queue
            }
            
            if(root.right!=null)
            {
              mq.add(rot.right);//Adding the data to the queue
            }
          }
        System.out.println();
        
      }
    }
  }
}
            
