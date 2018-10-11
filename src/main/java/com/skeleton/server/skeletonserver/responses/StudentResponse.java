package com.skeleton.server.skeletonserver.responses;

public class StudentResponse {
    public final Long id;
    public final String name;

    public StudentResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
