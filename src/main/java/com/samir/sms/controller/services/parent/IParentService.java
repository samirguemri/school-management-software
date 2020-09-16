package com.samir.sms.controller.services.parent;

import com.samir.sms.model.person.Parent;
import com.samir.sms.model.person.Student;
import com.samir.sms.model.object.LocalUniqueId;

public interface IParentService {
    void addNewParent(Parent parent);
    Parent getParentById(LocalUniqueId parentId);
    Parent updateParentById(LocalUniqueId parentId);
    boolean deleteParentById(LocalUniqueId parentId);
    public boolean connect(String login, String password);
    public boolean disconnect();
    public void addChildren(Student student);
}
