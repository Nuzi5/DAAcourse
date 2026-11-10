public class IntersectionOfTwoLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        for (ListNode a = headA; a != null; a = a.next) {
            for (ListNode b = headB; b != null; b = b.next) {
                if (a == b) {
                    return a;
                }
            }
        }
        return null;
    }
}
