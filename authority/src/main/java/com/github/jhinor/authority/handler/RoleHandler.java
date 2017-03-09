package com.github.jhinor.authority.handler;

import com.github.jhinor.authority.bean.Role;

import java.util.List;

/**
 * @author shiyu.long
 */
public interface RoleHandler extends BaseHandler<Role, Integer> {
    List<Role> findByUsername(String username);
}
