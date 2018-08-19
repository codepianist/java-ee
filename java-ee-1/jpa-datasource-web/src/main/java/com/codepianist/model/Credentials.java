package com.codepianist.model;

import com.codepianist.model.entities.CredentialsEntity;
import com.codepianist.model.resource.CredentialsResource;

public interface Credentials {

    String getUser();
    String getPassword();

    static CredentialsResource toCredentialsResource(Credentials credentials){
        CredentialsResource credentialsResource= new CredentialsResource();
        credentialsResource.setUser(credentials.getUser());
        credentialsResource.setPassword(credentials.getPassword());
        return credentialsResource;
    }

    static CredentialsEntity toCredentialsEntity(Credentials credentials){
        CredentialsEntity credentialsEntity= new CredentialsEntity();
        credentialsEntity.setUser(credentials.getUser());
        credentialsEntity.setPassword(credentials.getPassword());
        return credentialsEntity;
    }

}
