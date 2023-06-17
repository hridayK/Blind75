public class ReverseLinkedList {
    
    public static void main(String[] args) {
        ListNode n1 = new ListNode(0, 
                            new ListNode(1, 
                            new ListNode(2, null)
                        )
                    );
        ListNode answer = reverseList(n1);
        printLinkedList(answer);
    }

    public static void printLinkedList(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode reverseList = new ListNode(head.val, null);
        while(head.next!=null){
            reverseList = new ListNode(head.next.val, reverseList);
            head = head.next;
        }

        return reverseList;
    }
}
