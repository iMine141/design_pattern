package com.combination;

import lombok.Data;

import java.util.*;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/14 9:14
 * @Description:
 */
@Data
public class TreeNode {
    private Long treeId;

    private Map<Long, Node> childNode;
}
