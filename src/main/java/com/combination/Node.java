package com.combination;

import lombok.Data;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/9 16:30
 * @Description:
 */
@Data
public class Node {
    private Long treeId;

    private Long nodeId;

    private Integer type; // 1:枝干 2：果实

    private String value;

    private Node nextNode; // type=1 下一个节点
}
