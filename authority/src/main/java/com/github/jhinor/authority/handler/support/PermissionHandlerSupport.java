package com.github.jhinor.authority.handler.support;

import com.github.jhinor.authority.bean.Permission;
import com.github.jhinor.authority.handler.PermissionHandler;
import com.github.jhinor.authority.repository.PermissionRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shiyu.long
 */
@Service
public class PermissionHandlerSupport extends BaseHandlerSupport<Permission, Integer> implements PermissionHandler {
    @Resource
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> findByUsername(String username) {
        return permissionRepository.findByUsername(username);
    }
}
