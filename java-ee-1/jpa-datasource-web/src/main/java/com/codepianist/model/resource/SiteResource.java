package com.codepianist.model.resource;

import com.codepianist.model.Site;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement
public class SiteResource implements Site {

    private String URL;
    private String loginURL;
    private List<TagResource> tags;

}
