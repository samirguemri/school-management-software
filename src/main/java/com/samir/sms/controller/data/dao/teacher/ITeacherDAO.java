package com.samir.sms.controller.data.dao.teacher;

import com.samir.sms.model.person.Teacher;
import com.samir.sms.model.object.LocalUniqueId;

public interface ITeacherDAO {
    void insertNewTeacher(Teacher newTeacher);
    Teacher selectTeacherById(LocalUniqueId TeacherId);
    Teacher updateTeacherById(LocalUniqueId TeacherId);
    boolean deleteTeacherById(LocalUniqueId TeacherId);
}
