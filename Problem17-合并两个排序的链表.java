/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 */
public ListNode MergeList(ListNode head1,ListNode head2){
	if(head1==null)
		return head2;
	if(head2==null)
		return head1;
	
	ListNode mergeNode =null;
	if(head1.val<head2.val){
		mergeNode=head1;
		mergeNode.next=MergeList(head1.next,head2);
	}else{
		mergeNode=head2;
		mergeNode.next=MergeList(head1,head2.next);
	}
	return mergeNode;
}


public ListNode MergeList(ListNode head1,ListNode head2){
	if(head1==null&&head2==null)
		return null;
	if(head1==null)
		return head2;
	if(head2==null)
		return head1;
	
	ListNode mergeNode=null;
	ListNode node1=head1;
	ListNode node2=head2;
	if(node1.val<node2.val){
		mergeNode=node1;
		node1=node1.next;
	}else{
		mergeNode=node2;
		node2=node2.next;
	}
	ListNode head=mergeNode;
	
	while(node1!=null&&node2!=null){
		if(node1.val<node2.val){
			mergeNode.next=node1;
			mergeNode=mergeNode.next;
			node1=node1.next;
		}else{
			mergeNode.next=node2;
			mergeNode=mergeNode.next;
			node2=node2.next;
		}
	}
	
	if(node1!=null)
		mergeNode.next=node1;
	
	if(node2!=null)
		mergeNode.next=node2;
	
	return head;
}