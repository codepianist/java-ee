package com.codepianist.model;

import com.codepianist.model.entities.SiteEntity;
import com.codepianist.model.entities.TagEntity;
import com.codepianist.model.resource.SiteResource;
import com.codepianist.model.resource.TagResource;

import java.util.List;
import java.util.stream.Collectors;

public interface Site {

    String getURL();
    String getLoginURL();
    List<? extends Tag> getTags();

    static SiteResource toSiteResource(Site site){
        SiteResource siteResource= new SiteResource();
        siteResource.setLoginURL(site.getLoginURL());
        siteResource.setURL(site.getURL());
        List<TagResource> tags= site.getTags().stream()
                .map(Tag::toTagResource)
                .collect(Collectors.toList());
        siteResource.setTags(tags);
        return siteResource;
    }

    static SiteEntity toSiteEntity(Site site){
        SiteEntity siteEntity= new SiteEntity();
        siteEntity.setLoginURL(site.getLoginURL());
        siteEntity.setURL(site.getURL());
        List<TagEntity> tags= site.getTags().stream()
                .map(Tag::toTagEntity)
                .collect(Collectors.toList());
        siteEntity.setTags(tags);
        return siteEntity;
    }

}
