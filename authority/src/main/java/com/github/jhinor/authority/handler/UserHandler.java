package com.github.jhinor.authority.handler;

import com.github.jhinor.authority.bean.User;

/**
 * @author shiyu.long
 */
public interface UserHandler extends BaseHandler<User, Integer> {
    User findByUsername(String username);
}
