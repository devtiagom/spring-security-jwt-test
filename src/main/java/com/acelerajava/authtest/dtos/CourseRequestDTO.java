package com.acelerajava.authtest.dtos;

import com.acelerajava.authtest.domain.Course;

import java.io.Serializable;

public class CourseRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer workload;

    public CourseRequestDTO() {}

    public CourseRequestDTO(Course course) {
        this.name = course.getName();
        this.workload = course.getWorkload();
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
