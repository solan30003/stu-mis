package com.stu.service;

import com.stu.entity.CurriculumEntity;
import com.stu.entity.StuInfoEntity;

/**
 * TODO:
 *
 * @author solan
 * @date 2020/3/11 10:02
 */
public interface CurriculumService {
    int add(CurriculumEntity entity);

    int delete(String stuId);

    int update(CurriculumEntity entity);

    CurriculumEntity find(String id);
}
