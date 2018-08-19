package com.codepianist.test.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Task implements Serializable{

    private String name;
    private Integer complexity;
    private Integer time;
    private Task father;

}
