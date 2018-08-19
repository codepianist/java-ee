package com.codepianist.model;


import lombok.Data;

import java.util.List;

@Data
public class Site {

    private String mainURL;
    private String loginURL;
    private List<Tag> tags;

}
