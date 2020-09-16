package com.samir.sms.controller.services.logisticStaff;

import com.samir.sms.controller.data.dao.logisticStaff.ILogisticStaffDAO;
import com.samir.sms.model.person.LogisticStaff;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("LogisticStaffService")
public class LogisticStaffService {

    private final ILogisticStaffDAO logisticStaffDAO;

    @Autowired
    public LogisticStaffService(@Qualifier("PgsqlLogisticStaffDAO") ILogisticStaffDAO logisticStaffDAO) {
        this.logisticStaffDAO = logisticStaffDAO;
    }

    public void addNewLogisticStaff(LogisticStaff logisticStaff) {
        logisticStaffDAO.insertNewLogisticStaff(logisticStaff);
    }

    public LogisticStaff getLogisticStaffById(LocalUniqueId logisticStaffId) {
        return logisticStaffDAO.selectLogisticStaffById(logisticStaffId);
    }

    public LogisticStaff updateLogisticStaffById(LocalUniqueId logisticStaffId) {
        return logisticStaffDAO.updateLogisticStaffById(logisticStaffId);
    }

    public boolean deleteLogisticStaffById(LocalUniqueId logisticStaffId) {
        return logisticStaffDAO.deleteLogisticStaffById(logisticStaffId);
    }
}
