package com.codepianist.model;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Credentials credentials;
    private List<Site> sites;
    private List<Tag> tags;

}
