package com.samir.sms.controller.services.teacher;

import com.samir.sms.controller.data.dao.teacher.ITeacherDAO;
import com.samir.sms.model.person.Teacher;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.stereotype.Service;

@Service("TeacherService")
public class TeacherService {

    private final ITeacherDAO teacherDAO;

    public TeacherService(ITeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    public void addNewTeacher(Teacher teacher) {
        teacherDAO.insertNewTeacher(teacher);
    }

    public Teacher getTeacherById(LocalUniqueId teacherId) {
        return teacherDAO.selectTeacherById(teacherId);
    }

    public Teacher updateTeacherById(LocalUniqueId teacherId) {
        return teacherDAO.updateTeacherById(teacherId);
    }

    public boolean deleteTeacherById(LocalUniqueId teacherId) {
        return teacherDAO.deleteTeacherById(teacherId);
    }

    public boolean connect(String login, String password) {
        return true;
    }

    public boolean disconnect() {
        return true;
    }
}
