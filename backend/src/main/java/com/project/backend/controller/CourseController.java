package com.project.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Course;
import com.project.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;

    // Ambos são iguais
    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

    // @PostMapping
    // public ResponseEntity<Course> create(@RequestBody Course course) {
    // return ResponseEntity.status(HttpStatus.CREATED)
    // .body(courseRepository.save(course));
    // }
    // AMBOS SÃO IGUAIS, PORÉM COM ResponseEntity É MELHOR PARA MANIPULAR RETORNO
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    // @DeleteMapping
    // public ResponseEntity<Course> create(@RequestBody Course course) {
    // return ResponseEntity
    // .status(HttpStatus.)
    // .body(courseRepository.save(course));
    // }
}
