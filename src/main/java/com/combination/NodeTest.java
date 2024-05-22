package com.combination;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/14 9:18
 * @Description:
 */
public class NodeTest {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.setTreeId(1L);

        Node node = new Node();
        node.setTreeId(1L);
        node.setNodeId(1L);
        node.setType(1);
        node.setValue("head");

        Node node1 = new Node();
        node1.setTreeId(1L);
        node1.setNodeId(2L);
        node1.setType(1);
        node1.setValue("男");

        Node node2 = new Node();
        node2.setTreeId(1L);
        node2.setNodeId(3L);
        node2.setType(1);
        node2.setValue("女");
    }
}
