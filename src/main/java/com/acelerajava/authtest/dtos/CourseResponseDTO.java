package com.acelerajava.authtest.dtos;

import com.acelerajava.authtest.domain.Course;

import java.io.Serializable;

public class CourseResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Integer workload;

    public CourseResponseDTO() {}

    public CourseResponseDTO(Course course) {
        this.id = course.getId();
        this.name = course.getName();
        this.workload = course.getWorkload();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }
}
