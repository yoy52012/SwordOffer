/**
 * ����һ�������ͷ��㣬��ת�����������ת�������ͷ���
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