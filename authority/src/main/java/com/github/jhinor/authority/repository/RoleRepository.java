package com.github.jhinor.authority.repository;

import com.github.jhinor.authority.bean.Role;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author shiyu.long
 */
public interface RoleRepository extends BaseRepository<Role, Integer> {
    @Query("select distinct r from Role r join r.users u where u.username=?1")
    List<Role> findByUsername(String username);
}
