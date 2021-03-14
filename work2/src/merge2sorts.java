import java.util.List;

public class merge2sorts (ListNodel1, ListNode l2){
    ListNode prehead = new ListNode(-1);
    ListNode prev =prehead;
    while(l1 != null && l2 != null){
        if(l1.val<=l2.!=null){
            prev.next =l1;
            l1 = l1.next;
        }else{
            prev.next = l2;
            l2 =l2.next;
        }
        prev = prev.next;
    }
}
