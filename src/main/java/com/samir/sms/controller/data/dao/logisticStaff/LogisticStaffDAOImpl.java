package com.samir.sms.controller.data.dao.logisticStaff;

import com.samir.sms.model.person.LogisticStaff;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.stereotype.Repository;

@Repository("PgsqlLogisticStaffDAO")
public class LogisticStaffDAOImpl implements ILogisticStaffDAO {
    @Override
    public void insertNewLogisticStaff(LogisticStaff logisticStaff) {

    }

    @Override
    public LogisticStaff selectLogisticStaffById(LocalUniqueId logisticStaffId) {
        return null;
    }

    @Override
    public LogisticStaff updateLogisticStaffById(LocalUniqueId logisticStaffId) {
        return null;
    }

    @Override
    public boolean deleteLogisticStaffById(LocalUniqueId logisticStaffId) {
        return false;
    }
}
