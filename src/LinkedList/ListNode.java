package LinkedList;

public class ListNode {
	public int num;
	public ListNode next;
	
	public ListNode(){
	}
	
	public ListNode(int num){
		this.num = num;
		this.next = null;
	}
	
	public void add(ListNode head, int val){
		ListNode temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = new ListNode(val);
	}
	
	public static void print(ListNode head){
		ListNode temp = head;
		while(temp.next != null){
			System.out.print(temp.num + "->");
			temp = temp.next;
		}
		System.out.println(temp.num);
	}
	
	public static ListNode createNewList(int size){
		ListNode n = new ListNode(1);
		for(int i=2;i<=size;i++){
			n.add(n,i);
		}
		return n;
	}
	
}
