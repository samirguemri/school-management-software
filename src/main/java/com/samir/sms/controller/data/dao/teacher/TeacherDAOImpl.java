package com.samir.sms.controller.data.dao.teacher;

import com.samir.sms.model.person.Teacher;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.stereotype.Repository;

@Repository("PgsqlTeacherDAO")
public class TeacherDAOImpl implements ITeacherDAO {
    @Override
    public void insertNewTeacher(Teacher newTeacher) {

    }

    @Override
    public Teacher selectTeacherById(LocalUniqueId TeacherId) {
        return null;
    }

    @Override
    public Teacher updateTeacherById(LocalUniqueId TeacherId) {
        return null;
    }

    @Override
    public boolean deleteTeacherById(LocalUniqueId TeacherId) {
        return false;
    }
}
