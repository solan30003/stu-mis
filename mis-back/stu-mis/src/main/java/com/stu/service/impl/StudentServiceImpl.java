package com.stu.service.impl;

import com.stu.entity.StuInfoEntity;
import com.stu.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * TODO:
 *
 * @author solan
 * @date 2020/3/11 9:26
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public int add(StuInfoEntity stuInfoEntity) {
        HardWorkAdapter h = new HardWorkAdapter(null);
        h.applyWork(null);
        return 0;
    }

    @Override
    public int delete(String stuId) {
        return 0;
    }

    @Override
    public int update(StuInfoEntity stuInfoEntity) {
        return 0;
    }

    @Override
    public StuInfoEntity find(String id) {
        return null;
    }
}
