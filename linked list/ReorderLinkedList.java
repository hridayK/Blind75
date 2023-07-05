public class ReorderLinkedList{

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1, 
                                        new ListNode(2, 
                                        new ListNode(3, 
                                        new ListNode(4,null)
                                        // new ListNode(4, null)
                                        // new ListNode(5, null)
                                        // )
                                // )
                            )
                        )
                    );

        printLinkedList(reorder(n1));
    }

    public static ListNode reorder(ListNode head){
        ListNode fast = head, slow = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode p1 = head, p2 = reverse(slow);

        ListNode newList = new ListNode();

        boolean first = false;
        newList = new ListNode(p1.val, null);
        p1 = p1.next;
        
        while(p2!=null){
            if(first){
                newList = append(newList, p1.val);
                p1 = p1.next;
                first=!first;
            }else{
                newList = append(newList, p2.val);
                p2 = p2.next;
                first=!first;
            }
        }

        return newList;
    }


    public static ListNode append(ListNode head, int value){

        ListNode newNode = new ListNode(value);

        ListNode currentNode = head;

        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        
        currentNode.next = newNode;

        return head;
    }


    
    public static void printLinkedList(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverse(ListNode node){
        if(node==null){
            return node;
        }
        ListNode reversed = new ListNode(node.val,null);
        while(node.next!=null){
            reversed = new ListNode(node.next.val, reversed);
            node = node.next;
        }
        return reversed;
    }
    
}