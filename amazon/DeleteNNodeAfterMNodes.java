/*Given a linked list, delete N nodes after skipping M nodes of a linked list 
 * until the last of the linked list.
 * */
 

package amazon;
import java.util.*;
public class DeleteNNodeAfterMNodes {
	
	static class Node
	  {
	      int data;
	      Node next;
	      Node(int data)
	      {
	          this.data = data;
	          this.next = null;
	      }
	  }
	
	public static void linkdelete(Node head, int M, int N)
    {
        Node cur=head;
        int count=1;
        while(cur!=null){
            for(count=1; count<M&& cur!=null ; count++) cur=cur.next;
            if(cur==null) return;
            Node t=cur.next;
            for(count=1; count<=N && t!=null ; count++) {
                Node temp=t;
                t=t.next;
            }
            cur.next=t;
            cur=t;
        }
    }

	
	 public static void printList(Node head)
	    {
	        Node n = head;
	        while (n != null) {
	            System.out.print(n.data + " ");
	            n = n.next;
	        }
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<Integer> llist=new LinkedList<>();
//        Node head;
        Node head= new Node(9);
        Node second = new Node(1);
        Node third = new Node(3);
        Node fourth= new Node(5);
        Node fifth = new Node(9);
        Node sixth = new Node(4);
        Node seventh = new Node(10);
        Node eigth = new Node(1);
        int m=2,n=1;
        
        linkdelete(head,m,n);
        
        printList(head);
	}

}
