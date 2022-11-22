package com.em.SBjpQuery.Repository;

import com.em.SBjpQuery.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MobileRepository extends JpaRepository<Mobile,Long> {


    @Query ( "SELECT m FROM Mobile m WHERE m.name = ?1")
    List<Mobile> search(String query);


//    @Query("select m from Mobile m WHERE " + "m.name like concat('%',:query,'%')" +
//            "Or m.model like concat('%',:query,'%')")
//    List<Mobile> search(String query);

}
