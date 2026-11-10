import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (!visited.add(current)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
