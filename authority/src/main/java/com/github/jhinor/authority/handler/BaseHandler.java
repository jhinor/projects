package com.github.jhinor.authority.handler;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

/**
 * @author shiyu.long
 */
public interface BaseHandler<T, ID extends Serializable> {
    T save(T t);

    T saveAndFlush(T t);

    List<T> save(Iterable<T> entities);

    void delete(T t);

    void delete(ID id);

    void deleteAll();

    void deleteAllInBatch();

    void delete(Iterable<T> entities);

    void deleteInBatch(Iterable<T> entities);

    T findOne(ID id);

    T findOne(Specification<T> spec);

    List<T> findAll();

    List<T> findAll(Iterable<ID> ids);

    List<T> findAll(Sort sort);

    Page<T> findAll(Pageable pageable);

    Page<T> findAll(Specification<T> spec, Pageable pageable);

    List<T> findAll(Specification<T> spec);

    List<T> findAll(Specification<T> spec, Sort sort);

    Long count();

    Long count(Specification<T> spec);

    boolean exists(ID id);
}
