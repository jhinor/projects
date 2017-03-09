package com.github.jhinor.authority.handler.support;

import com.github.jhinor.authority.bean.User;
import com.github.jhinor.authority.handler.UserHandler;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author shiyu.long
 */
@Service
public class UserHandlerSupport extends BaseHandlerSupport<User, Integer> implements UserHandler {

    @Override
    public User findByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            return null;
        }
        User user = new User();
        user.setUsername(username);
        return baseRepository.findOne(Example.of(user));
    }
}
