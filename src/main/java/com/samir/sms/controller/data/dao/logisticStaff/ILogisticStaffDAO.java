package com.samir.sms.controller.data.dao.logisticStaff;


import com.samir.sms.model.person.LogisticStaff;
import com.samir.sms.model.object.LocalUniqueId;

public interface ILogisticStaffDAO {
    void insertNewLogisticStaff(LogisticStaff logisticStaff);
    LogisticStaff selectLogisticStaffById(LocalUniqueId logisticStaffId);
    LogisticStaff updateLogisticStaffById(LocalUniqueId logisticStaffId);
    boolean deleteLogisticStaffById(LocalUniqueId logisticStaffId);
}
