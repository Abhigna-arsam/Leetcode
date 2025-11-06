/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode temp = head;
        ListNode dNode = new ListNode(0);
        ListNode curr = dNode;
        while(temp!=null){
            if(!set.contains(temp.val)){
                curr.next = temp;
                curr = curr.next;
            }
            temp=temp.next;

        }
        curr.next = null;
        return dNode.next;

    }
}