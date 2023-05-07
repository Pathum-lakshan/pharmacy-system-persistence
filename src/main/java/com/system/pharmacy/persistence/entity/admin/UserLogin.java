package com.system.pharmacy.persistence.entity.admin;

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
@Entity(name = "user_login")
public class UserLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id")
    private User user;
    @Column(name = "date_login")
    private Date dateLogin;
    @Column(name = "token_key")
    private String tokenKey;
    @Column(name = "token_expired")
    private Boolean tokenExpired;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

}
