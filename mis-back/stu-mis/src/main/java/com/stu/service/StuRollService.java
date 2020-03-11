package com.stu.service;

import com.stu.entity.StuRollEntity;

/**
 * @author solan
 * @date 2020/3/11 9:26
 */
public interface StuRollService {
    int add(StuRollEntity entity);

    int delete(String id);

    int update(StuRollEntity entity);

    StuRollEntity find(String id);
}
