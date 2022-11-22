package com.em.SBjpQuery.Service;

import com.em.SBjpQuery.Entity.Mobile;
import com.em.SBjpQuery.Repository.MobileRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MobileServiceImple implements MobileService{
    private MobileRepository mobileRepository;

    public MobileServiceImple(MobileRepository mobileRepository) {
        this.mobileRepository = mobileRepository;
    }

    @Override
    public Mobile saveItems(Mobile mobile) {
        return mobileRepository.save(mobile);
    }

    @Override
    public List<Mobile> getItems(String query) {
        List<Mobile> mo = mobileRepository.search(query);
        return mo;
    }
}
