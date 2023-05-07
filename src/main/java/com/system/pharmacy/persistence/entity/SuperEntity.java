package com.system.pharmacy.persistence.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author : Pathum Lakshan
 * persistence
 * 5/7/2023
 */

@Getter
@Setter
@MappedSuperclass
public abstract class SuperEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "delete")
    private Boolean delete;

}
