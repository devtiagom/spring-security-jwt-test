package com.acelerajava.authtest.services;

import com.acelerajava.authtest.domain.Course;
import com.acelerajava.authtest.domain.User;
import com.acelerajava.authtest.repositories.CourseRepository;
import com.acelerajava.authtest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CourseRepository courseRepository;

    public void instantiateTestDatabase() {
        User user01 = new User(null, "Fulano de Tal", "fulano.tal@gmail.com", "123456");
        User user02 = new User(null, "Ciclano de Tal", "ciclano.tal@gmail.com", "654321");
        User user03 = new User(null, "Beltrana de Tal", "beltrana.tal@gmail.com", "2345678");
        userRepository.saveAll(Arrays.asList(user01, user02, user03));

        Course course01 = new Course(null, "Java", 80);
        Course course02 = new Course(null, "React Native", 30);
        Course course03 = new Course(null, "Spring Framework", 35);
        courseRepository.saveAll(Arrays.asList(course01, course02, course03));
    }
}
