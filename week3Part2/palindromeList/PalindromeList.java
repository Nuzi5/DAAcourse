import java.util.ArrayList;
import java.util.List;

public class PalindromeList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode current = head; current != null; current = current.next) {
            values.add(current.val);
        }

        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            if (!values.get(left).equals(values.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
