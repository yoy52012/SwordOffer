/**
 * 输入一个链表的头结点，反转该链表并输出反转后链表的头结点
 */
 
 class ListNode{
	 int val;
	 ListNode next;
 }
 
public void ReverseList(ListNode head){
	if(head==null){
		throw new IllegalArgumentException();
	}
	ListNode preNode = null;
	ListNode nextNode = null;
	while(head!=null){
		nextNode=head.next;
		head.next=pre;
		preNode=head;
		headNode=next;
	}
	return preNode
}