package com.stu.entity;

import com.solan.fx.core.entity.BaseEntity;
import com.solan.fx.core.entity.IEntityCreatedTime;
import com.solan.fx.core.entity.IEntityId;
import lombok.Data;

import java.util.Date;

/**
 * @author solan
 * @date 2020/3/11 9:19
 */
@Data
public class BaseMisEntity extends BaseEntity implements IEntityId<String>, IEntityCreatedTime {
    private String id;
    private Date createdTime;

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public Date getCreatedTime() {
        return this.createdTime;
    }
}
