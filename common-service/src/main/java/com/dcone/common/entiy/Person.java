package com.dcone.common.entiy;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: HuangJunHao
 * @Date: 2020/7/9 22:59
 */
@Data
@TableName("person")
public class Person {

    private String name;

    private String itcode;

}
