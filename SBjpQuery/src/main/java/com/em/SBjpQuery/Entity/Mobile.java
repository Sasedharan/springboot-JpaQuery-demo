package com.em.SBjpQuery.Entity;

import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Mobile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
  //  @Column(name ="Brand")
    private String name;

    private String model;
 //   @Column(name = "IME No.")
    private String serialno;
  // @NotEmpty
   private String price;
  // @Column(name = " Manufactoring Date")
    @CreationTimestamp
    private LocalDateTime time;
    @UpdateTimestamp
    private LocalDateTime updatetime;

}

