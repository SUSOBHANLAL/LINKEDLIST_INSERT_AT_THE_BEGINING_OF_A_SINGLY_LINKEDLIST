package innsertFistsllllllllllll;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		next = null;
	}
}
public class susobhan {
	public static void main(String args[]) {
		
		node head = new node(13);
		node  temp1 = new node(14);
		node temp2= new node(18);
		
		head.next= temp1;
		temp1.next=temp2;
		temp2.next= null;
		head = insertbegining(head,30);
		printnode(head);
		
	}
		
		
		
		
		static node insertbegining(node head,int data) {
			node newnode= new node(data);
			//connection
			newnode.next= head;
			
			if(head !=null) {
				newnode.next= head;
				head= newnode;
			}
			return head;
		}
		
		
		static void printnode(node head) {
			node curr = head;
			while(curr!=null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
				
			}
			System.out.println();
		}
			
	}


