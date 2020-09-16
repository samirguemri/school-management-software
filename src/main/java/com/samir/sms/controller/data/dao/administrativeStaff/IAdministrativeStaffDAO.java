package com.samir.sms.controller.data.dao.administrativeStaff;

import com.samir.sms.model.person.AdministrativeStaff;
import com.samir.sms.model.object.LocalUniqueId;

public interface IAdministrativeStaffDAO {
    void insertNewAdministrativeStaff(AdministrativeStaff administrativeStaff);
    AdministrativeStaff selectAdministrativeStaffById(LocalUniqueId administrativeStaffId);
    AdministrativeStaff updateAdministrativeStaffById(LocalUniqueId administrativeStaffId);
    boolean deleteAdministrativeStaffById(LocalUniqueId administrativeStaffId);
}
