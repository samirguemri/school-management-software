package com.samir.sms.controller.services.administrativeStaff;

import com.samir.sms.controller.data.dao.administrativeStaff.IAdministrativeStaffDAO;
import com.samir.sms.model.person.AdministrativeStaff;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("AdministrativeStaffService")
public class AdministrativeStaffService {

    private final IAdministrativeStaffDAO administrativeStaffDAO;

    @Autowired
    public AdministrativeStaffService(@Qualifier("PgsqlAdministrativeStaffDAO") IAdministrativeStaffDAO administrativeStaffDAO) {
        this.administrativeStaffDAO = administrativeStaffDAO;
    }

    public void addNewAdministrativeStaff(AdministrativeStaff administrativeStaff) {
        administrativeStaffDAO.insertNewAdministrativeStaff(administrativeStaff);
    }

    public AdministrativeStaff getAdministrativeStaffById(LocalUniqueId administrativeStaffId) {
        return administrativeStaffDAO.selectAdministrativeStaffById(administrativeStaffId);
    }

    public AdministrativeStaff updateAdministrativeStaffById(LocalUniqueId administrativeStaffId) {
        return administrativeStaffDAO.updateAdministrativeStaffById(administrativeStaffId);
    }

    public boolean deleteAdministrativeStaffById(LocalUniqueId administrativeStaffIdD) {
        return administrativeStaffDAO.deleteAdministrativeStaffById(administrativeStaffIdD);
    }

    public boolean connect(String login, String password) {
        return true;
    }

    public boolean disconnect() {
        return true;
    }
}
