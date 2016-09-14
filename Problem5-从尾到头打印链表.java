public class ListNode{
    int value;
    ListNode next;
}

/**
 * Using Recursion.
 */
public void PrintListReverse(ListNode head){
    if(head!=null){
        if(head.next!=null){
             PrintListReverse(head.next);
        }
    }
    System.out.print(head.value+" ");
}

/**
 * Using Stack.
 */
public void PrintListReverse(ListNode head){
    Stack<ListNode> stack=new Stack<ListNode>();
    ListNode node = head;
    while(node!=null){
        stack.push(node);
        node=node.next;
    }
    while(!stack.empty()){
        node=stack.pop();
        System.out.print(node.value);
    }
}