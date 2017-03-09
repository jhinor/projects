package com.github.jhinor.authority.repository;

import com.github.jhinor.authority.bean.Permission;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author shiyu.long
 */
public interface PermissionRepository extends BaseRepository<Permission, Integer> {
    @Query("select distinct p from Permission p join p.roles r join r.users u where u.username=?1")
    List<Permission> findByUsername(String username);
}
