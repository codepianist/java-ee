package com.codepianist.model.resource;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

@Data @NoArgsConstructor
@XmlRootElement
public class TagResource {

    private String name;

}
