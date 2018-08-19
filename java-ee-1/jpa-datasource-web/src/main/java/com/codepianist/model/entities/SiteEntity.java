package com.codepianist.model.entities;

import com.codepianist.model.Site;
import lombok.Data;

import java.util.List;

@Data
public class SiteEntity implements Site {

    private String URL;
    private String loginURL;
    private List<TagEntity> tags;

}
