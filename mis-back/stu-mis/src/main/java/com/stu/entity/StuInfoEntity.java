package com.stu.entity;

import lombok.Data;

/**
 *
 * @author solan
 * @date 2020/3/11 9:19
 */
@Data
public class StuInfoEntity extends BaseMisEntity {
    private String name;
    private String cardId;
    private int sex;
    private Data birthday;
    private String homeAddress;
    private String tel;

}
