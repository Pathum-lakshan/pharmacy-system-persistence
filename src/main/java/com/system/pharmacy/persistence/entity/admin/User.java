package com.system.pharmacy.persistence.entity.admin;

import com.system.pharmacy.persistence.entity.SuperEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author : Pathum Lakshan
 * persistence
 * 5/7/2023
 */

@Getter
@Setter
@Entity(name = "user")
public class User extends SuperEntity {

    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    private String password;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserLogin> userLoginList;

}
