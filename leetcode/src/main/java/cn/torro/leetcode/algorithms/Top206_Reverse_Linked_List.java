package cn.torro.leetcode.algorithms;

import cn.torro.leetcode.algorithms.base.BaseLinked;
import cn.torro.leetcode.algorithms.base.ListNode;
import org.junit.Test;

/**
 * @author xq
 * @create 2021-12-08 6:32 下午
 **/
public class Top206_Reverse_Linked_List {

    @Test
    public void test() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,
                new ListNode(5, null)))));
        ListNode listNode2 = reverseListWithRecursion(listNode);
        BaseLinked.traverseLinkedList(listNode2);
    }

    /**
     * 递归版
     * 时间复杂度 O(n)
     * 空间复杂度 O（n） (隐式栈)
     *git config credential.helper store
     * @param head
     * @return
     */
    public ListNode reverseListWithRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedRest = reverseListWithRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return reversedRest;
    }


    /**
     * 迭代版本
     * 时间复杂度 O（n）
     * 空间复杂度 O（1）
     *
     * @param head
     * @return
     */
    public ListNode reverseListWithLoop(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


}
