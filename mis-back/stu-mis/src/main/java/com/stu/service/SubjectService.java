package com.stu.service;

import com.stu.entity.SubjectEntity;

/**
 * @author solan
 * @date 2020/3/11 9:26
 */
public interface SubjectService {
    int add(SubjectEntity entity);

    int delete(String stuId);

    int update(SubjectEntity entity);

    SubjectEntity find(String id);
}
