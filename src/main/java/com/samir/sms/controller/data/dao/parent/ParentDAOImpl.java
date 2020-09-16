package com.samir.sms.controller.data.dao.parent;

import com.samir.sms.model.person.Parent;
import com.samir.sms.model.object.LocalUniqueId;
import org.springframework.stereotype.Repository;

@Repository("PgsqlParentDAO")
public class ParentDAOImpl implements IParentDAO {
    @Override
    public void insertNewParent(Parent parent) {

    }

    @Override
    public Parent selectParentById(LocalUniqueId parentId) {
        return null;
    }

    @Override
    public Parent selectParentByChildId(LocalUniqueId parentId) {
        return null;
    }

    @Override
    public Parent updateParentById(LocalUniqueId parentId) {
        return null;
    }

    @Override
    public boolean deleteParentById(LocalUniqueId parentId) {
        return false;
    }
}
