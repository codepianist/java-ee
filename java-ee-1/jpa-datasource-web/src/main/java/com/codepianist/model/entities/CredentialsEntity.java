package com.codepianist.model.entities;

import com.codepianist.model.Credentials;
import lombok.Data;

@Data
public class CredentialsEntity extends DefaultIDTrackableAndCommentedEntity implements Credentials {

    private String user;
    private String password;

}
