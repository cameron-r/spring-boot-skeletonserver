package com.skeleton.server.skeletonserver.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    public Long id;
    public String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {};
}
