package cn.torro.leetcode.algorithms.base;

/**
 * @author xq
 * @create 2021-12-08 6:35 下午
 **/
public class BaseLinked {

    public static void traverseLinkedList(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
        System.out.print("null");
    }
}
