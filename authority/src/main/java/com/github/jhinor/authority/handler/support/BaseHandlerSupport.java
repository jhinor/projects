package com.github.jhinor.authority.handler.support;

import com.github.jhinor.authority.handler.BaseHandler;
import com.github.jhinor.authority.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author shiyu.long
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public abstract class BaseHandlerSupport<T, ID extends Serializable> implements BaseHandler<T, ID> {
    @Autowired
    protected BaseRepository<T, ID> baseRepository;

    @Transactional
    public T save(T t) {
        return baseRepository.save(t);
    }

    @Transactional
    public T saveAndFlush(T t) {
        return baseRepository.saveAndFlush(t);
    }

    @Transactional
    public List<T> save(Iterable<T> entities) {
        return baseRepository.save(entities);
    }

    @Transactional
    public void delete(T t) {
        baseRepository.delete(t);
    }

    @Transactional
    public void delete(ID id) {
        baseRepository.delete(id);
    }

    @Transactional
    public void deleteAll() {
        baseRepository.deleteAll();
    }

    @Transactional
    public void deleteAllInBatch() {
        baseRepository.deleteAllInBatch();
    }

    @Transactional
    public void delete(Iterable<T> entities) {
        baseRepository.delete(entities);
    }

    @Transactional
    public void deleteInBatch(Iterable<T> entities) {
        baseRepository.deleteInBatch(entities);
    }

    public T findOne(ID id) {
        return baseRepository.findOne(id);
    }

    public T findOne(Specification<T> spec) {
        return baseRepository.findOne(spec);
    }

    public List<T> findAll() {
        return baseRepository.findAll();
    }

    public List<T> findAll(Iterable<ID> ids) {
        return baseRepository.findAll(ids);
    }

    public List<T> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    public Page<T> findAll(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    public Page<T> findAll(Specification<T> spec, Pageable pageable) {
        return baseRepository.findAll(spec, pageable);
    }

    public List<T> findAll(Specification<T> spec) {
        return baseRepository.findAll(spec);
    }

    public List<T> findAll(Specification<T> spec, Sort sort) {
        return baseRepository.findAll(spec, sort);
    }

    public Long count() {
        return baseRepository.count();
    }

    public Long count(Specification<T> spec) {
        return baseRepository.count(spec);
    }

    public boolean exists(ID id) {
        return baseRepository.exists(id);
    }
}
