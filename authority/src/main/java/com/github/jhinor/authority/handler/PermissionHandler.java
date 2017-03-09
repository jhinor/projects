package com.github.jhinor.authority.handler;

import com.github.jhinor.authority.bean.Permission;

import java.util.List;

/**
 * @author shiyu.long
 */
public interface PermissionHandler extends BaseHandler<Permission, Integer> {
    List<Permission> findByUsername(String username);
}
