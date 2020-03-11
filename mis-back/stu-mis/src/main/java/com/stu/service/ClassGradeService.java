package com.stu.service;

import com.stu.entity.ClassGradeEntity;
import com.stu.entity.StuInfoEntity;

/**
 * @author solan
 * @date 2020/3/11 9:26
 */
public interface ClassGradeService {
    int add(ClassGradeEntity entity);

    int delete(String stuId);

    int update(ClassGradeEntity entity);

    ClassGradeEntity find(String id);
}
