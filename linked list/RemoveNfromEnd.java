public class RemoveNfromEnd {
    public static void main(String[] args) {
        ListNode input = new ListNode(0, 
                            new ListNode(1, 
                            new ListNode(2, 
                            new ListNode(3,
                            new ListNode(4, 
                            new ListNode(5)
                                    )
                                )
                            )
                        )
                    );

        input = new ListNode(1, new ListNode(2));            
    
        printLinkedList(input);
        System.out.println();
        printLinkedList(removeNthFromEnd(input, 2));
        
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null){
            return null;
        }

        ListNode temp = head;
        int length = 0;
        
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        
        if(length==1){
            return null;
        }
        
        int target = length - n;

        temp = head;
        ListNode prev = null;

        int count = 0;
        while(temp!=null){
            if(count==target){
                if(temp.next==null){
                    prev.next=null;
                }else if(prev==null){
                    return temp.next;
                }else{
                    prev.next = temp.next;
                }
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}
