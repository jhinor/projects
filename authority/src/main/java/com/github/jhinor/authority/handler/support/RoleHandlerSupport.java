package com.github.jhinor.authority.handler.support;

import com.github.jhinor.authority.repository.RoleRepository;
import com.github.jhinor.authority.bean.Role;
import com.github.jhinor.authority.handler.RoleHandler;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shiyu.long
 */
@Service
public class RoleHandlerSupport extends BaseHandlerSupport<Role, Integer> implements RoleHandler {
    @Resource
    private RoleRepository roleRepository;

    @Override
    public List<Role> findByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            return null;
        }
        return roleRepository.findByUsername(username);
    }
}
