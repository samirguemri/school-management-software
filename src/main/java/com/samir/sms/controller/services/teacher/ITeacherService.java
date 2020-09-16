package com.samir.sms.controller.services.teacher;

import com.samir.sms.model.person.Teacher;
import com.samir.sms.model.object.LocalUniqueId;

public interface ITeacherService {
    void addNewTeacher(Teacher teacher);
    Teacher getTeacherById(LocalUniqueId teacherId);
    Teacher updateTeacherById(LocalUniqueId teacherId);
    boolean deleteTeacherById(LocalUniqueId teacherId);
    public boolean connect(String login, String password);
    public boolean disconnect();
}
