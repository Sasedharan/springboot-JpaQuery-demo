package com.em.SBjpQuery.Controller;

import com.em.SBjpQuery.Entity.Mobile;
import com.em.SBjpQuery.Service.MobileService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mobile/item")
public class MobileController {
    private MobileService mobileservice;

    public MobileController(MobileService mobileservice) {
        this.mobileservice = mobileservice;
    }
 @PostMapping
    public ResponseEntity<Mobile> saveitem( @RequestBody Mobile mobile){
        return ResponseEntity.ok(mobileservice.saveItems(mobile));

    }
    @GetMapping("/search/{query}")

    public ResponseEntity<List<Mobile>> getitem(@PathVariable("query")String q){
        return ResponseEntity.ok(mobileservice.getItems(q));

    }
   /* public List<Mobile> getitem(@Param("query")String q){
        List<Mobile> list = mobileservice.getItems(q);
        return list;
    }*/
}
