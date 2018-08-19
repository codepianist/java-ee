package com.codepianist.model.entities;

import com.codepianist.model.Credentials;
import com.codepianist.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor
public class UserEntity extends DefaultIDTrackableAndCommentedEntity implements User {

    private String name;
    private Credentials credentials;
    private List<SiteEntity> sites;
    private List<TagEntity> tags;

}
