package com.leetcode.himanshu.codes;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class ConvertBinaryInLL2Int {
    public static int getDecimalValue(ListNode head) {
        String str = "";
        while(head != null){
            str = str.concat(String.valueOf(head.val));
            head=head.next;
        }
        int val = Integer.parseInt(str,2);
        return val;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        getDecimalValue(head);
    }
}
