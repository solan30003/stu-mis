package com.stu.service;

import com.stu.entity.ScoreEntity;

/**
 * @author solan
 * @date 2020/3/11 9:26
 */
public interface ScoreService {
    int add(ScoreEntity entity);

    int delete(String stuId);

    int update(ScoreEntity entity);

    ScoreEntity find(String id);
}
