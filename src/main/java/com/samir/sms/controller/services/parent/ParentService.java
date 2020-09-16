package com.samir.sms.controller.services.parent;

import com.samir.sms.controller.data.dao.parent.IParentDAO;
import com.samir.sms.model.person.Parent;
import com.samir.sms.model.person.Student;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ParentService")
public class ParentService {

    private final IParentDAO parentDAO;

    @Autowired
    public ParentService(@Qualifier("PgsqlParentDAO") IParentDAO parentDAO) {
        this.parentDAO = parentDAO;
    }

    public void addNewParent(Parent parent) {
        parentDAO.insertNewParent(parent);
    }

    public Parent getParentById(LocalUniqueId parentId) {
        return parentDAO.selectParentById(parentId);
    }

    public Parent updateParentById(LocalUniqueId parentId) {
        return parentDAO.updateParentById(parentId);
    }

    public boolean deleteParentById(LocalUniqueId parentId) {
        return parentDAO.deleteParentById(parentId);
    }

    public boolean connect(String login, String password) {
        return true;
    }

    public boolean disconnect() {
        return true;
    }

    public void addChildren(Student student) {

    }
}
