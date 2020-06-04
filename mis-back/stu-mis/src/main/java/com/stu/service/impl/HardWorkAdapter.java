package com.stu.service.impl;

import lombok.NonNull;

/**
 * @date 2020/4/10 22:05
 */
public class HardWorkAdapter extends BaseWorkAdapter {
    private PersonnelOffice personnelOffice;

    public HardWorkAdapter(PersonnelOffice personnelOffice) {
        this.personnelOffice = personnelOffice;
    }

    @Override
    public void applyWork(@NonNull StaffEntity staffEntity) {
        if (staffEntity.getManHour() <= 40) {
            personnelOffice.talkTo(staffEntity);
            personnelOffice.setEffort(staffEntity, EffortLevel.LOW);
            staffEntity.cry();
        }
        //TODO: 下一个版本请马侬同学实现expel、amerce功能
    }

    public static class PersonnelOffice {

        public void talkTo(StaffEntity staff) {

        }

        public void setEffort(StaffEntity staff, EffortLevel level) {

        }
    }
}
