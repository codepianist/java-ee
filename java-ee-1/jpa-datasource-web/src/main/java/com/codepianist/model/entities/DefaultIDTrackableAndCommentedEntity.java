package com.codepianist.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Data
@MappedSuperclass
public abstract class DefaultIDTrackableAndCommentedEntity implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    protected Long id;

    @Lob
    private String comments;

    @Column(name = "modificationDate", columnDefinition = "timestamp not null default current_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    protected Calendar modificationDate;

    @Column(name = "creationDate")
    @Temporal(TemporalType.TIMESTAMP)
    protected Calendar creationDate= Calendar.getInstance();

}