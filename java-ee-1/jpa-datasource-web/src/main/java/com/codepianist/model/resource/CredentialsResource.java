package com.codepianist.model.resource;

import com.codepianist.model.Credentials;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class CredentialsResource implements Credentials {

    private String user;
    private String password;

}
