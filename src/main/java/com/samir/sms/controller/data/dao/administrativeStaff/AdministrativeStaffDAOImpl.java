package com.samir.sms.controller.data.dao.administrativeStaff;

import com.samir.sms.model.person.AdministrativeStaff;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.stereotype.Repository;

@Repository("PgsqlAdministrativeStaffDAO")
public class AdministrativeStaffDAOImpl implements IAdministrativeStaffDAO {
    @Override
    public void insertNewAdministrativeStaff(AdministrativeStaff administrativeStaff) {

    }

    @Override
    public AdministrativeStaff selectAdministrativeStaffById(LocalUniqueId administrativeStaffId) {
        return null;
    }

    @Override
    public AdministrativeStaff updateAdministrativeStaffById(LocalUniqueId administrativeStaffId) {
        return null;
    }

    @Override
    public boolean deleteAdministrativeStaffById(LocalUniqueId administrativeStaffId) {
        return false;
    }
}
