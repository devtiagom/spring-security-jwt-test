package com.acelerajava.authtest.services;

import com.acelerajava.authtest.domain.Course;
import com.acelerajava.authtest.dtos.CourseRequestDTO;
import com.acelerajava.authtest.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course findById(Long id) {
        return courseRepository.findById(id).get();
    }

    public Course save(CourseRequestDTO courseRequestDTO) {
        return courseRepository.save(fromDTO(courseRequestDTO));
    }

    private Course fromDTO(CourseRequestDTO courseRequestDTO) {
        return new Course(null, courseRequestDTO.getName(), courseRequestDTO.getWorkload());
    }
}
