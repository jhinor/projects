package com.github.jhinor.authority.repository;

import com.github.jhinor.authority.SpringTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author shiyu.long
 */
public class UserSpringTest extends SpringTest {
    @Resource
    private UserRepository userRepository;
    @Resource
    private PermissionRepository permissionRepository;

    @Test
    public void testPersist() throws Exception {
        permissionRepository.findByUsername("admin2");
    }
}
