package LinkedList;

public class ReverseLinkedList2 {
	
	public ListNode reverse(ListNode head, int m, int n){
		
		if(head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode();
		
		dummy.next = head;
		ListNode prev = dummy;
		
		for(int i=0;i<m-1;i++){
			prev = prev.next;
		}
		
		ListNode temp, cur = prev.next;
		
		
		for(int i=0;i<n-m;i++){
			temp = cur.next;
			cur.next = temp.next;
			temp.next = prev.next;
			prev.next = temp;
		}
		
		head = dummy.next;
		dummy.next = null;
		return head;
		
	}
	
	public static void main(String args[]){
		ListNode head = ListNode.createNewList(5);
		
		ListNode.print(head);
		
		ReverseLinkedList2 obj = new ReverseLinkedList2();
		head = obj.reverse(head, 1, 3);
		
		ListNode.print(head);
		
	}

}
