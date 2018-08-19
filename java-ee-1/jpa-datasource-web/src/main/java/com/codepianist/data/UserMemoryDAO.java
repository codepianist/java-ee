package com.codepianist.data;

import com.codepianist.model.entities.UserEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class UserMemoryDAO implements DAO<UserEntity> {

    private static final AtomicLong ID_GENERATOR = new AtomicLong();
    private Map<Long, UserEntity> database= new HashMap<>();

    public void create(UserEntity user){
        final Long id= ID_GENERATOR.incrementAndGet();
        user.setId(id);
        database.put(id, user);
    }

    public void update(Long id, UserEntity user){
        database.put(id, user);
    }

    public void remove(Long id){
        database.remove(id);
    }

    public List<UserEntity> listAll(){
        return new ArrayList(database.values());
    }


}
