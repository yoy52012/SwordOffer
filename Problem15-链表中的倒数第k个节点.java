/**
 * 输入一个链表，输出该链表的倒数第k个几点。
 */
public ListNode FindKthToTail(ListNode head,int k){
	if(ListNode==null||k==0){
		return null;
	}
	ListNode p1=head;
	ListNode p2=null;
	for(int i=0;i<k-1;i++){
		if(p1.next!=null){
			p1=p1.next;
		}else{
			return null;
		}
	}
	p2=head;
	while(p1.next!=null){
		p1=p1.next;
		p2=p2.next;
	}
	return p2;
}