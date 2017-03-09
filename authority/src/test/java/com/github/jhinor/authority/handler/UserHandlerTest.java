package com.github.jhinor.authority.handler;

import com.github.jhinor.authority.bean.User;
import com.github.jhinor.authority.SpringTest;
import com.github.jhinor.authority.bean.Role;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author shiyu.long
 */
public class UserHandlerTest extends SpringTest {
    @Resource
    private UserHandler userHandler;

    @Test
    public void testDelete() throws Exception {
        User user1 = userHandler.findByUsername("admin2");
        Set<Role> roles = user1.getRoles();
        System.out.println(roles);
    }
}
