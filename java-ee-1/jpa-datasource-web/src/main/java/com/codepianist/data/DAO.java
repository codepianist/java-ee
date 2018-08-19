package com.codepianist.data;

import com.codepianist.model.entities.DefaultIDTrackableAndCommentedEntity;

import java.util.List;

public interface DAO<T extends DefaultIDTrackableAndCommentedEntity> {

    void create(T t);
    void update(Long id, T t);
    void remove(Long id);
    List<T> listAll();

}
