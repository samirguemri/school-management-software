package com.samir.sms.controller.services.logisticStaff;

import com.samir.sms.model.person.LogisticStaff;
import com.samir.sms.model.object.LocalUniqueId;

public interface ILogisticStaffService {
    void addNewLogisticStaff(LogisticStaff logisticStaff);
    LogisticStaff getLogisticStaffById(LocalUniqueId logisticStaffId);
    LogisticStaff updateLogisticStaffById(LocalUniqueId logisticStaffId);
    boolean deleteLogisticStaffById(LocalUniqueId logisticStaffId);
}
