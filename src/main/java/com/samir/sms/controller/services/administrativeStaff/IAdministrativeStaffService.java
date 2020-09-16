package com.samir.sms.controller.services.administrativeStaff;

import com.samir.sms.model.person.AdministrativeStaff;
import com.samir.sms.model.object.LocalUniqueId;

public interface IAdministrativeStaffService {
    void addNewAdministrativeStaff(AdministrativeStaff administrativeStaff);
    AdministrativeStaff getAdministrativeStaffById(LocalUniqueId administrativeStaffId);
    AdministrativeStaff updateAdministrativeStaffById(LocalUniqueId administrativeStaffId);
    boolean deleteAdministrativeStaffById(LocalUniqueId administrativeStaffIdD);
    public boolean connect(String login, String password);
    public boolean disconnect();

}
