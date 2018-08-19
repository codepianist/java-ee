package com.codepianist.model.resource;

import com.codepianist.model.Site;
import com.codepianist.model.Tag;
import com.codepianist.model.User;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@Data
public class UserResource implements User {

    private String name;
    private CredentialsResource credentials;
    private List<? extends Site> sites;
    private List<? extends Tag> tags;

}
