package cn.torro.leetcode.algorithms.base;

/**
 * @author xq
 * @create 2021-12-08 6:33 下午
 **/
public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
