package com.codepianist.model;

import com.codepianist.model.entities.TagEntity;
import com.codepianist.model.resource.TagResource;

public interface Tag {

    String getName();

    static TagResource toTagResource(Tag tag){
        final TagResource tagResource= new TagResource();
        tagResource.getName();
        return tagResource;
    }

    static TagEntity toTagEntity(Tag tag){
        final TagEntity tagEntity= new TagEntity();
        tagEntity.getName();
        return tagEntity;
    }

}
