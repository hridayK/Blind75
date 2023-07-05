public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(0, 
                            new ListNode(1, 
                            new ListNode(2, 
                            new ListNode(3,null)
                            )
                        )
                    );
        ListNode n2 = new ListNode(0, 
                            new ListNode(2, 
                            new ListNode(3, 
                            new ListNode(4,null)
                            )
                        )
                    );

        printLinkedList(mergeTwoLists(n1, n2));
        // printLinkedList(n1);
    }

    public static void printLinkedList(ListNode head){
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }else{
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        return list1;
    }

}
