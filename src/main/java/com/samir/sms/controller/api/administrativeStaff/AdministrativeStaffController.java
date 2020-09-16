package com.samir.sms.controller.api.administrativeStaff;


import com.samir.sms.controller.services.administrativeStaff.AdministrativeStaffService;
import com.samir.sms.controller.services.administrativeStaff.IAdministrativeStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController("sms/administrativeStaff")
public class AdministrativeStaffController {

    private final AdministrativeStaffService administrativeStaffService;

    @Autowired
    public AdministrativeStaffController(@Qualifier("AdministrativeStaffService") AdministrativeStaffService administrativeStaffService) {
        this.administrativeStaffService = administrativeStaffService;
    }



}
