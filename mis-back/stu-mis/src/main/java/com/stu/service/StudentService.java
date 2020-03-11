package com.stu.service;

import com.stu.entity.StuInfoEntity;

/**
 * @author solan
 * @date 2020/3/11 9:26
 */
public interface StudentService {
    int add(StuInfoEntity stuInfoEntity);

    int delete(String stuId);

    int update(StuInfoEntity stuInfoEntity);

    StuInfoEntity find(String id);
}
