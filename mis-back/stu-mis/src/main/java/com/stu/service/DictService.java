package com.stu.service;

import com.stu.entity.DictEntity;

/**
 * @author solan
 * @date 2020/3/11 9:26
 */
public interface DictService {
    int add(DictEntity entity);

    int delete(String stuId);

    int update(DictEntity entity);

    DictEntity find(String id);
}
