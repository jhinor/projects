package com.github.jhinor.authority.realm;

import com.github.jhinor.authority.bean.Permission;
import com.github.jhinor.authority.bean.User;
import com.github.jhinor.authority.handler.PermissionHandler;
import com.github.jhinor.authority.handler.RoleHandler;
import com.github.jhinor.authority.handler.UserHandler;
import com.github.jhinor.authority.bean.Role;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shiyu.long
 */
public class SecurityRealm extends AuthorizingRealm {
    @Resource
    private UserHandler userHandler;
    @Resource
    private RoleHandler roleHandler;
    @Resource
    private PermissionHandler permissionHandler;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        if (principals == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }
        String username = (String) getAvailablePrincipal(principals);
        //create simple auth info
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //find roles by username
        List<Role> roles = roleHandler.findByUsername(username);
        if (!CollectionUtils.isEmpty(roles)) {
            Set<String> roleNames = new LinkedHashSet<>();
            for (Role role : roles) {
                roleNames.add(role.getName());
            }
            info.setRoles(roleNames);
        }
        //find permissions by username
        List<Permission> permissions = permissionHandler.findByUsername(username);
        if (!CollectionUtils.isEmpty(permissions)) {
            Set<String> permissionNames = new LinkedHashSet<>();
            for (Permission permission : permissions) {
                permissionNames.add(permission.getName());
            }
            info.setStringPermissions(permissionNames);
        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        // null username is invalid
        if (username == null) {
            throw new AccountException("Null username are not allowed by this realm.");
        }
        //find user by username
        User user = userHandler.findByUsername(username);
        if (ObjectUtils.isEmpty(user)) {
            throw new UnknownAccountException("No account found for user [" + username + "]");
        }
        //simple auth info
        return new SimpleAuthenticationInfo(username, user.getPassword().toCharArray(), getName());
    }
}
