package com.system.pharmacy.persistence.domain.admin;

import com.system.pharmacy.persistence.domain.SuperDomain;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author : Pathum Lakshan
 * persistence
 * 5/7/2023
 */

@EqualsAndHashCode(callSuper = true)
@Value
public class User extends SuperDomain {

    String username;
    String email;
    String password;

}
