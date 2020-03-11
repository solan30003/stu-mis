package com.stu.controller;

import com.solan.fx.core.data.result.R;
import com.solan.fx.core.data.result.Result;
import com.stu.entity.StuRollEntity;
import com.stu.service.StuRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author solan
 * @date 2020/3/11 9:18
 */
@RestController
@RequestMapping("/students")
public class StuRollController {
    @Autowired
    private StuRollService service;

    @PostMapping("/add")
    public Result add(@RequestBody StuRollEntity entity) {
        int k = service.add(entity);
        return k > 0 ? R.success("添加成功") : R.failure("添加失败");
    }

    @PostMapping("/update")
    public Result update(@RequestBody StuRollEntity entity) {
        int k = service.update(entity);
        return k > 0 ? R.success("修改成功") : R.failure("修改失败");
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam String stuId) {
        int k = service.delete(stuId);
        return k > 0 ? R.success("删除成功") : R.failure("删除失败");
    }

    @GetMapping("/{id}")
    public Result<StuRollEntity> find(@PathVariable String id) {
        StuRollEntity entity = service.find(id);
        return entity != null ? R.success(entity) : R.failure();
    }
}
