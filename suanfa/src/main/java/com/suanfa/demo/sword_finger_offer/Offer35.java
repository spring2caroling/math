package com.suanfa.demo.sword_finger_offer;

import java.util.HashMap;
import java.util.Map;

import com.suanfa.demo.pojo.Node;

/**
 * Description 剑指 Offer 35. 复杂链表的复制
 * Create by 汪迎春
 * Date 2021/8/29 5:51 下午
 */
public class Offer35 {
    public static void main(String[] args) {

    }

    /**
     * hash
     * @param head
     * @return
     */
    //    public static Node copyRandomList(Node head) {
    //        Map<Node, Node> map = new HashMap();
    //        if (head==null) {
    //            return null;
    //        }
    //
    //        if (!map.containsKey(head)) {
    //            Node headNew = new Node(head.val);
    //            map.put(head, headNew);
    //            headNew.next = copyRandomList(head.next);
    //            headNew.random = copyRandomList(head.random);
    //        }
    //        return map.get(head);
    //    }

    /**
     * 迭代 有一定的技巧性
     */
    public static Node copyRandomList(Node head) {
        //先将原节点复制一份
        for (Node tmp = head; tmp != null; tmp = tmp.next.next) {
            // 复制
            Node nodeNew = new Node(tmp.val);
            // 插入
            Node node1 = tmp.next;
            tmp.next = nodeNew;
            nodeNew.next = node1;
        }
        //复制random节点
        for (Node tmp = head; tmp != null; tmp = tmp.next.next) {
            Node node = tmp.next;
            node.random = tmp.random == null ? null : tmp.random.next;
        }
        Node headNew = head.next;
        //拆分 就是恢复原来的链表，对接新的链表
        for (Node tmp = head; tmp != null; tmp = tmp.next) {
            Node nodeNew = tmp.next;
            tmp.next = nodeNew.next;
            nodeNew.next = tmp.next == null ? null : tmp.next.next;
        }
        return headNew;
    }

}
