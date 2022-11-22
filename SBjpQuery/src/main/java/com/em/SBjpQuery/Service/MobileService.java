package com.em.SBjpQuery.Service;

import com.em.SBjpQuery.Entity.Mobile;

import java.util.List;

public interface MobileService {
    public Mobile saveItems(Mobile mobile);
    public List<Mobile> getItems(String q);
}

