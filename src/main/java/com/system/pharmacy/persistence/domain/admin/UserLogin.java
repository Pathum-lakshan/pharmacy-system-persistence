package com.system.pharmacy.persistence.domain.admin;

import com.system.pharmacy.persistence.entity.admin.User;
import lombok.Value;

import java.util.Date;

/**
 * @author : Pathum Lakshan
 * persistence
 * 5/7/2023
 */

@Value
public class UserLogin {

    Long id;
    User user;
    Date dateLogin;
    String tokenKey;
    Boolean tokenExpired;
    Date createTime;
    Date updateTime;

}
