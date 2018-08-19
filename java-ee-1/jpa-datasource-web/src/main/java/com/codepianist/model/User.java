package com.codepianist.model;

import com.codepianist.model.entities.SiteEntity;
import com.codepianist.model.entities.TagEntity;
import com.codepianist.model.entities.UserEntity;
import com.codepianist.model.resource.CredentialsResource;
import com.codepianist.model.resource.SiteResource;
import com.codepianist.model.resource.TagResource;
import com.codepianist.model.resource.UserResource;

import java.util.List;
import java.util.stream.Collectors;

public interface User {

    String getName();
    Credentials getCredentials();
    List<? extends Site> getSites();
    List<? extends Tag> getTags();

    static UserResource toUserResponse(User user){
        UserResource userResource= new UserResource();
        userResource.setName(user.getName());
        CredentialsResource credentialsResource= Credentials.toCredentialsResource(user.getCredentials());
        userResource.setCredentials(credentialsResource);
        List<SiteResource> siteResources= user.getSites().stream()
                .map(Site::toSiteResource)
                .collect(Collectors.toList());
        userResource.setSites(siteResources);
        List<TagResource> tagResources= user.getTags().stream()
                .map(Tag::toTagResource)
                .collect(Collectors.toList());
        userResource.setTags(tagResources);
        return userResource;
    }

    static UserEntity toUserEntity(User user){
        UserEntity userEntity= new UserEntity();
        userEntity.setName(user.getName());
        CredentialsResource credentialsResource= Credentials.toCredentialsResource(user.getCredentials());
        userEntity.setCredentials(credentialsResource);
        List<SiteEntity> siteEntities= user.getSites().stream()
                .map(Site::toSiteEntity)
                .collect(Collectors.toList());
        userEntity.setSites(siteEntities);
        List<TagEntity> tagEntities= user.getTags().stream()
                .map(Tag::toTagEntity)
                .collect(Collectors.toList());
        userEntity.setTags(tagEntities);
        return userEntity;
    }

}
