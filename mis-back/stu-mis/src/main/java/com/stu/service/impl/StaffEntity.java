package com.stu.service.impl;

import lombok.Data;

/**
 * TODO:
 *
 * @author solan
 * @date 2020/4/10 22:06
 */
@Data
public class StaffEntity {
    private String name;
    private int age;
    private int manHour;
    private EffortLevel effortLevel;

    public void cry() {

    }
}
