package com.acelerajava.authtest.controllers;

import com.acelerajava.authtest.domain.Course;
import com.acelerajava.authtest.domain.User;
import com.acelerajava.authtest.dtos.CourseRequestDTO;
import com.acelerajava.authtest.dtos.CourseResponseDTO;
import com.acelerajava.authtest.dtos.UserRequestDTO;
import com.acelerajava.authtest.dtos.UserResponseDTO;
import com.acelerajava.authtest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CourseResponseDTO>> getAll() {
        List<CourseResponseDTO> courseResponseDTOList = courseService
                .findAll()
                .stream()
                .map(CourseResponseDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(courseResponseDTOList);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CourseResponseDTO> getById(@PathVariable Long id) {
        CourseResponseDTO courseResponseDTO = new CourseResponseDTO(courseService.findById(id));
        return ResponseEntity.ok().body(courseResponseDTO);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody CourseRequestDTO courseRequestDTO) {
        Course course = courseService.save(courseRequestDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(course.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
