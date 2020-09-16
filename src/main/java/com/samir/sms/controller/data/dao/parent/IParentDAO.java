package com.samir.sms.controller.data.dao.parent;

import com.samir.sms.model.person.Parent;
import com.samir.sms.model.object.LocalUniqueId;

public interface IParentDAO {
    void insertNewParent(Parent parent);
    Parent selectParentById(LocalUniqueId parentId);
    Parent selectParentByChildId(LocalUniqueId parentId);
    Parent updateParentById(LocalUniqueId parentId);
    boolean deleteParentById(LocalUniqueId parentId);
}
