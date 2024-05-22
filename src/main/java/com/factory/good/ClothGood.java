package com.factory.good;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: wangyimin 688153
 * @Date: 2024/5/22 16:42
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClothGood implements Good{
    private String size;

    private String type;
}
