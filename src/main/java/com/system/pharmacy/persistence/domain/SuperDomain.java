package com.system.pharmacy.persistence.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author : Pathum Lakshan
 * persistence
 * 5/7/2023
 */

@Getter
@Setter
public abstract class SuperDomain {

    private Long id;
    private Boolean active;
    private Date createTime;
    private Date updateTime;
    private Boolean delete;

}
